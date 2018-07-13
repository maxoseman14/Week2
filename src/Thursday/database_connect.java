package Thursday;

import java.sql.*;

public class database_connect {

    static Connection con = null;
    static Statement stat = null;

    public static void buildConnection() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            stat = con.createStatement();

        } catch (SQLException e) {
            System.out.println(e.toString());
        }


    }

}
