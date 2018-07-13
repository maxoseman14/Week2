package Thursday;

import Wednesday.EventHandler;
import java.sql.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Frame2 {



    public static void main(String[] args) {

        database_connect.buildConnection();

        Frame win = new Frame();
        win.setVisible(true);
        win.setSize(400, 500);
        win.setLayout(new GridLayout(9,1));

        Panel p1 = new Panel();
        Panel p2 = new Panel(new GridLayout(1,3));
        Panel p3 = new Panel();
        Panel p4 = new Panel(new GridLayout(1, 3));
        Panel p5 = new Panel();
        Panel p6 = new Panel(new GridLayout( 1, 3));
        Panel p7 = new Panel();
        Panel p8 = new Panel(new GridLayout(1, 3));
        Panel p9 = new Panel();

        Label l1 = new Label(" ");
        Label l2 = new Label(" ");
        Label l3 = new Label(" ");
        Label l4 = new Label(" ");
        Label l5 = new Label(" ");
        Label l6 = new Label(" ");
        Label l7 = new Label(" ");
        Label l8 = new Label(" ");
        Button bEntry = new Button("ENTRY");
        Button bView = new Button("VIEW");
        Button bEdit = new Button("EDIT");
        Button bDel = new Button("DELETE");

        p2.add(l1);
        p2.add(bEntry);
        p2.add(l2);
        p4.add(l3);
        p4.add(bView);
        p4.add(l4);
        p6.add(l5);
        p6.add(bEdit);
        p6.add(l6);
        p8.add(l7);
        p8.add(bDel);
        p8.add(l8);

        win.add(p1);
        win.add(p2);
        win.add(p3);
        win.add(p4);
        win.add(p5);
        win.add(p6);
        win.add(p7);
        win.add(p8);
        win.add(p9);

        closeWindow w = new closeWindow(win);
        win.addWindowListener(w);

        Frame2_EventHandler e = new Frame2_EventHandler();
        bEntry.addActionListener(e);
        bView.addActionListener(e);
        bEdit.addActionListener(e);
        bDel.addActionListener(e);







    }
}
