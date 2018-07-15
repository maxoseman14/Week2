package Friday;

import javax.swing.*;
import java.awt.*;

public class UpdateClient extends JFrame {

    JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    JLabel l1, l2, l3, l4, l5, update_client, client_ID, name, email, sector;
    JTextField clientText, nameText, emailText, sectorText;
    JButton search, save, edit, delete;

    public UpdateClient() throws HeadlessException{

        setSize(400, 500);
        setLayout(new GridLayout(9, 1));

        p1 = new JPanel(new GridLayout(1, 3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1, 3));
        p4 = new JPanel();
        p5 = new JPanel(new GridLayout(1, 3));
        p6 = new JPanel();
        p7 = new JPanel(new GridLayout(1, 3));
        p8 = new JPanel();
        p9 = new JPanel(new GridLayout(1, 3));
        p10 = new JPanel();
        p11 = new JPanel(new GridLayout(1, 3));

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        update_client = new JLabel("Update Client ");
        client_ID = new JLabel("Client ID");
        name = new JLabel("Name");
        email = new JLabel("Email");
        sector = new JLabel("Sector");

        clientText = new JTextField(10);
        nameText = new JTextField(10);
        emailText = new JTextField(20);
        sectorText = new JTextField(20);

        search = new JButton();
        save = new JButton();
        edit = new JButton();
        delete = new JButton();

        p1.add(l1);
        p1.add(update_client);
        p1.add(l2);

        p3.add(client_ID);
        p3.add(clientText);
        p3.add(search);

        p5.add(name);
        p5.add(l3);
        p5.add(nameText);

        p7.add(email);
        p7.add(l4);
        p7.add(emailText);

        p9.add(sector);
        p9.add(l5);
        p9.add(sectorText);

        p11.add(save);
        p11.add(edit);
        p11.add(delete);

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

        setVisible(true);










    }



}
