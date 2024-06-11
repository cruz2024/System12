package org.example;

import java.sql.*;

public class MariaDBConection {

        private static String url = "jdbc:mariadb://localhost:3316/Tienda_Cell";
        private static String user = "mi_usuario";
        private static String password = "mi_contraseña";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url, user, password);
        }

}

