/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import app.core.ConnectionUtil;
import org.junit.jupiter.api.Test;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author yanu
 */
public class ConnectionPoolTest {
    @Test
    void testHikariCP() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/login");
        config.setUsername("yanu");
        config.setPassword("yanusukakopi");
        
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(10 * 60_000);
        
        
        try (HikariDataSource dataSource = new HikariDataSource()) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
         catch(SQLException e) {
            Assertions.fail(e);
        }
    }
    
    @Test
    void testUtil() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
    }
}
