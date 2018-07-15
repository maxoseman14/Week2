package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QASystemsAdmin {

    public static void main(String[] args) {

        JFrame adminFrame = new JFrame();

        adminFrame.setLayout(new GridLayout(7, 1));

        JPanel p1 = new JPanel(new GridLayout(1, 3));
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel(new GridLayout(1, 3));
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel(new GridLayout(1, 3));
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel(new GridLayout(1, 3));
        JPanel p8 = new JPanel();

        JLabel ADMIN = new JLabel("Admin");
        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel(" ");
        JLabel l4 = new JLabel(" ");
        JLabel l5 = new JLabel(" ");
        JLabel l6 = new JLabel(" ");
        JLabel l7 = new JLabel(" ");
        JLabel l8 = new JLabel(" ");


        JButton updateTrainee = new JButton("Update Trainee");
        JButton updateTrainer = new JButton("Update Trainer");
        JButton updateClient = new JButton("Update Client");

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

        adminFrame.add(p1);
        adminFrame.add(p2);
        adminFrame.add(p3);
        adminFrame.add(p4);
        adminFrame.add(p5);
        adminFrame.add(p6);
        adminFrame.add(p7);
        adminFrame.add(p8);

        adminFrame.setVisible(true);
        adminFrame.setSize(400, 400);


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










