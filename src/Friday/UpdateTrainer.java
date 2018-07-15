package Friday;

import javax.swing.*;
import java.awt.*;

public class UpdateTrainer extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, update_Trainer;
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

        trainerText = new JTextField(10);
        firstText = new JTextField(10);
        lastText = new JTextField(10);
        emailText = new JTextField(10);
        genderText = new JTextField(10);

        search = new JButton("Search");
        save = new JButton("Save");
        edit = new JButton("Edit");
        delete = new JButton("Delete");







    }







}
