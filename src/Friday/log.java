package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class log extends JFrame {

    static JPanel p1, p2 ,p3;
    static JTextField trainees, clientText;
    static JButton view;
    static JLabel l1, l2, reports, clientID;

    public log () throws HeadlessException {


        setLayout(new GridLayout(3,1));

        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel(new GridLayout(1,3));
        p3 = new JPanel(new GridLayout(1, 1));

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        clientID = new JLabel("Client ID");
        reports = new JLabel("View Trainees");

        trainees = new JTextField(100);
        clientText = new JTextField(20);
        trainees.setSize(400, 400);

        view = new JButton("View");

        p1.add(l1);
        p1.add(reports);
        p1.add(l2);

        p2.add(clientID);
        p2.add(clientText);
        p2.add(view);

        p3.add(trainees);

        add(p1);
        add(p2);
        add(p3);

        setSize(400, 500);
        setVisible(true);


        view.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        JButton button;
                        button = (JButton) e.getSource();
                        String what = button.getText();

                        String traineeIDs = "";
                        if(what.equals("View")){
                            String view = "SELECT Trainee_ID FROM trainees WHERE Client_ID = '" + clientText.getText() + "'";
                            System.out.println(view);

                            try{
                                ResultSet s = QASystems_databaseConnect.stat.executeQuery(view);
                                while (s.next()) {
                                    traineeIDs += s.getObject("Trainee_ID") + " , ";
                                    log.trainees.setText(traineeIDs);
                                    System.out.println(traineeIDs);
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
