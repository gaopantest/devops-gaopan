package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.ResourceType;
import java.util.List;

public interface ResourceTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResourceType record);

    ResourceType selectByPrimaryKey(Integer id);

    List<ResourceType> selectAll();

    int updateByPrimaryKey(ResourceType record);
}