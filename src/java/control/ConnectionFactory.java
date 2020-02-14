package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/s01","root","");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
