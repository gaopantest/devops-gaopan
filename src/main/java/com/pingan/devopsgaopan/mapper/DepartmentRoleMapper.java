package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.DepartmentRole;
import java.util.List;

public interface DepartmentRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DepartmentRole record);

    DepartmentRole selectByPrimaryKey(Integer id);

    List<DepartmentRole> selectAll();

    int updateByPrimaryKey(DepartmentRole record);

    List<DepartmentRole> selectDeptRoleListByDeptId(Integer id);
}