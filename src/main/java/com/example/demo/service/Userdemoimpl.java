package com.example.demo.service;

import com.example.demo.config.ConnectionManger;
import com.example.demo.dao.Userdemodao;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
@Component
public class Userdemoimpl implements Userdemodao {
    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getAllUser() throws ClassNotFoundException, SQLException {

         String DBURL = "jdbc:mysql://localhost:3306/datatheanh";
         String USERNAME ="root";
         String PASSWORK ="";
        List<User> users = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DBURL,USERNAME,PASSWORK);
        Statement sqlt = conn.createStatement();
        ResultSet rs = sqlt.executeQuery("select * from User");
        while (rs.next()){
            User user = new User();
            user.setId(rs.getInt(1));
            user.setUsername(rs.getString(2));
            user.setUserage(rs.getInt(3));
            users.add(user);

        }
        return users;
    }

    @Override
    public User postUserDemo() {
        return null;
    }

    @Override
    public User putUserDemo() {
        return null;
    }

    @Override
    public User deleteUserDemo() {
        return null;
    }
}
