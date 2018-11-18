/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datavisionbd.javaspring_sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Md. Moksedur Rahman
 */
public class Conn {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

            Connection conn=null;
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=NitgenAccessManager", "sa", "sa");

                if(conn!=null)
                    System.out.println("Database Successfully connected");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
}
