package Wednesday;

import java.awt.*;

//GUI

public class Math_WinOneClass_Main {

      public static void main(String[] args) {

            //make frame
            Frame win = new Frame();
            win.setSize(400, 400);
            win.setVisible(true);
            win.setLocation(700, 400);


            //textfield, label and button reference variables
            TextField t1, t2, t3;
            Label l1, l2, l3;
            Button b1, b2, b3, b4;


            //create objects
            l1 = new Label("No.1");
            l2 = new Label("No.2");
            l3 = new Label("Result2");

            t1 = new TextField(10);
            t2 = new TextField(10);
            t3 = new TextField(10);

            b1 = new Button("+");
            b2 = new Button("-");
            b3 = new Button("*");
            b4 = new Button("/");

            //spaces buttons out
            win.setLayout(new FlowLayout());


            //add textfields, labels and buttons to Frame
            win.add(l1);
            win.add(t1);
            win.add(l2);
            win.add(t2);
            win.add(l3);
            win.add(t3);

            win.add(b1);
            win.add(b2);
            win.add(b3);
            win.add(b4);

            /* //to run first EventHandler methods:
            EventHandler e = new EventHandler(t1, t2, t3, b1, b2, b3, b4);

            b1.addActionListener(e);           //each button checks for respective event
            b2.addActionListener(e);
            b3.addActionListener(e);
            b4.addActionListener(e);
            */

            //to run the second event handler which uses the string variable what and .equals:
            EventHandler e = new EventHandler(t1, t2, t3);
            b1.addActionListener(e);
            b2.addActionListener(e);
            b3.addActionListener(e);
            b4.addActionListener(e);

       }
}
