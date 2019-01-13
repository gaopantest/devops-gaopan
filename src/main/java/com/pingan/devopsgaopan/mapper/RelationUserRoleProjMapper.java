package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RelationUserRoleProj;
import java.util.List;

public interface RelationUserRoleProjMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationUserRoleProj record);

    RelationUserRoleProj selectByPrimaryKey(Integer id);

    List<RelationUserRoleProj> selectAll();

    int updateByPrimaryKey(RelationUserRoleProj record);
}