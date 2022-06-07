/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.core;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 *
 * @author yanu
 */
public class ConnectionUtil {
    private static HikariDataSource dataSource;
    
    ConnectionUtil(String driverM, String db_url, String user, String pass) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driverM);
        config.setJdbcUrl(db_url);
        config.setUsername(user);
        config.setPassword(pass);
        
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setIdleTimeout(60_000);
        config.setMaxLifetime(10 * 60_000);
        
        dataSource = new HikariDataSource(config);
    }
    
    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
