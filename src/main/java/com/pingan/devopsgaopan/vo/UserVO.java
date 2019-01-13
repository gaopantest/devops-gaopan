package com.pingan.devopsgaopan.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVO {

    private Integer userId;
    List<DeptVO> deptVOList;
}
