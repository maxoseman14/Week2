package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QASystemsAdmin {

    public static void main(String[] args) {

        JFrame adminFrame = new JFrame();

        adminFrame.setLayout(new GridLayout(12, 5));

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1, 5));
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel(new GridLayout(1, 5));
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel(new GridLayout(1, 5));
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel(new GridLayout(1, 5));
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel(new GridLayout(1, 5));
        JPanel p11 = new JPanel();
        JPanel p12 = new JPanel();

        JLabel ADMIN = new JLabel("Admin");
        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel(" ");
        JLabel l4 = new JLabel(" ");
        JLabel l5 = new JLabel(" ");
        JLabel l6 = new JLabel(" ");
        JLabel l7 = new JLabel(" ");
        JLabel l8 = new JLabel(" ");
        JLabel l9 = new JLabel(" ");
        JLabel l10 = new JLabel(" ");
        JLabel l11 = new JLabel(" ");
        JLabel l12 = new JLabel(" ");
        JLabel l13 = new JLabel(" ");
        JLabel l14 = new JLabel(" ");
        JLabel l15 = new JLabel(" ");
        JLabel l16 = new JLabel(" ");
        JLabel l17 = new JLabel(" ");
        JLabel l18 = new JLabel(" ");


        JButton addTrainee = new JButton("Add Trainee");
        JButton addClient = new JButton("Add Client");
        JButton editTrainee = new JButton("Edit Trainee");
        JButton editClient = new JButton("Edit Client");
        JButton delTrainee = new JButton("Delete Trainee");
        JButton delClient = new JButton("Delete Client");
        JButton viewTrainee = new JButton("View Trainee");
        JButton viewClient = new JButton("View Client");
        JButton reports = new JButton("Reports");

        //Panel 1
        p1.add(l1);
        p1.add(l2);
        p1.add(ADMIN);
        p1.add(l3);
        p1.add(l4);

        //Panel 3
        p3.add(l5);
        p3.add(addTrainee);
        p3.add(l6);
        p3.add(addClient);
        p3.add(l7);

        //Panel 5
        p5.add(l8);
        p5.add(editTrainee);
        p5.add(l9);
        p5.add(editClient);
        p5.add(l10);

        //Panel 7
        p7.add(l11);
        p7.add(delTrainee);
        p7.add(l12);
        p7.add(delClient);
        p7.add(l13);

        //Panel 9
        p9.add(l14);
        p9.add(viewTrainee);
        p9.add(l15);
        p9.add(viewClient);
        p9.add(l16);

        //Panel 11
        p11.add(l17);
        p11.add(reports);
        p11.add(l18);


        adminFrame.add(p1);
        adminFrame.add(p2);
        adminFrame.add(p3);
        adminFrame.add(p4);
        adminFrame.add(p5);
        adminFrame.add(p6);
        adminFrame.add(p7);
        adminFrame.add(p8);
        adminFrame.add(p9);
        adminFrame.add(p10);
        adminFrame.add(p11);
        adminFrame.add(p12);

        adminFrame.setVisible(true);
        adminFrame.setSize(400, 500);


        addTrainee.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();
                        System.out.println(what);

                        if (what.equals("Add Trainee")) {
                            System.out.println("Add Trainee");
                            new UpdateMember();

                        }
                    }
                }
        );

        editTrainee.addActionListener((
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if(what.equals("Edit Trainee")){
                            System.out.println("Edit Trainee");
                            new UpdateMember();
                        }
                    }
                }
                ));

        delTrainee.addActionListener((
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Delete Trainee")) {
                            System.out.println("Delete Trainee");
                            new UpdateMember();
                        }
                    }
                }
        ));

        viewTrainee.addActionListener((
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("View Trainee")) {
                            System.out.println("View Trainee");
                            new UpdateMember();
                        }
                    }
                }
        ));
    }
}










