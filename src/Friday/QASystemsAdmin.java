package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QASystemsAdmin extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7, p8;
    JLabel ADMIN, l1, l2, l3, l4, l5, l6, l7, l8;
    JButton updateTrainee, updateTrainer, updateClient;


    public QASystemsAdmin () throws HeadlessException {


        setLayout(new GridLayout(8, 1));

        p1 = new JPanel(new GridLayout(1, 3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1, 3));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1, 3));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1, 3));
        p8 = new JPanel();

        ADMIN = new JLabel("Admin");
        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        l5 = new JLabel(" ");
        l6 = new JLabel(" ");
        l7 = new JLabel(" ");
        l8 = new JLabel(" ");


        updateTrainee = new JButton("Update Trainee");
        updateTrainer = new JButton("Update Trainer");
        updateClient = new JButton("Update Client");

        //Panel 1
        p1.add(l1);
        p1.add(ADMIN);
        p1.add(l2);

        //Panel 3
        p3.add(l3);
        p3.add(updateTrainee);
        p3.add(l4);

        //Panel 5
        p5.add(l5);
        p5.add(updateTrainer);
        p5.add(l6);

        //Panel 7
        p7.add(l7);
        p7.add(updateClient);
        p7.add(l8);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);

        setVisible(true);
        setSize(400, 400);


        updateTrainee.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Update Trainee")) {
                            System.out.println("Update Trainee");
                            new UpdateTrainee();

                        }
                    }
                }
        );

        updateTrainer.addActionListener((
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Update Trainer")) {
                            System.out.println("Update Trainer");
                            new UpdateTrainer();
                        }
                    }
                }
        ));


        updateClient.addActionListener((
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Update Client")) {
                            System.out.println("Update Client");
                            new UpdateClient();
                        }
                    }
                }
        ));

    }
}










