package Friday;

//Update Trainer JFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTrainer extends JFrame {

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13;
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, update_Trainer,
    trainerID, firstName, lastName, email, gender;
    static JTextField trainerText, firstText, lastText, emailText, genderText;
    static JButton search, save, edit, delete;

    public UpdateTrainer () throws HeadlessException{

        setSize(400, 500);
        setLayout(new GridLayout(13, 1));

        //JPanels
        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1,4));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1,3));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1,3));
        p8 = new JPanel();
        p9 = new JPanel(new GridLayout(1, 3));
        p10 = new JPanel();
        p11 = new JPanel(new GridLayout(1,3));
        p12 = new JPanel();
        p13 = new JPanel(new GridLayout(1,3));

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
        update_Trainer = new JLabel("Update Trainer");
        trainerID = new JLabel("Trainer ID");
        firstName = new JLabel("First Name");
        lastName = new JLabel("Last Name");
        email = new JLabel("Email");
        gender = new JLabel("Gender");

        trainerText = new JTextField(10);
        firstText = new JTextField(10);
        lastText = new JTextField(10);
        emailText = new JTextField(10);
        genderText = new JTextField(10);

        search = new JButton("Search");
        save = new JButton("Save");
        edit = new JButton("Edit");
        delete = new JButton("Delete");

        p1.add(l1);
        p1.add(update_Trainer);
        p1.add(l2);

        p3.add(l3);
        p3.add(trainerID);
        p3.add(trainerText);
        p3.add(search);

        p5.add(l4);
        p5.add(firstName);
        p5.add(firstText);

        p7.add(l5);
        p7.add(lastName);
        p7.add(lastText);

        p9.add(l6);
        p9.add(email);
        p9.add(emailText);

        p11.add(l7);
        p11.add(gender);
        p11.add(genderText);

        p13.add(save);
        p13.add(edit);
        p13.add(delete);

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
        add(p13);

        setVisible(true);


        search.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Search")) {
                            System.out.println("Search Trainers");
                            String search = "SELECT * FROM trainers WHERE Trainer_ID = '" + trainerText.getText() + "'";
                            System.out.println(search);

                            try {
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while (s.next()) {
                                    UpdateTrainer.trainerText.setText(String.valueOf(s.getObject("Trainer_ID")));
                                    UpdateTrainer.firstText.setText(String.valueOf(s.getObject("First_Name")));
                                    UpdateTrainer.lastText.setText(String.valueOf(s.getObject("Last_Name")));
                                    UpdateTrainer.emailText.setText(String.valueOf(s.getObject("Email")));
                                    UpdateTrainer.genderText.setText(String.valueOf(s.getObject("Gender")));
                                }
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }

                    }
                }
        );


        delete.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Delete")) {
                            try {
                                QASystems_databaseConnect.stat.executeUpdate("DELETE FROM trainers WHERE Trainer_ID = '"
                                        + trainerText.getText() + "'");
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }

                        }
                    }
                }
        );

        save.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();


                        if (what.equals("Save")){
                            String trainerID =  genderText.getText() + firstText.getText().substring(0,3) + "T"; //need to increment starting at 001

                            try{
                                QASystems_databaseConnect.stat.executeUpdate("INSERT INTO trainers VALUES('" + trainerID + "','" + firstText.getText()
                                        + "','" + lastText.getText() + "','" + emailText.getText() + "','" + genderText.getText() + "')");
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }

                        }

                    }
                }
        );

        edit.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();

                        String what = button.getText();
                        if (what.equals("Edit")) {
                            try {
                                PreparedStatement ps = QASystems_databaseConnect.con.prepareStatement("UPDATE trainers SET `First_Name`=?, `Last_Name`=?, `Email`=?, `Gender`=? WHERE `Trainer_ID`=?;");
                                ps.setString(1,firstText.getText());
                                ps.setString(2,lastText.getText());
                                ps.setString(3,emailText.getText());
                                ps.setString(4,genderText.getText());
                                ps.setString(5,trainerText.getText());
                                System.out.println(ps);
                                ps.executeUpdate();
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }

                }
        );





    }







}
