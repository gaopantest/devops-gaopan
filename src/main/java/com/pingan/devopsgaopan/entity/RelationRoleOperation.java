package com.pingan.devopsgaopan.entity;

import java.io.Serializable;

public class RelationRoleOperation implements Serializable {
    private Integer id;

    private Integer idRole;

    private Integer idOperation;

    private Integer idResource;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Integer getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Integer idOperation) {
        this.idOperation = idOperation;
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
        sb.append(", idRole=").append(idRole);
        sb.append(", idOperation=").append(idOperation);
        sb.append(", idResource=").append(idResource);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}