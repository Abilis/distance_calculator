package ru.distance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Abilis on 13.04.2016.
 */
public class DbHelper {

    private static final String URL = "jdbc:mysql://localhost:3306/distance-calculator?autoReconnect=true&userSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static DbHelper dbHelper;
    private static Connection connection;

    private DbHelper() {

    }

    public static DbHelper getDbHelper() {

        if (dbHelper == null) {
            dbHelper = new DbHelper();
        }
        return dbHelper;
    }

    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
