package com.lccw;

import com.lccw.mapper.UserMapper;
import com.lccw.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Curd0331ApplicationTests {
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        //template模板，拿来即用
        connection.close();
    }
    @Resource
    UserMapper userMapper;
    @Test
    public void toTest(){
        List<User> userLogins = userMapper.selectAll();

        userLogins.forEach(e-> System.out.println(e));
        System.out.println(userLogins);
    }

}
