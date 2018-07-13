package Tuesday;

import java.awt.*;


public class Windows {
    public static void main(String[] args) {

        Frame win = new Frame();
        win.setSize(400, 400);
        win.setBackground(Color.white);
        win.setLocation(400, 400);
        win.setVisible(true);

        Button b = new Button("Click Me");    //creates button
        Button b2 = new Button("2");
        win.setLayout(new FlowLayout());
        win.add(b2);
        win.add(b);                                 //adds button


        eventX e = new eventX();                    //creates an event object for when button b is clicked
        b.addActionListener(e);

        TextField t = new TextField();              //creates a textfield object
        win.add(t);                                 //add textfield to the frame
        Event y = new Event(t);
        b.addActionListener(y);                     //add text when the button b is pressed




        }
    }

