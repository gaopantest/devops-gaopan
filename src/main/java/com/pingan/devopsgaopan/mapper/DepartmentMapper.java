package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.Department;
import java.util.List;

public interface DepartmentMapper {

    List<Department> selectUserDeptListByUserId(Integer userId);


    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    Department selectByPrimaryKey(Integer id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);
}