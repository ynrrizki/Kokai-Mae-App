/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import app.core.ConnectionUtil;
import app.core.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.Test;

/**
 *
 * @author yanu
 */
public class StatementTest {
    private static Database instance;
    StatementTest() {
        instance = Database.getInstance();
    }
    
    @Test
    void testCreateStatement() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        
        Statement statement = connection.createStatement();
        
        statement.close();
        connection.close();
    }
    
//    @Test
//    void testExecuteUpdate() throws SQLException {
//        Connection connection = ConnectionUtil.getDataSource().getConnection();
//        
//        Statement statement = connection.createStatement();
//        
//        String sql = "INSERT INTO to_login VALUES(null, 'yan', 'yanto', '123')";
//        int update = statement.executeUpdate(sql);
//        System.out.println(update);
//        statement.close();
//        connection.close();
//    }
    
//    @Test
//    void testExecuteUpdateDelete() throws SQLException {
//        Connection connection = ConnectionUtil.getDataSource().getConnection();
//        
//        Statement statement = connection.createStatement();
//        
//        String sql = "DELETE FROM to_login";
//        int update = statement.executeUpdate(sql);
//        System.out.println(update);
//        statement.close();
//        connection.close();
//    }
    
//    @Test
//    void testExecuteQuery() throws SQLException {
//        Connection connection = ConnectionUtil.getDataSource().getConnection();
//        
//        Statement statement = connection.createStatement();
//        
//        String sql = "SELECT * FROM to_login";
//        ResultSet resultSet = statement.executeQuery(sql);
//   
//        resultSet.close();
//        statement.close();
//        connection.close();
//    }
//    
    @Test
    void testExecuteUpdate() {
        var sql = instance.queryUpdate("INSERT INTO to_login VALUES (null, 'yan', 'yanti', '123')");
        instance.closeStatement();
        instance.closeConn();
    }
    
    @Test
    void testExecuteQuery() throws SQLException {
        var sql = instance.query("SELECT * FROM user WHERE username = 'salah' AND password = 'salah'");
        
        while(sql.next()) {
            System.out.println(sql.getRow());
        }
        
        instance.closeResultSet();
        instance.closeStatement();
        instance.closeConn();
    }
    
    @Test
    void testCountRecord() throws SQLException {
        var sql = instance.query("SELECT * FROM user");
        System.out.println("=============");
        System.out.println(sql.getFetchSize());
        System.out.println("=============");
        instance.closeStatement();
        instance.closeConn();
    }
}
