package com.pingan.devopsgaopan.entity;

import java.io.Serializable;

public class RelationDepartmentResource implements Serializable {
    private Integer id;

    private Integer idDepartment;

    private Integer idResource;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Integer getIdResource() {
        return idResource;
    }

    public void setIdResource(Integer idResource) {
        this.idResource = idResource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", idDepartment=").append(idDepartment);
        sb.append(", idResource=").append(idResource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}