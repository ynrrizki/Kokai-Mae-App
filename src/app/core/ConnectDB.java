package app.core;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectDB {
    private static final String driverM =   Source.driverM,
                                db_url  =   Source.db_url,
                                user    =   Source.user,
                                pass    =   Source.pass;
    
    private static Connection _conn;
    
    ConnectDB() throws SQLException {
        try {
            Class.forName(driverM);
            _conn = DriverManager.getConnection(db_url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
