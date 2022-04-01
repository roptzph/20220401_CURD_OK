package com.lccw.mapper;

import com.lccw.model.User;

import java.util.List;


public interface UserMapper {


    public int insertUser(User user);
    public List<User> selectAll();
    public List<User> selectWhere(Integer id,String cname,Integer begin,Integer end,String email);

    public List<User> selectId(int id);
    public int delId(int id);
    //public int updateId(int id,String cname,int age,String email);
    public int updateId(User user);


}
