package unit11;

import java.awt.*;
import static java.awt.BorderLayout.*;

public class BoarderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("���Դ���");
        f.setLayout(new BorderLayout(30, 5));
        f.add(new Button("��") , SOUTH);
        f.add(new Button("��") , NORTH);
        f.add(new Button("��"));
        f.add(new Button("��") , EAST);
        f.add(new Button("��") , WEST);
        f.pack();
        f.setVisible(true);
    }
}
