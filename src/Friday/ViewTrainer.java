package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewTrainer extends JFrame {

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, view_Trainer,
            trainerID, firstName, lastName, email, gender;
    static JTextField trainerText, firstText, lastText, emailText, genderText;
    static JButton search;


    public ViewTrainer() throws HeadlessException {

        setSize(400, 500);
        setLayout(new GridLayout(12, 1));

        //JPanels
        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1,4));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1,4));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1,4));
        p8 = new JPanel();
        p9 = new JPanel(new GridLayout(1, 4));
        p10 = new JPanel();
        p11 = new JPanel(new GridLayout(1,4));
        p12 = new JPanel();


        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        l5 = new JLabel(" ");
        l6 = new JLabel(" ");
        l7 = new JLabel(" ");
        l8 = new JLabel(" ");
        l9 = new JLabel(" ");
        l10 = new JLabel(" ");
        l11 = new JLabel(" ");
        view_Trainer = new JLabel("View Trainer");
        trainerID = new JLabel("Trainer ID");
        firstName = new JLabel("First Name");
        lastName = new JLabel("Last Name");
        email = new JLabel("Email");
        gender = new JLabel("Gender");

        trainerText = new JTextField(10);
        firstText = new JTextField(10);
        lastText = new JTextField(10);
        emailText = new JTextField(15);
        genderText = new JTextField(1);

        search = new JButton("Search");

        p1.add(l1);
        p1.add(view_Trainer);
        p1.add(l2);

        p3.add(l3);
        p3.add(trainerID);
        p3.add(trainerText);
        p3.add(search);

        p5.add(l4);
        p5.add(firstName);
        p5.add(firstText);
        p5.add(l5);

        p7.add(l6);
        p7.add(lastName);
        p7.add(lastText);
        p7.add(l7);

        p9.add(l8);
        p9.add(email);
        p9.add(emailText);
        p9.add(l9);

        p11.add(l10);
        p11.add(gender);
        p11.add(genderText);
        p11.add(l11);


        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);

        setVisible(true);

        search.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Search")) {

                            String search = "SELECT*FROM trainers WHERE Trainer_ID = '" + trainerText.getText() + "'";
                            System.out.println(search);

                            try {
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while (s.next()) {
                                    ViewTrainer.trainerText.setText(String.valueOf(s.getObject("Trainer_ID")));
                                    ViewTrainer.firstText.setText(String.valueOf(s.getObject("First_Name")));
                                    ViewTrainer.lastText.setText(String.valueOf(s.getObject("Last_Name")));
                                    ViewTrainer.emailText.setText(String.valueOf(s.getObject("Email")));
                                    ViewTrainer.genderText.setText(String.valueOf(s.getObject("Gender")));
                                }

                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                        }
                }
        );
    }
}

