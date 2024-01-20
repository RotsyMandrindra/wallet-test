package org.example.dataconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataConfig {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            String dbUrl = System.getenv("DB_URL");
            String username = System.getenv("DB_USERNAME");
            String password = System.getenv("DB_PASSWORD");

            Properties properties = new Properties();
            properties.setProperty("user", username);
            properties.setProperty("password", password);

            Connection connection = DriverManager.getConnection(dbUrl, properties);

            System.out.println("connection get successfully");
            connection.close();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
