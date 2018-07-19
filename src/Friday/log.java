package Friday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class log extends JFrame {

    JPanel p1, p2 ,p3 ,p4;
    JTextField log;
    JButton view;
    JLabel l1, l2, l3, l4, reports;

    public log () throws HeadlessException {

        setLayout(new GridLayout(1,3));

        p1 = new JPanel(new GridLayout(1,3));
        p2 = new JPanel();
        p3 = new JPanel(new GridLayout(1,1));
        p4 = new JPanel(new GridLayout(1, 3));

        l1 = new JLabel(" ");
        l2 = new JLabel(" ");
        l3 = new JLabel(" ");
        l4 = new JLabel(" ");
        reports = new JLabel("Reports");

        log = new JTextField();

        view = new JButton("View");

        p1.add(l1);
        p1.add(reports);
        p1.add(l2);

        p3.add(log);

        p4.add(l3);
        p4.add(view);
        p4.add(l4);

        add(p1);
        add(p2);
        add(p3);
        add(p4);

        setSize(400, 500);
        setVisible(true);








    }


}
