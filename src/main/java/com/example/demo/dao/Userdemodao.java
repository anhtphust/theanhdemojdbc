package com.example.demo.dao;

import com.example.demo.model.User;

import java.sql.SQLException;
import java.util.List;

public interface Userdemodao {
    User getUserById (int id);
    List<User> getAllUser() throws ClassNotFoundException, SQLException;
    User postUserDemo();
    User putUserDemo();
    User deleteUserDemo();
}
