package com.pingan.devopsgaopan.service;

import com.pingan.devopsgaopan.entity.RelationUserDepartmentRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RelationUserDepartmentRoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationUserDepartmentRole record);

    RelationUserDepartmentRole selectByPrimaryKey(Integer id);

    List<RelationUserDepartmentRole> selectAll();

    int updateByPrimaryKey(RelationUserDepartmentRole record);

    List<RelationUserDepartmentRole> selectUserDeptRoleByUserId(Integer userId);

    void deleteUserDeptRoleRealByUserIdAndDeptId(Integer userId, Integer id);

    int addRelationUserDepartmentRoleReal(RelationUserDepartmentRole relationUserDepartmentRole);
}
