package com.example.mybatis.mybatis.dao;

import com.example.mybatis.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

//@Mapper
public interface UserDao {

    @Select("select * from user u where u.id = #{id}")
    Map<String, Object> selectUserById(@Param("id") int id);

    @Select("select * from user u where u.id = #{id}")
    User selectUserById2(@Param("id") int id);
}
