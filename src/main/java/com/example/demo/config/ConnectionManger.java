package com.example.demo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManger{
    static String DBURL = "jdbc:mysql://localhost:3306/datatheanh";
    static String USERNAME ="root";
    static String PASSWORK ="";
    public static Connection conn () throws SQLException {
        return (Connection) DriverManager.getConnection(DBURL,USERNAME,PASSWORK);
    }
}
