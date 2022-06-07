package app.core;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static final String driverM =   Source.driverM,
                                db_url  =   Source.db_url,
                                user    =   Source.user,
                                pass    =   Source.pass;
    private static ConnectionUtil _connUtil = new ConnectionUtil(driverM, db_url, user, pass);
    private Connection _conn;
    private static Database _instance = null;
    private Statement _statement;
    private ResultSet _resultSet;
    private int _resultUpdate;
    
    Database(){
        try {
            _conn = _connUtil.getDataSource().getConnection();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Database getInstance() {
        if(_instance == null) {
            return _instance = new Database();
        }
        return _instance;
    }
    
    public int queryUpdate(String query) {
        try {
           this.run();
           _resultUpdate = _statement.executeUpdate(query);
           return _resultUpdate; 
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return _resultUpdate;
    }
    
    public ResultSet query(String query) {
        try {
            this.run();
            _resultSet = _statement.executeQuery(query);
            return _resultSet;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return _resultSet = null;
    }
    
    public void run() {
        try {
            _statement = _conn.createStatement();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void closeConn() {
        try {
            _conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeStatement() {
        try {
            _statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeResultSet() {
        try {
            _resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
