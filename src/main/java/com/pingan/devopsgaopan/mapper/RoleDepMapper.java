package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RoleDep;
import java.util.List;

public interface RoleDepMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleDep record);

    RoleDep selectByPrimaryKey(Integer id);

    List<RoleDep> selectAll();

    int updateByPrimaryKey(RoleDep record);
}