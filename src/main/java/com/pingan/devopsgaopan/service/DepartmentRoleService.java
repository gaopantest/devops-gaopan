package com.pingan.devopsgaopan.service;

import com.pingan.devopsgaopan.entity.DepartmentRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentRoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(com.pingan.devopsgaopan.entity.DepartmentRole record);

    com.pingan.devopsgaopan.entity.DepartmentRole selectByPrimaryKey(Integer id);

    List<com.pingan.devopsgaopan.entity.DepartmentRole> selectAll();

    int updateByPrimaryKey(com.pingan.devopsgaopan.entity.DepartmentRole record);

    List<DepartmentRole> selectDeptRoleListByDeptId(Integer id);
}
