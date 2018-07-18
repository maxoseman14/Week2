package Friday;

//update client JFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class UpdateClient extends JFrame {

    static JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11;
    static JLabel l1, l2, l3, l4, l5, update_client, client_ID, name, email, sector;
    static JTextField clientText, nameText, emailText, sectorText;
    static JButton search, save, edit, delete;

    public UpdateClient() throws HeadlessException {

        setSize(400, 500);
        setLayout(new GridLayout(11, 1));

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
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        l5 = new JLabel(" ");

        update_client = new JLabel("Update Client ");
        client_ID = new JLabel("Client ID");
        name = new JLabel("Name");
        email = new JLabel("Email");
        sector = new JLabel("Sector");

        clientText = new JTextField(10);
        nameText = new JTextField(10);
        emailText = new JTextField(20);
        sectorText = new JTextField(20);

        search = new JButton("Search");
        save = new JButton("Save");
        edit = new JButton("Edit");
        delete = new JButton("Delete");

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

        save.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Save")) {

                            String clientID, currentMonth = "";
                            Calendar now = Calendar.getInstance();


                            int month = now.get(Calendar.MONTH);
                            if (month == 1) {
                                currentMonth = "Jan";
                            }
                            if (month == 2) {
                                currentMonth = "Feb";
                            }
                            if (month == 3) {
                                currentMonth = "Mar";
                            }
                            if (month == 4) {
                                currentMonth = "Apr";
                            }
                            if (month == 5) {
                                currentMonth = "May";
                            }
                            if (month == 6) {
                                currentMonth = "Jun";
                            }
                            if (month == 7) {
                                currentMonth = "Jul";
                            }
                            if (month == 8) {
                                currentMonth = "Aug";
                            }
                            if (month == 9) {
                                currentMonth = "Sep";
                            }
                            if (month == 10) {
                                currentMonth = "Oct";
                            }
                            if (month == 11) {
                                currentMonth = "Nov";
                            }
                            if (month == 12) {
                                currentMonth = "Dec";
                            }

                            clientID = nameText.getText().substring(0,3) + currentMonth + now.get(Calendar.YEAR);
                            try {
                                QASystems_databaseConnect.stat.executeUpdate("INSERT INTO clients VALUES('" + clientID + "','" + nameText.getText() + "','"
                                        + emailText.getText() + "','" + sectorText.getText() + "')");
                            } catch (SQLException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                }
        );

        search.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Search")) {
                            System.out.println("Search Clients");
                            String search = "SELECT * FROM clients WHERE Client_ID = '" + clientText.getText() + "'";
                            System.out.println(search);

                            try {
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(search);
                                while (s.next()) {
                                    UpdateClient.nameText.setText(String.valueOf(s.getObject("Name")));
                                    UpdateClient.emailText.setText(String.valueOf(s.getObject("Email")));
                                    UpdateClient.sectorText.setText(String.valueOf(s.getObject("Sector")));
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

                        QASystems_databaseConnect.buildConnection();

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        if (what.equals("Delete")) {

                            try {
                                QASystems_databaseConnect.stat.executeUpdate("DELETE FROM clients WHERE Client_ID = '"
                                        + clientText.getText() + "'");
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
                                PreparedStatement ps = QASystems_databaseConnect.con.prepareStatement("UPDATE clients SET `Name`=?, `Email`=?, `Sector`=? WHERE `Client_ID`=?;");
                                ps.setString(1,nameText.getText());
                                ps.setString(2,emailText.getText());
                                ps.setString(3,sectorText.getText());
                                ps.setString(4,clientText.getText());
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

