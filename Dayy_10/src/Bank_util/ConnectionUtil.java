package Bank_util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    public static Connection getDbConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank",
                "root",
                "anushka20");

        System.out.println("--connected with db-----");

        return con;
    }
}