package com.pingan.devopsgaopan.controller;


import com.alibaba.fastjson.JSON;
import com.pingan.devopsgaopan.entity.*;
import com.pingan.devopsgaopan.service.DepartmentRoleService;
import com.pingan.devopsgaopan.service.DepartmentService;
import com.pingan.devopsgaopan.service.RelationUserDepartmentRoleService;
import com.pingan.devopsgaopan.service.UserService;
import com.pingan.devopsgaopan.service.serviceImpl.RoleDepService;
import com.pingan.devopsgaopan.vo.DeptVO;
import com.pingan.devopsgaopan.vo.RoleVO;
import com.pingan.devopsgaopan.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;

@Api("用户接口")
@Slf4j
@RestController
@RequestMapping("/sys/auth")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentRoleService departmentRoleService;
    @Autowired
    private RoleDepService roleDepService;
    @Autowired
    private RelationUserDepartmentRoleService relationUserDepartmentRoleService;

    @ApiOperation("查询所有用户")
    @GetMapping("/queryUsers")
    public List<User> queryAllUsers(){
        log.info("-----开始查询所有用户");
        return userService.selectAll();
    }

    @ApiOperation("修改用户")
    @PostMapping("/updateUser")
    public void updateUser(User user) {
        log.info("-------开始修改用户");
        userService.updateByPrimaryKey(user);
    }

    @ApiOperation("添加用户")
    @PostMapping("/addUser")
    public void addUser(User user) {
        log.info("-------开始添加用户");
        userService.insert(user);
    }

    @ApiOperation("通过用户id查询用户对应的部门和角色信息")
    @GetMapping("queryDeptRolesByUserId/{userId}")
    public List<DeptVO> queryDeptRolesByUserId(@PathVariable Integer userId) {
        log.info("--------查找id为：{}的用户的部门及角色信息：",userId);

        //查询出当前用户的部门列表
        List<Department> departmentList =
                departmentService.selectUserDeptListByUserId(userId);

        //当前用户下所有部门所对应的角色全部标记为未选择
        UserVO userVO = new UserVO();
        userVO.setUserId(userId);
        List<DeptVO> deptVOList = new ArrayList<>();

        for (Department department : departmentList) {
            DeptVO deptVO = new DeptVO();
            deptVO.setDepartment(department);

            List<DepartmentRole> departmentRoleList =
                    departmentRoleService.selectDeptRoleListByDeptId(department.getId());
            ArrayList<RoleVO> roleVolist = new ArrayList<>();
            for (DepartmentRole departmentRole : departmentRoleList) {
                RoleVO roleVO = new RoleVO();
                RoleDep roleDep = roleDepService.selectByPrimaryKey(departmentRole.getRoleId());
                roleVO.setRoleId(roleDep.getId());
                roleVO.setRoleName(roleDep.getName());
                roleVO.setDepartmentRoleId(departmentRole.getId());
                roleVolist.add(roleVO);
            }

            deptVO.setRoleVOList(roleVolist);
            deptVOList.add(deptVO);
        }
        userVO.setDeptVOList(deptVOList);

        log.info("空userVO:{}", JSON.toJSONString(userVO));

        //将当前用户的部门所对应的角色进行标记
        List<RelationUserDepartmentRole> relationUserDepartmentRoleList =
                relationUserDepartmentRoleService.selectUserDeptRoleByUserId(userId);
        for (RelationUserDepartmentRole relationUserDepartmentRole : relationUserDepartmentRoleList) {
            List<DeptVO> deptVOList1 = userVO.getDeptVOList();
            for (DeptVO deptVO : deptVOList1) {
                List<RoleVO> roleVOList = deptVO.getRoleVOList();
                for (RoleVO roleVO : roleVOList) {
                    if (relationUserDepartmentRole.getDepartmentRoleId().equals(roleVO.getDepartmentRoleId()) &&
                            relationUserDepartmentRole.getUserId().equals(userId)) {
                        roleVO.setChecked(true);
                    }
                }
            }
        }
        return deptVOList;
    }


    @ApiOperation("对选中的用户配置部门及角色")
    @RequestMapping(value = "/addUserDeptRoleReal/{userId}", method = RequestMethod.POST)
    public void addUserDepteRoleReal(@PathVariable(required = true) Integer userId,
                                     @PathVariable List<DeptVO> deptVOList) {
        if (deptVOList == null || deptVOList.size() < 1) {
            return;
        }

        for (DeptVO deptVO : deptVOList) {
            Department department = deptVO.getDepartment();
            //对当前用户下面的角色进行删除
            relationUserDepartmentRoleService.deleteUserDeptRoleRealByUserIdAndDeptId
                    (userId, department.getId());

            List<RoleVO> roleVOList = deptVO.getRoleVOList();
            for (RoleVO roleVO : roleVOList) {
                RelationUserDepartmentRole relationUserDepartmentRole = new RelationUserDepartmentRole();
                relationUserDepartmentRole.setUserId(userId);
                relationUserDepartmentRole.setDepartmentRoleId(roleVO.getDepartmentRoleId());
                if(relationUserDepartmentRole.getUserId().equals(userId)){
                    roleVO.setChecked(true);
                }
                int count = relationUserDepartmentRoleService.addRelationUserDepartmentRoleReal(relationUserDepartmentRole);
            }
        }





    }
}
