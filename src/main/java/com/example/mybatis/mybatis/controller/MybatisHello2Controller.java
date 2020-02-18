package com.example.mybatis.mybatis.controller;

import com.example.mybatis.mybatis.bean.PersonInfo;
import com.example.mybatis.mybatis.bean.User;
import com.example.mybatis.mybatis.dao.PersonInfoDao;
import com.example.mybatis.mybatis.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/hello2")
@Controller
public class MybatisHello2Controller {

    //springboot 有日志启动器，配置好日志路径即可用，默认是slfj4 + logback
    private static Logger LOG = LoggerFactory.getLogger(MybatisHello2Controller.class);

    @Autowired
    PersonInfoDao personInfoDao;

    @ResponseBody
    @GetMapping("/add")
    //@PathVariable 指定某个值，restful风格必须
    public Integer  add() {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("zhangsan");
        personInfo.setAge(32);
        personInfo.setSex(1);
        personInfo.setStatus(1);
        personInfo.setMobile(12324);
        return personInfoDao.addBean(personInfo);
    }


    @ResponseBody
    @GetMapping("/queryList")
    //@PathVariable 指定某个值，restful风格必须
    public List<PersonInfo>  queryList() {
        return personInfoDao.queryList();
    }

}
