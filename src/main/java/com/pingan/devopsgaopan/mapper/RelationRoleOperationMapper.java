package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.RelationRoleOperation;
import java.util.List;

public interface RelationRoleOperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelationRoleOperation record);

    RelationRoleOperation selectByPrimaryKey(Integer id);

    List<RelationRoleOperation> selectAll();

    int updateByPrimaryKey(RelationRoleOperation record);
}