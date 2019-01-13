package com.pingan.devopsgaopan.service.serviceImpl;

import com.pingan.devopsgaopan.entity.Department;
import com.pingan.devopsgaopan.mapper.DepartmentMapper;
import com.pingan.devopsgaopan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService {


    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Department record) {
        return 0;
    }

    @Override
    public Department selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Department> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return 0;
    }

    @Override
    public List<Department> selectUserDeptListByUserId(Integer userId) {
        return departmentMapper.selectUserDeptListByUserId(userId);
    }
}
