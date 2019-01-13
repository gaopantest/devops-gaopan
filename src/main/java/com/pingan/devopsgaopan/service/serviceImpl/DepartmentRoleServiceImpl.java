package com.pingan.devopsgaopan.service.serviceImpl;

import com.pingan.devopsgaopan.entity.DepartmentRole;
import com.pingan.devopsgaopan.mapper.DepartmentMapper;
import com.pingan.devopsgaopan.mapper.DepartmentRoleMapper;
import com.pingan.devopsgaopan.service.DepartmentRoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentRoleServiceImpl implements DepartmentRoleService {

    @Autowired
    private DepartmentRoleMapper departmentRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(com.pingan.devopsgaopan.entity.DepartmentRole record) {
        return 0;
    }

    @Override
    public com.pingan.devopsgaopan.entity.DepartmentRole selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<com.pingan.devopsgaopan.entity.DepartmentRole> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(com.pingan.devopsgaopan.entity.DepartmentRole record) {
        return 0;
    }

    @Override
    public List<DepartmentRole> selectDeptRoleListByDeptId(Integer id) {
        return departmentRoleMapper.selectDeptRoleListByDeptId(id);
    }
}
