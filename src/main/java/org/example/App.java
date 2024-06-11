package org.example;

import java.sql.Connection;
import java.sql.SQLException;

import static org.example.MariaDBConection.getConnection;

public class App {

    public static void main (String[] args) {
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Conexión exitosa a MariaDB!");
            } else {
                System.out.println("Fallo en la conexión a MariaDB.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

       new Login();
    }
}

