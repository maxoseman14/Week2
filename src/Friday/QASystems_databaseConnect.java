package Friday;

import java.sql.*;

public class QASystems_databaseConnect {

    static Connection con = null;
    static Statement stat = null;

    public static void buildConnection(){

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/qa consulting", "root", "");
            stat = con.createStatement();

        } catch (SQLException e) {
        System.out.println(e.toString());
    }


    }




}
