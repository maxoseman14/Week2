package Wednesday;

//accessing a database in a java file
//(database called 'test' in phpMyAdmin - phpMyAdmin opened from XAMPP control panel)

import java.sql.*;


public class QAdatabase_main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM qa;");
            while (r.next()) {
                System.out.println(r.getObject("REGNO"));
                System.out.println(r.getObject("NAME"));
                System.out.println(r.getObject("SCORE"));

            }
        s.executeUpdate("INSERT INTO qa VALUES (5, 'Shafeeq', 100);");            //update the table 'qa'
        }                                                                               //string goes into sql


    }

