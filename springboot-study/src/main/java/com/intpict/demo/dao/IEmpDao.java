package com.intpict.demo.dao;

import com.intpict.demo.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IEmpDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer id);

    List<Emp> selectByName(@Param("name") String name, @Param("tableName") String tableName);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}