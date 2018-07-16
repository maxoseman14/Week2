package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QASystemsUser extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, USER;
    JButton viewTrainee, viewTrainer, viewClient;


    public QASystemsUser () throws HeadlessException{

        setLayout(new GridLayout(4,1));

        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1,3));
        p4 = new JPanel();

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        USER = new JLabel("User");

        viewTrainee = new JButton("View Trainee");
        viewTrainer = new JButton("View Trainer");
        viewClient = new JButton("View Client");

        p1.add(l1);
        p1.add(USER);
        p1.add(l2);

        p3.add(l3);
        p3.add(viewTrainee);
        p3.add(l4);

        p5.add(l5);
        p5.add(viewTrainer);
        p5.add(l6);


        add(p1);
        add(p2);
        add(p3);
        add(p4);

        setSize(400, 400);
        setVisible(true);





    }
}
