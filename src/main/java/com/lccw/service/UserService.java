package com.lccw.service;

import com.lccw.model.User;

import java.util.List;


public interface UserService {
    public int insertUser(User user);
    public List<User> selectAll();
    public List<User> selectWhere(Integer id,String cname,Integer begin,Integer end,String email);

    public List<User> selectId(int id);
    public int delId(int id);
    public int updateId(User user);
}
