package Thursday;

import Wednesday.EventHandler;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class closeWindow extends WindowAdapter {

    Frame win;
    Frame EntryField;

    public closeWindow (Frame f){                       //constructor
        win = f;
        EntryField = f;
    }

    public void windowClosing(WindowEvent x){
        win.setVisible(false);
        System.out.println("Window closing");
        EntryField.setVisible(false);
        System.out.println("Entry field closing");
    }

    public void windowClosed(WindowEvent x) {
        win.setVisible(false);
        System.out.println("Window closed");
        EntryField.setVisible(false);
        System.out.println("Entry field closed");
    }

    public void windowActivated(WindowEvent x) {
        EntryField.setVisible(true);
        System.out.println("Entry field opened");

    }
}