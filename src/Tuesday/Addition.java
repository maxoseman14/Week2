package Tuesday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition implements ActionListener {

    TextField t1, t2, t3;


    public Addition (TextField a, TextField b, TextField c){   //values entered in GUI textfields are passed to local variables
        t1 = a;
        t2 = b;
        t3 = c;
    }
    public void actionPerformed(ActionEvent add){
        int No1, No2, No3;
        No1 = Integer.parseInt(t1.getText());
        No2 = Integer.parseInt(t2.getText());
        No3 = No1 + No2;
        t3.setText(Integer.toString(No3));
    }
}
