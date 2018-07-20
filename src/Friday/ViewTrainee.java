package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewTrainee extends JFrame{

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16,
            p17, p18, p19, p20;

    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16,
            l17, l18, l19, l20, l21, l22, l23, trainee_ID, client_ID, first_name, last_name,
            gender, email, trainer_ID, update_QA;

    static JTextField id, firstName, lastName, emailText, trainer, client,
            genderText;

    static JButton search;

    public ViewTrainee ()throws HeadlessException{

        setSize(400, 700);
        setLayout(new GridLayout(20, 1));

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
        trainee_ID = new JLabel("QA ID ");
        first_name = new JLabel("First Name");
        last_name = new JLabel("Last Name");
        email = new JLabel("Email ");
        trainer_ID = new JLabel("Trainer ID ");
        client_ID = new JLabel("Client ID");
        gender = new JLabel("Gender");

        //JTextfields
        id = new JTextField(10);
        firstName = new JTextField(10);
        lastName = new JTextField(10);
        emailText = new JTextField(15);
        trainer = new JTextField(10);
        client = new JTextField(10);
        genderText = new JTextField(5);

        //JButton
        search = new JButton("Search");

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
        p3.add(l6);

        p5.add(l7);
        p5.add(first_name);
        p5.add(firstName);
        p5.add(l8);

        p7.add(l9);
        p7.add(last_name);
        p7.add(lastName);
        p7.add(l10);

        p9.add(l11);
        p9.add(email);
        p9.add(emailText);
        p9.add(l12);

        p11.add(l13);
        p11.add(trainer_ID);
        p11.add(trainer);
        p11.add(l14);

        p13.add(l15);
        p13.add(client_ID);
        p13.add(client);
        p13.add(l16);

        p15.add(l17);
        p15.add(gender);
        p15.add(genderText);
        p15.add(l18);

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

        setVisible(true);

        //JButton actionlistener

        search.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if(what.equals("Search")){
                            System.out.println("View Trainee");
                            String search = "SELECT*FROM trainees WHERE Trainee_ID = '" + id.getText() + "'";
                            System.out.println(search);

                            try{
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while (s.next()){
                                    ViewTrainee.id.setText(String.valueOf(s.getObject("Trainee_ID")));
                                    ViewTrainee.firstName.setText(String.valueOf(s.getObject("First_Name")));
                                    ViewTrainee.lastName.setText(String.valueOf(s.getObject("Last_Name")));
                                    ViewTrainee.emailText.setText(String.valueOf(s.getObject("Email")));
                                    ViewTrainee.trainer.setText(String.valueOf(s.getObject("Trainer_ID")));
                                    ViewTrainee.client.setText(String.valueOf(s.getObject("Client_ID")));
                                    ViewTrainee.genderText.setText(String.valueOf(s.getObject("Gender")));
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
