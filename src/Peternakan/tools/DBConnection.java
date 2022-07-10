/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Peternakan.tools;

import java.sql.*;


/**
 *
 * @author Administrator
 */
public class DBConnection {
    public Connection create_connection(){
    String url = "jdbc:mysql://localhost/ternak";
    String username = "root";
    String password = "";
    
    try{
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    return null;
  }
}
