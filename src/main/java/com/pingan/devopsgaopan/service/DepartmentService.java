package com.pingan.devopsgaopan.service;

import com.pingan.devopsgaopan.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    Department selectByPrimaryKey(Integer id);

    List<Department> selectAll();

    int updateByPrimaryKey(Department record);

    List<Department> selectUserDeptListByUserId(Integer userId);
}
