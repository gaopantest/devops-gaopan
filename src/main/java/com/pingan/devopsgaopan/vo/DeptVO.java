package com.pingan.devopsgaopan.vo;

import com.pingan.devopsgaopan.entity.Department;
import lombok.Data;

import java.util.List;

@Data
public class DeptVO {
    private Department department;
    List<RoleVO> roleVOList;
}
