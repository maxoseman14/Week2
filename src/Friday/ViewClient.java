package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewClient extends JFrame{

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14;
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, view_client, client_ID, name, email, start_date, end_date, sector;
    static JTextField clientText, nameText, emailText, startText, endText, sectorText;
    static JButton search;


    public ViewClient () throws HeadlessException {


        setSize(400, 500);
        setLayout(new GridLayout(14, 1));

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
        p11 = new JPanel(new GridLayout(1, 4));
        p12 = new JPanel();
        p13 = new JPanel(new GridLayout(1, 4));
        p14 = new JPanel();

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

        view_client = new JLabel("View Client ");
        client_ID = new JLabel("Client ID");
        name = new JLabel("Name");
        email = new JLabel("Email");
        start_date = new JLabel("Start Date");
        end_date = new JLabel("End Date");
        sector = new JLabel("Sector");

        clientText = new JTextField(10);
        nameText = new JTextField(10);
        emailText = new JTextField(20);
        startText = new JTextField(15);
        endText = new JTextField(15);
        sectorText = new JTextField(20);

        search = new JButton("Search");

        p1.add(l1);
        p1.add(view_client);
        p1.add(l2);

        p3.add(l3);
        p3.add(client_ID);
        p3.add(clientText);
        p3.add(search);

        p5.add(l4);
        p5.add(name);
        p5.add(nameText);
        p5.add(l5);

        p7.add(l6);
        p7.add(email);
        p7.add(emailText);
        p7.add(l7);

        p9.add(l8);
        p9.add(start_date);
        p9.add(startText);
        p9.add(l9);

        p11.add(l10);
        p11.add(end_date);
        p11.add(endText);
        p11.add(l11);

        p13.add(l12);
        p13.add(sector);
        p13.add(sectorText);
        p13.add(l13);

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

        setVisible(true);

        search.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if(what.equals("Search")){
                            System.out.println("Search Clients");
                            String search = "SELECT * FROM clients WHERE Client_ID = '" + clientText.getText() + "'";
                            System.out.println(search);

                            try{
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while(s.next()){
                                    ViewClient.clientText.setText(String.valueOf(s.getObject("Client_ID")));
                                    ViewClient.nameText.setText(String.valueOf(s.getObject("Name")));
                                    ViewClient.emailText.setText(String.valueOf(s.getObject("Email")));
                                    ViewClient.startText.setText(String.valueOf(s.getObject("Start_Date")));
                                    ViewClient.endText.setText(String.valueOf(s.getObject("End_Date")));
                                    ViewClient.sectorText.setText(String.valueOf(s.getObject("Sector")));
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
