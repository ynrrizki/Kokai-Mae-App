package app.core;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static final String driverM =   Source.driverM,
                                db_url  =   Source.db_url,
                                user    =   Source.user,
                                pass    =   Source.pass;
    
    private static Database _instance;
    
    private static Connection _conn;
    public String _query;
    private Statement _statement;
    private ResultSet _result;
    
    Database() throws SQLException {
        try {
            Class.forName(driverM);
            _conn = DriverManager.getConnection(db_url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Database getInstance() throws SQLException {
        if(_instance == null) {
            return _instance = new Database();
        }
        return _instance;
    }
    
    public ResultSet query(String query) throws SQLException {
        this.run();
        return _result = _statement.executeQuery(query);
    }
    
    public void run() throws SQLException {
        _statement = _conn.createStatement();
    }
    
}
