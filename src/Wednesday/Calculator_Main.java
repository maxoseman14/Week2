package Wednesday;

import java.awt.*;

public class Calculator_Main {

    public static void main(String[] args) {

        Frame win = new Frame();
        win.setVisible(true);
        win.setSize(400, 400);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        p2.setLayout(new GridLayout(4,4));

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bC = new Button("C");
        Button bAdd = new Button("+");
        Button bSub = new Button("-");
        Button bMulti = new Button("*");
        Button bDiv = new Button("/");
        Button bEquals = new Button("=");

        p2.add(b0);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bC);
        p2.add(bAdd);
        p2.add(bSub);
        p2.add(bMulti);
        p2.add(bDiv);
        p2.add(bEquals);

        TextField t = new TextField(20);
        p1.add(t);
        win.add(p1, BorderLayout.NORTH);
        win.add(p2);

        Cal_EventHandler e = new Cal_EventHandler(t);
        b0.addActionListener(e);
        b1.addActionListener(e);
        b2.addActionListener(e);
        b3.addActionListener(e);
        b4.addActionListener(e);
        b5.addActionListener(e);
        b6.addActionListener(e);
        b7.addActionListener(e);
        b8.addActionListener(e);
        b9.addActionListener(e);
        bAdd.addActionListener(e);
        bSub.addActionListener(e);
        bDiv.addActionListener(e);
        bMulti.addActionListener(e);
        bEquals.addActionListener(e);
        bC.addActionListener(e);




    }
}
