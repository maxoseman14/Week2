package Friday;

//Update Trainee JFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateTrainee extends JFrame {

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
            p17, p18, exceeded;

    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16,
            l17, l18, l19, l20, l21, l22, l23, trainee_ID, client_ID, first_name, last_name,
            gender, email, trainer_ID, update_QA;

    static JTextField id, firstName, lastName, emailText, trainer, client,
            genderText;

    static JComboBox genderbox;

    static JButton save, edit, search, delete;


    public UpdateTrainee() throws HeadlessException {


        setSize(400, 700);
        setLayout(new GridLayout(18, 1));

        //JPanels
        p1 = new JPanel(new GridLayout(1, 3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1, 5));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1, 4));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1, 4));
        p8 = new JPanel();
        p9 = new JPanel(new GridLayout(1, 4));
        p10 = new JPanel();
        p11 = new JPanel(new GridLayout(1, 4));
        p12 = new JPanel();
        p13 = new JPanel(new GridLayout(1, 4));
        p14 = new JPanel();
        p15 = new JPanel(new GridLayout(1, 4));
        p16 = new JPanel();
        p17 = new JPanel(new GridLayout(1, 4));
        p18 = new JPanel();

        //JLabels
        update_QA = new JLabel("Update QA Member");
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
        l12 = new JLabel(" ");
        l13 = new JLabel(" ");
        l14 = new JLabel(" ");
        l15 = new JLabel(" ");
        l16 = new JLabel(" ");
        l17 = new JLabel(" ");
        l18 = new JLabel(" ");
        l19 = new JLabel(" ");
        l20 = new JLabel(" ");
        l21 = new JLabel(" ");
        l22 = new JLabel(" ");
        l23 = new JLabel(" ");
        trainee_ID = new JLabel("QA ID ");
        first_name = new JLabel("First Name");
        last_name = new JLabel("Last Name");
        email = new JLabel("Email ");
        trainer_ID = new JLabel("Trainer ID");
        client_ID = new JLabel("Client ID");
        gender = new JLabel("Gender");

        //JTextfields
        id = new JTextField(10);
        firstName = new JTextField(10);
        lastName = new JTextField(10);
        emailText = new JTextField(15);
        trainer = new JTextField(10);
        client = new JTextField(10);

        //JCombobox
        String [] genders = {"M", "F"};
        genderbox = new JComboBox(genders);

        //JButtons
        search = new JButton("Search");
        save = new JButton("Save");
        edit = new JButton("Edit");
        delete = new JButton("Delete");

        //add labels, textfields and buttons to panels
        p1.add(l1);
        p1.add(l2);
        p1.add(update_QA);
        p1.add(l3);
        p1.add(l4);

        p3.add(l5);
        p3.add(trainee_ID);
        p3.add(id);
        p3.add(search);
        p3.add(l7);

        p5.add(l8);
        p5.add(first_name);
        p5.add(firstName);
        p5.add(l9);

        p7.add(l10);
        p7.add(last_name);
        p7.add(lastName);
        p7.add(l11);

        p9.add(l12);
        p9.add(email);
        p9.add(emailText);
        p9.add(l13);

        p11.add(l14);
        p11.add(trainer_ID);
        p11.add(trainer);
        p11.add(l15);

        p13.add(l16);
        p13.add(client_ID);
        p13.add(client);
        p13.add(l17);

        p15.add(l22);
        p15.add(gender);
        p15.add(genderbox);
        p15.add(l23);

        p17.add(save);
        p17.add(edit);
        p17.add(delete);

        //add JPanels to JFrame
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
        add(p14);
        add(p15);
        add(p16);
        add(p17);
        add(p18);

        setVisible(true);


        //JButton actionListeners

        search.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();


                        if (what.equals("Search")) {
                            System.out.println("Search trainees table");
                            String search = "SELECT * FROM trainees WHERE Trainee_ID = '" + id.getText() +"'";
                            System.out.println(search);

                            try {
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while (s.next()) {
                                    UpdateTrainee.id.setText(String.valueOf(s.getObject("Trainee_ID")));
                                    UpdateTrainee.firstName.setText(String.valueOf(s.getObject("First_Name")));
                                    UpdateTrainee.lastName.setText(String.valueOf(s.getObject("Last_Name")));
                                    UpdateTrainee.emailText.setText(String.valueOf(s.getObject("Email")));
                                    UpdateTrainee.trainer.setText(String.valueOf(s.getObject("Trainer_ID")));
                                    UpdateTrainee.client.setText(String.valueOf(s.getObject("Client_ID")));
                                    UpdateTrainee.genderText.setText(String.valueOf(s.getObject("Gender")));

                                }
                            } catch (Exception t) {
                                System.out.println(t.toString());
                            }

                        }


                    }
                }
        );

        delete.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        QASystems_databaseConnect.buildConnection();

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();


                        if(what.equals("Delete")){

                            try{
                                QASystems_databaseConnect.stat.executeUpdate("DELETE FROM trainees WHERE Trainee_ID = '" + id.getText() +"'" );
                                System.out.println("Delete records from the trainees table");
                            } catch (SQLException e1) {
                                System.out.println(e1.toString());
                            }


                        }

                    }
                }
        );

        save.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        QASystems_databaseConnect.buildConnection();

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();
                        int firstlength = firstName.getColumns(), lastlength = lastName.getColumns(), emaillength = emailText.getColumns();

                        if (what.equals("Save")){
                            try {
                                String query = "INSERT INTO trainees VALUES(TraineeID('" + genderbox.getSelectedItem() + "', '" + firstName.getText() + "'), '" + firstName.getText() + "', '" + lastName.getText() + "', '" + emailText.getText() + "', '" + client.getText() + "', '" + trainer.getText() + "', '" + genderbox.getSelectedItem() + "')";
                                System.out.println(query);
                                QASystems_databaseConnect.stat.execute(query);
                                if (firstName.getText().length() > firstlength){
                                    new Invalid_Details();
                                }
                                if (lastName.getText().length() > lastlength){
                                    new Invalid_Details();
                                }
                                if (emailText.getText().length() > emaillength){
                                    new Invalid_Details();
                                }

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
                                String query = "UPDATE trainees SET First_Name = '" + firstName.getText() + "', Last_Name = '" + lastName.getText() + "', Email = '" + emailText.getText() + "', Client_ID = '" + client.getText() + "', Trainer_ID = '" + trainer.getText() + "', Gender = '" + genderText.getText() + "' WHERE Trainee_ID = '" + id.getText() + "'";
                                System.out.println(query);
                                QASystems_databaseConnect.stat.executeUpdate("UPDATE trainees SET First_Name = '" + firstName.getText() + "', Last_Name = '" + lastName.getText() + "', Email = '" + emailText.getText() + "', Client_ID = '" + client.getText() + "', Trainer_ID = '" + trainer.getText() + "', Gender = '" + genderText.getText() + "' WHERE Trainee_ID = '" + id.getText() + "'");
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }

                }
        );



    }
}
