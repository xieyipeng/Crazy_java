package unit11;

import java.awt.*;
import static java.awt.BorderLayout.*;

public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame frame=new Frame("测试窗口");
        frame.setLayout(new BorderLayout(30,5));
        frame.add(new Button("南") , SOUTH);
        frame.add(new Button("北") , NORTH);
        Panel panel=new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("点击我"));
        frame.add(panel);
        frame.add(new Button("东") , EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
