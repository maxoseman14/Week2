package Thursday;

import java.awt.*;

    public class ViewField extends Frame{

        Panel p1, p2, p3;
        Label l1, l2, l3, l4, l5;
        TextField regno, name, score;
        Button view;

        public ViewField()throws HeadlessException {

            setVisible(true);
            setSize(400, 400);
            setLayout(new GridLayout(4,1));

            p1 = new Panel(new GridLayout(1, 3));
            p2 = new Panel(new GridLayout(1, 3));
            p3 = new Panel(new GridLayout(1, 3));

            l1 = new Label("RegNo");
            l2 = new Label("Name");
            l3 = new Label("Score");
            l4 = new Label(" ");
            l5 = new Label(" ");

            regno = new TextField();
            name = new TextField();
            score = new TextField();

            view = new Button();

            p1.add(l1);
            p1.add(regno);
            p1.add(view);
            p2.add(l1);
            p2.add(name);
            p2.add(l4);
            p2.add(l3);
            p2.add(score);
            p2.add(l5);

            add(p1);
            add(p2);
            add(p3);

            Frame2_EventHandler e = new Frame2_EventHandler();
            view.addActionListener(e);






    }
}
