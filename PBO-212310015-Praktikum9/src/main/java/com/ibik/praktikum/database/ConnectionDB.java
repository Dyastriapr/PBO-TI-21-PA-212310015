package com.ibik.praktikum.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    
    private Connection conn;

    public Connection connect() throws SQLException {
        String hostname = "127.0.0.1:3306";
        String database = "db_pbo";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = DriverManager.getConnection("jdbc:mysql://" + hostname + "/" + database, username, password);
        return conn;
    }

    public Connection close() throws SQLException {
        conn.close();
        return conn;
    }

}