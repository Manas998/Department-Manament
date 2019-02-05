/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author manas singh
 */
public class MySqlConnection {
    Connection conn = null;
    public static Connection ConnectDB()
    {
       try{
       Class.forName("com.mysql.jdbc.Driver");
                           // here "localhost/" ke baad me database ka naam lekhte hai got it
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adminlogin","root","root");
      
       return conn;
       }
    catch(Exception e){
     
           JOptionPane.showMessageDialog(null, e);
           
           return null;
    }   
           
    }
    
}
