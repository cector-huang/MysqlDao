/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cector.mysqldao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 *
 * @author cector
 */
public class DBUtils {
    public static String url;
    public static String username;
    public static String password;
    public static String driver;
    
    //该类是数据库的工具类，不需要实例化
    private static ResourceBundle rb = ResourceBundle.getBundle("com.cector.mysqldao.dn-config");
    
    //静态代码类加载驱动
    static{
        url=rb.getString("jdbc.url");
        username=rb.getString("jdbc.username");
        password=rb.getString("jdbc.password");
        driver=rb.getString("jdbc.driver");
        
        try{
            Class.forName(driver);//加载驱动类
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    private DBUtils(){}
    
    public static Connection getConnection()
    {
        Connection conn=null;
        try
        {
            conn = DriverManager.getConnection(url, username, password);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void close(ResultSet rs, Statement stat, Connection conn)
    {
        try
        {
            if(rs!=null)
                rs.close();
            if(stat!=null)
                stat.close();
            if(conn!=null)
                conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
}
