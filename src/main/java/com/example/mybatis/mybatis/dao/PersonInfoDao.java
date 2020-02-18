package com.example.mybatis.mybatis.dao;

import com.example.mybatis.mybatis.bean.PersonInfo;

import java.util.List;

public interface PersonInfoDao {

    Integer addBean(PersonInfo personInfo);

    List<PersonInfo> queryList();
}
