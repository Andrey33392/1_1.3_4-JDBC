package util;

import java.sql.*;

public class Util {

    private final String URL = "jdbc:mysql://localhost:3306/myusertest";
    private final String USERNAME = "root";
    private final String PASSWORD = "3339263";

    public Connection getConnection() {
        Connection connection = null;

        try {
            Driver driver = new FebricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();

        }


        return connection;
    }
}