package com.pingan.devopsgaopan.service.serviceImpl;

import com.pingan.devopsgaopan.entity.RelationUserDepartmentRole;
import com.pingan.devopsgaopan.mapper.RelationUserDepartmentRoleMapper;
import com.pingan.devopsgaopan.service.RelationUserDepartmentRoleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RelationUserDepartmentRoleServiceImpl implements RelationUserDepartmentRoleService {

    @Autowired
    private RelationUserDepartmentRoleMapper relationUserDepartmentRoleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(RelationUserDepartmentRole record) {
        return 0;
    }

    @Override
    public RelationUserDepartmentRole selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<RelationUserDepartmentRole> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(RelationUserDepartmentRole record) {
        return 0;
    }

    @Override
    public List<RelationUserDepartmentRole> selectUserDeptRoleByUserId(Integer userId) {
        return relationUserDepartmentRoleMapper.selectUserDeptRoleByUserId(userId);
    }

    @Override
    public void deleteUserDeptRoleRealByUserIdAndDeptId(@Param("userId") Integer userId, @Param("id") Integer id) {
        relationUserDepartmentRoleMapper.deleteUserDeptRoleRealByUserIdAndDeptId(userId, id);
    }

    @Override
    public int addRelationUserDepartmentRoleReal(RelationUserDepartmentRole relationUserDepartmentRole) {
        return relationUserDepartmentRoleMapper.addRelationUserDepartmentRoleReal(relationUserDepartmentRole);
    }
}
