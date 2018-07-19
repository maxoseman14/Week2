package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QASystemsLogin{

    public static void main(String[] args) {

        QASystems_databaseConnect.buildConnection();


            JFrame loginF = new JFrame();
            loginF.setLayout(new GridLayout(7, 1));

            JPanel p1 = new JPanel(new GridLayout(1, 3));
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel(new GridLayout(1, 4));
            JPanel p4 = new JPanel();
            JPanel p5 = new JPanel(new GridLayout(1, 4));
            JPanel p6 = new JPanel();
            JPanel p7 = new JPanel(new GridLayout(1, 3));

            JLabel l1 = new JLabel(" ");
            JLabel l2 = new JLabel(" ");
            JLabel l3 = new JLabel(" ");
            JLabel l4 = new JLabel(" ");
            JLabel l5 = new JLabel(" ");
            JLabel l6 = new JLabel(" ");
            JLabel l7 = new JLabel(" ");
            JLabel l8 = new JLabel(" ");
            JLabel login = new JLabel("Login");
            JLabel user = new JLabel("Username");
            JLabel password = new JLabel("Password");

            JTextField t1 = new JTextField(15);
            JTextField t2 = new JTextField(15);

            JButton loginBtn = new JButton("Login");

            p1.add(l1);
            p1.add(login);
            p1.add(l2);

            p3.add(l3);
            p3.add(user);
            p3.add(t1);
            p3.add(l4);

            p5.add(l5);
            p5.add(password);
            p5.add(t2);
            p5.add(l6);

            p7.add(l7);
            p7.add(loginBtn);
            p7.add(l8);

            loginF.add(p1);
            loginF.add(p2);
            loginF.add(p3);
            loginF.add(p4);
            loginF.add(p5);
            loginF.add(p6);
            loginF.add(p7);

        loginF.setSize(400,400);
        loginF.setVisible(true);



        loginBtn.addActionListener(
                            new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {

                                    JButton button;
                                    button = (JButton) e.getSource();
                                    String what = button.getText();


                                    if (what.equals("Login")) {

                                        try {

                                            ResultSet s = QASystems_databaseConnect.stat.executeQuery("SELECT Username, Passkey FROM admins AND users");

                                            while (s.next()) {
                                                String adminUsername = t1.getText();
                                                String adminPassword = t2.getText();
                                                String userUsername = t1.getText();
                                                String userPassword = t2.getText();

                                                if (adminUsername.equals(s.getString("Username"))) {
                                                    if (adminPassword.equals(s.getString("Passkey"))) {
                                                        new QASystemsAdmin();
                                                    }
                                                } else if (userUsername.equals(s.getString("Username"))) {
                                                    if (userPassword.equals(s.getString("Passkey"))) {
                                                        new QASystemsUser();
                                                    }
                                                }else{ new Invalid_Details();
                                                }
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


