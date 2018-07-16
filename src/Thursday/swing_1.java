package Thursday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing_1 {

    public static void main(String[] args) {

        JFrame f = new JFrame("JFrame_1");
        JMenuBar bar = new JMenuBar();
        JMenu menu1 = new JMenu("Operation_1");
        JMenu menu2 = new JMenu("Operation_2");

        f.setLayout(new GridLayout(7, 1));

        JMenuItem m1 = new JMenuItem("Addition");
        JMenuItem m2 = new JMenuItem("Subtraction");
        JMenuItem m3 = new JMenuItem("Multiplication");
        JMenuItem m4 = new JMenuItem("Division");

        menu1.add(m1);
        menu1.add(m2);
        menu2.add(m3);
        menu2.add(m4);

        f.add(bar);
        bar.add(menu1);
        bar.add(menu2);

        JPanel jPan1 = new JPanel();
        JPanel jPan2 = new JPanel(new GridLayout(1, 4));
        JPanel jPan3 = new JPanel();
        JPanel jPan4 = new JPanel(new GridLayout(1, 4));
        JPanel jPan5 = new JPanel();
        JPanel jPan6 = new JPanel(new GridLayout(1, 4));
        JPanel jPan7 = new JPanel();

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);

        JLabel l1 = new JLabel(" ");
        JLabel l2 = new JLabel(" ");
        JLabel l3 = new JLabel(" ");
        JLabel l4 = new JLabel(" ");
        JLabel l5 = new JLabel(" ");
        JLabel l6 = new JLabel(" ");
        JLabel no1 = new JLabel("No1");
        JLabel no2 = new JLabel("No2");
        JLabel result = new JLabel("Result");

        //add labels and textfields to JPanel
        jPan2.add(l1);
        jPan2.add(no1);
        jPan2.add(t1);
        jPan2.add(l2);
        jPan4.add(l3);
        jPan4.add(no2);
        jPan4.add(t2);
        jPan4.add(l4);
        jPan6.add(l5);
        jPan6.add(result);
        jPan6.add(t3);
        jPan6.add(l6);

        f.add(jPan1);
        f.add(jPan2);
        f.add(jPan3);
        f.add(jPan4);
        f.add(jPan5);
        f.add(jPan6);
        f.add(jPan7);

        f.setVisible(true);
        f.setJMenuBar(bar);
        f.setSize(400,400);

        //create anonymous inner class (class doesn't have a name)
        m1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Addition");
                        int result;
                        result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(result));

                    }
                }
        );
        m2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Subtraction");
                        int result;
                        result = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(result));

                    }
                }
        );
        m3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Multiplication");
                        int result;
                        result = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(result));

                    }
                }
        );
        m4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Division");
                        int result;
                        result = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
                        t3.setText(String.valueOf(result));

                    }
                }
        );












    }


}
