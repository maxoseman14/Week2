package Friday;

//Update Trainer JFrame

import javax.swing.*;
import java.awt.*;

public class UpdateTrainer extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, update_Trainer,
    trainerID, firstnName, lastName, email, gender;
    JTextField trainerText, firstText, lastText, emailText, genderText;
    JButton search, save, edit, delete;

    public UpdateTrainer () throws HeadlessException{

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
        firstnName = new JLabel("First Name");
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
        p5.add(firstnName);
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







    }







}
