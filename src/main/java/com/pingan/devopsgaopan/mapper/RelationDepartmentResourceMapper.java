package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RelationDepartmentResource;
import java.util.List;

public interface RelationDepartmentResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationDepartmentResource record);

    RelationDepartmentResource selectByPrimaryKey(Integer id);

    List<RelationDepartmentResource> selectAll();

    int updateByPrimaryKey(RelationDepartmentResource record);
}