package com.pingan.devopsgaopan.entity;

import java.io.Serializable;

public class RelationUserDepartmentRole implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer departmentRoleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDepartmentRoleId() {
        return departmentRoleId;
    }

    public void setDepartmentRoleId(Integer departmentRoleId) {
        this.departmentRoleId = departmentRoleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", departmentRoleId=").append(departmentRoleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}