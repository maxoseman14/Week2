package Friday;

import java.sql.*;

public class QASystems_databaseConnect {

    private static Connection con = null;
    static Statement stat = null;

    public static void buildConnection(){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qa_consulting", "root", "");
            stat = con.createStatement();

        }
        catch (SQLException e) {
        System.out.println(e.toString());
        }
        catch (ClassNotFoundException e) {
           e.printStackTrace();
        }


    }
}
