package Wednesday;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Cal_EventHandler implements ActionListener {

    TextField t;
    String answer = "";
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");

    public Cal_EventHandler (TextField t1){                 //constructor
        t = t1;
    }

    public void actionPerformed(ActionEvent x) {

        Button btn;                                         //Button reference variable btn
        btn = (Button) x.getSource();
        String what;                                        //String variable 'what' is updated with label value
        what = btn.getLabel();

        if (what.equals("0")) {
            answer += btn.getLabel();                       //adds button labels to String variable 'answer'
            t.setText(answer);
        } else if (what.equals("1")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("2")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("3")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("4")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("5")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("6")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("7")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("8")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("9")) {
            answer += btn.getLabel();
            t.setText(answer);
        } else if (what.equals("+")) {
            answer += btn.getLabel();
        } else if (what.equals("-")) {
            answer += btn.getLabel();
        } else if (what.equals("*")) {
            answer += btn.getLabel();
        } else if (what.equals("/")) {
            answer += btn.getLabel();
        } else if (what.equals("C")) {
            answer = "";
            t.setText("");
        } else if (what.equals("=")) {
            try {
               System.out.println(answer);
               t.setText(String.valueOf(engine.eval(answer)));              //evaluates the string 'answer'
               answer = "";                                                 //resets the string to nothing
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
    }


}
