package app.core;

import java.sql.*;


public class Database {
    static Connection con;
    
    public static Connection getKoneksi(){
        if(con == null){
            try{
                String url = "jdbc:mysql://localhost/kokai_mae_app";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url,username,password);
                System.out.println("Koneksi Berhasil");
            }catch(SQLException e){
                System.out.println("koneksi gagal");
            }
        }
        return con;
    }
}
