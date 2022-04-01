package com.lccw.service.Impl;

import com.lccw.mapper.UserMapper;
import com.lccw.model.User;
import com.lccw.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public List<User> selectAll(){
        return userMapper.selectAll();
    }
    public List<User> selectWhere(Integer id,String cname,Integer age,String email){
        return userMapper.selectWhere(id,cname,age,email);
    }
    public List<User> selectId(int id){
        return userMapper.selectId(id);
    }

    public int delId(int id){
        return userMapper.delId(id);

     }

    /*public int updateId(int id,String cname,int age,String email){
        return userMapper.updateId(id,cname,age,email);
    }*/
    public int updateId(User user){
        return userMapper.updateId(user);
    }


}
