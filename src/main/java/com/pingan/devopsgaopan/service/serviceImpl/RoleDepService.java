package com.pingan.devopsgaopan.service.serviceImpl;

import com.pingan.devopsgaopan.entity.RoleDep;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleDepService {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleDep record);

    RoleDep selectByPrimaryKey(Integer id);

    List<RoleDep> selectAll();

    int updateByPrimaryKey(RoleDep record);
}
