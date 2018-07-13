package Wednesday;

//can create a class which uses all buttons (instead of creating four separate classes)

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


 /*   public class EventHandler implements ActionListener {

        TextField t1, t2, t3;
        Button bAdd, bSub, bMult, bDiv;


        public void actionPerformed(ActionEvent x) {

            int no1, no2, no3;
            Button btn;

            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());
            btn = (Button) x.getSource();
            if (btn == bAdd) {
                no3 = no1 + no2;
                t3.setText(Integer.toString(no3));
            }
            if (btn == bSub) {
                no3 = no1 - no2;
                t3.setText(Integer.toString(no3));
            }
            if (btn == bMult) {
                no3 = no1 * no2;
                t3.setText(Integer.toString(no3));
            }
            if (btn == bDiv) {
                no3 = no1 / no2;
                t3.setText(Integer.toString(no3));
            }
        }

        public EventHandler(TextField tA, TextField tB, TextField tC, Button b1, Button b2, Button b3, Button b4){
            t1 = tA;
            t2 = tB;
            t3 = tC;
            bAdd = b1;
            bSub = b2;
            bMult = b3;
            bDiv = b4;
        }


    } */

 public class EventHandler implements ActionListener{

     TextField t1, t2, t3;

     public void actionPerformed(ActionEvent x) {

         String what;
         int no1, no2, no3;
         Button btn;
         no1 = Integer.parseInt(t1.getText());
         no2 = Integer.parseInt(t2.getText());

         btn = (Button) x.getSource();
         what = btn.getLabel();
         if (what.equals("+")) {
             no3 = no1 + no2;
             t3.setText(Integer.toString(no3));
         }
         if (what.equals("-")) {
             no3 = no1 - no2;
             t3.setText(Integer.toString(no3));
         }
         if (what.equals("*")) {
             no3 = no1 * no2;
             t3.setText(Integer.toString(no3));
         }
         if (what.equals("/")) {
             no3 = no1 / no2;
             t3.setText(Integer.toString(no3));
         }
     }

         public EventHandler(TextField tA, TextField tB, TextField tC){
             t1 = tA;
             t2 = tB;
             t3 = tC;
         }
     }



