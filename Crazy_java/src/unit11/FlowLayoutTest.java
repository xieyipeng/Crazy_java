package unit11;

import java.awt.*;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame frame=new Frame("²âÊÔ´°¿Ú");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        for (int i = 0; i < 10; i++) {
            frame.add(new Button("°´Å¥"+i));
        }
        frame.pack();
        frame.setVisible(true);
    }
}
