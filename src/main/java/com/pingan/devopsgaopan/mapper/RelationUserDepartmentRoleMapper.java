package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RelationUserDepartmentRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelationUserDepartmentRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationUserDepartmentRole record);

    RelationUserDepartmentRole selectByPrimaryKey(Integer id);

    List<RelationUserDepartmentRole> selectAll();

    int updateByPrimaryKey(RelationUserDepartmentRole record);

    List<RelationUserDepartmentRole> selectUserDeptRoleByUserId(Integer userId);

    void deleteUserDeptRoleRealByUserIdAndDeptId(@Param("userId") Integer userId, @Param("id") Integer id);

    int addRelationUserDepartmentRoleReal(RelationUserDepartmentRole relationUserDepartmentRole);
}