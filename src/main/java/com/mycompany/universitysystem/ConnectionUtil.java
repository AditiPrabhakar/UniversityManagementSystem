/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DCN
 */
public class ConnectionUtil {
    public static Connection getInstance() throws SQLException
    {
        Connection conn=null;
        try {
            // register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/university_db","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
