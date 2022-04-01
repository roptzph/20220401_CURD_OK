package com.lccw.controller;

import com.lccw.mapper.UserMapper;
import com.lccw.model.User;

import lombok.var;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller  //指出是控制层
@ResponseBody  //把查询返回的对象转为JSON,并在页面渲染
@RequestMapping("/user")  //请求映射路径
public class UserController {
    @Resource  //注入接口
    private UserMapper userMapper;

    @RequestMapping("/insert")
    public int insert(User user){
        return userMapper.insertUser(user);

    }
    //List<User> 返回的是数组或集合[{...},{...}]，User返回的是一条数据{...}
    @RequestMapping("/query")
    public List<User> query(){
        return  userMapper.selectAll();
    }
    @RequestMapping("/querywhere")
    public List<User> querywhere(Integer id,String cname,Integer age,String email){
        return  userMapper.selectWhere(id,cname,age,email);
    }
    @RequestMapping("/queryid")
    public List<User> queryId(int id){
        return  userMapper.selectId(id);
    }

    @RequestMapping("/del")
    public int del(int id){
        return  userMapper.delId(id);
    }
    //update方法一：
    /*@RequestMapping("/update")
    public int update(int id,String cname,int age,String email){
        return  userMapper.updateId(id,cname,age,email);
    }*/
    //update方法二：
    @RequestMapping("/update")
    public int update(User user){
        return  userMapper.updateId(user);
    }


}
