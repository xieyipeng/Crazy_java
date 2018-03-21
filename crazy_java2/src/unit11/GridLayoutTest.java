package unit11;

import java.awt.*;
import static java.awt.BorderLayout.*;

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame frame=new Frame("¼ÆËãÆ÷");
        Panel panel1=new Panel();
        panel1.add(new TextField(30));
        frame.add(panel1,NORTH);
        Panel panel2=new Panel();
        panel2.setLayout(new GridLayout(3,5,4,4));
        String[] name={"0","1","2","3","4","5","6","7","8","9","+","-","*","/","."};
        for (int i = 0; i < name.length; i++) {
            panel2.add(new Button(name[i]));
        }
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }
}
