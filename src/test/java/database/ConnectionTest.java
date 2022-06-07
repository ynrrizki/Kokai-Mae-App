/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author yanu
 */
public class ConnectionTest {
    
    @BeforeAll
    static void beforeAll() {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @Test
    void testConnection() {
        String jdbcUrl  = "jdbc:mysql://localhost:3306/login";
        String username = "yanu";
        String pass     = "yanusukakopi";
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, pass);
            System.out.println("Sukses mengkoneksikan ke database");
        } catch (SQLException ex) {
            Assertions.fail(ex);
        }
    }
    
    @Test
    void testConnectionClose() {
        String jdbcUrl  = "jdbc:mysql://localhost:3306/login";
        String username = "yanu";
        String pass     = "yanusukakopi";
        try(Connection connection = DriverManager.getConnection(jdbcUrl, username, pass)) {
            System.out.println("Sukses mengkoneksikan ke database");
        } catch (SQLException ex) {
            Assertions.fail(ex);
        }
    }
}
