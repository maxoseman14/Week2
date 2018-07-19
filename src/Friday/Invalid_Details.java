package Friday;

import javax.swing.*;
import java.awt.*;

public class Invalid_Details extends JFrame {

    JPanel p1, p2, p3;
    JLabel l1 , l2, InvalidDet;

    public Invalid_Details () throws HeadlessException {

        p1 = new JPanel();
        p2 = new JPanel(new GridLayout(1,3));
        p3 = new JPanel();

        p2.add(l1);
        p2.add(InvalidDet);
        p2.add(l2);

        add(p1);
        add(p2);
        add(p3);

        

    }
}
