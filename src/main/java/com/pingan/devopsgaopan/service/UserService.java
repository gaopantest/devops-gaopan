package com.pingan.devopsgaopan.service;

import com.pingan.devopsgaopan.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  interface UserService {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
