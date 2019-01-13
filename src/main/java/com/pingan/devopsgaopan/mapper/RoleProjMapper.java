package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RoleProj;
import java.util.List;

public interface RoleProjMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleProj record);

    RoleProj selectByPrimaryKey(Integer id);

    List<RoleProj> selectAll();

    int updateByPrimaryKey(RoleProj record);
}