package unit11;

import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        Frame frame=new Frame("���Դ���");
        //����Panel����
        Panel panel=new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("������"));
        //��Panel������ӵ�frame����
        frame.add(panel);
        frame.setBounds(30,30,250,120);
        frame.setVisible(true);
    }
}
