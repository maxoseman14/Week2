package Tuesday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event implements ActionListener{

    TextField txt;
    public Event(TextField t){
        txt = t;
    }
    public void actionPerformed(ActionEvent y){
        txt.setText("Hello my friends");
    }

}
