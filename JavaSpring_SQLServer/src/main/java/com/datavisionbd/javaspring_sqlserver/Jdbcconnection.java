/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datavisionbd.javaspring_sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Md. Moksedur Rahman
 */
public class Jdbcconnection {
    public static void main(String[] args) {
 
           Connection con = null;
           String conUrl = "jdbc:sqlserver://localhost; databaseName=NitgenAccessManager; user=sa; password=sa;";
 
	   try {
            // ...
	    con = DriverManager.getConnection(conUrl);
            System.out.println("Connected !");
            // ... 
   	  } catch (Exception e) { e.printStackTrace(); }
             finally {
               if (con != null) try { con.close(); } catch(Exception e) {}
             }
	}
}
