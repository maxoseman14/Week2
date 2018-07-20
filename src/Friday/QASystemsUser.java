package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QASystemsUser extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7, p8 , p9;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, USER;
    JButton viewTrainee, viewTrainer, viewClient, clientReports, trainerReports;


    public QASystemsUser () throws HeadlessException{

        setLayout(new GridLayout(9,1));

        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1,3));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1, 3));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1,3));
        p8 = new JPanel();
        p9 = new JPanel(new GridLayout(1, 2));

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        l5 = new JLabel(" ");
        l6 = new JLabel(" ");
        l7 = new JLabel(" ");
        l8 = new JLabel(" ");
        USER = new JLabel("User");

        viewTrainee = new JButton("View Trainee");
        viewTrainer = new JButton("View Trainer");
        viewClient = new JButton("View Client");
        clientReports = new JButton("Client Reports");
        trainerReports = new JButton("Trainer Reports");

        p1.add(l1);
        p1.add(USER);
        p1.add(l2);

        p3.add(l3);
        p3.add(viewTrainee);
        p3.add(l4);

        p5.add(l5);
        p5.add(viewTrainer);
        p5.add(l6);

        p7.add(l7);
        p7.add(viewClient);
        p7.add(l8);

        p9.add(clientReports);
        p9.add(trainerReports);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(p9);


        setSize(400, 400);
        setVisible(true);



        viewTrainee.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("View Trainee")){
                            new ViewTrainee();
                        }

                    }
                }
        );
        viewTrainer.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if(what.equals("View Trainer")){
                            new ViewTrainer();
                        }
                    }
                }
        );
        viewClient.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if(what.equals("View Client")){
                            new ViewClient();
                        }
                    }
                }
        );
        trainerReports.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Trainer Reports")){
                            System.out.println("View Trainer Reports");
                            new trainerlog();
                        }

                    }
                }
        );

        clientReports.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Client Reports")){
                            System.out.println("View Client Reports");
                            new clientlog();
                        }

                    }
                }
        );




    }
}
