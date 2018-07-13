package Thursday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Frame2_EventHandler implements ActionListener {

    EntryField add;
    DeleteField del;


    public Frame2_EventHandler () {

    }
    public Frame2_EventHandler (EntryField add) {
        this.add = add;
    }
    public Frame2_EventHandler (DeleteField del){
        this.del = del;
    }


    @Override
    public void actionPerformed (ActionEvent x){

        Button btn;
        btn = (Button) x.getSource();
        String what;
        what = btn.getLabel();
        System.out.println(what);

        if (what.equals("ENTRY")){
            System.out.println("Entry");
            new EntryField();
        }
        if (what.equals("VIEW")){
            System.out.println("View");
        }
        if (what.equals("EDIT")){
            System.out.println("Edit");
        }
        if (what.equals("DELETE")){
            System.out.println("Delete");
            new DeleteField();
        }
        if (what.equals("SAVE")) {
            String regno = "", name = "", score = "";
            regno = add.regno.getText();
            name = add.name.getText();
            score = add.score.getText();
            //INSERT INTO QA VALUES(1,'Max',89)
            String insertquery = "INSERT INTO QA VALUES(" + regno + ",'" + name + "'," + score + ")";
            System.out.println(insertquery);
            try {
                database_connect.stat.executeUpdate(insertquery);
            } catch (Exception t) {
                System.out.println(t.toString());
            }
        }

        if (what.equals("Search")){
                int searchRegno = Integer.parseInt(del.regno.getText());
                String query = "SELECT*FROM QA WHERE REGNO =" + searchRegno;
                System.out.println(query);

            try{
                ResultSet s = database_connect.stat.executeQuery(query);
                while (s.next()){
                    del.regno.setText(String.valueOf(s.getObject("REGNO")));
                    del.name.setText(String.valueOf(s.getObject("NAME")));
                    del.score.setText(String.valueOf(s.getObject("SCORE")));
                }

            }
            catch(Exception t){
                System.out.println(t.toString());
            }
            }


        if (what.equals("Delete")){
            try {
                database_connect.stat.executeUpdate("DELETE FROM QA WHERE REGNO= " + Integer.parseInt(del.regno.getText()));
            } catch (SQLException e) {
                System.out.println(e.toString());
            }


        }


        }

    }


