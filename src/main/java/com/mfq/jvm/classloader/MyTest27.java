package com.mfq.jvm.classloader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ：穆繁强
 * @date ：Created in 2020/5/13 16:41
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest27 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
