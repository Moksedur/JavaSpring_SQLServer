/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datavisionbd.javaspring_sqlserver;

import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Md. Moksedur Rahman
 */
public class JdbcMsSql {
    	public static void main(String[] args) {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=NitgenAccessManager;user=sa;password=sa";

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM NGAC_AUTHLOG";
            ResultSet rs = stmt.executeQuery(SQL);
//System.out.println("In !");
            // Iterate through the data in the result set and display it.
            while (rs.next()) {
               System.out.println(rs.getString("UserIDIndex") + " " + rs.getString("TransactionTime"));
//System.out.println("Found !");
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
