package com.pingan.devopsgaopan.mapper;

import com.pingan.devopsgaopan.entity.Operation;
import java.util.List;

public interface OperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operation record);

    Operation selectByPrimaryKey(Integer id);

    List<Operation> selectAll();

    int updateByPrimaryKey(Operation record);
}