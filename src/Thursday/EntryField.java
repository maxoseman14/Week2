package Thursday;

import java.awt.*;

public class EntryField extends Frame {

    Panel p1, p2, p3, p4, p5;
    Label l1, l2, l3, l4;
    TextField regno, name, score;
    Button save;

    public EntryField() throws HeadlessException {

        setVisible(true);
        setSize(400, 400);
        setLayout(new GridLayout(5, 1));

        p1 = new Panel();
        p2 = new Panel(new GridLayout(1, 2));
        p3 = new Panel(new GridLayout(1, 2));
        p4 = new Panel(new GridLayout(1, 2));
        p5 = new Panel(new GridLayout(1, 2));

        l1 = new Label("RegNo");
        l2 = new Label("Name");
        l3 = new Label("Score");
        l4 = new Label(" ");

        regno = new TextField(5);
        name = new TextField(10);
        score = new TextField(5);
        save = new Button("SAVE");

        p2.add(l1);
        p2.add(regno);
        p3.add(l2);
        p3.add(name);
        p4.add(l3);
        p4.add(score);
        p5.add(l4);
        p5.add(save);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);

        Frame2_EventHandler e = new Frame2_EventHandler(this);
        save.addActionListener(e);                                  //check for action when 'save' button is pressed

    }
}
