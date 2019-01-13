package com.pingan.devopsgaopan.vo;

import lombok.Data;

@Data
public class RoleVO {

    private Integer roleId;
    private String roleName;
    private Boolean checked = false;
    private Integer departmentRoleId;
}
