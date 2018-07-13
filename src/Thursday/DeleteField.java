package Thursday;

import java.awt.*;

    public class DeleteField extends Frame {

        Panel p1, p2, p3, p4;
        Label l1, l2, l3, l4, l5;
        TextField regno, name, score;
        Button delete, search;

        public DeleteField() throws HeadlessException {

            setVisible(true);
            setSize(400, 400);
            setLayout(new GridLayout(4, 1));


            p1 = new Panel(new GridLayout(1, 3));
            p2 = new Panel(new GridLayout( 1, 3));
            p3 = new Panel(new GridLayout(1, 3));
            p4 = new Panel(new GridLayout(1, 3));

            l1 = new Label("RegNo");
            l2 = new Label("Name");
            l3 = new Label("Score");
            l4 = new Label(" ");
            l5 = new Label(" ");

            regno = new TextField(10);
            name = new TextField(10);
            score = new TextField(10);

            delete = new Button("Delete");
            search = new Button("Search");

            Frame2_EventHandler e = new Frame2_EventHandler(this);
            delete.addActionListener(e);
            search.addActionListener(e);


            p1.add(l1);
            p1.add(regno);
            p1.add(search);
            p2.add(l2);
            p2.add(name);
            p3.add(l3);
            p3.add(score);
            p4.add(l4);
            p4.add(l5);
            p4.add(delete);

            add(p1);
            add(p2);
            add(p3);
            add(p4);


        }
    }
