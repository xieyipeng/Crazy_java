package unit11;

import java.awt.*;

public class ScrollPaneTest {
    public static void main(String[] args) {
        Frame frame=new Frame("���Դ���");
        //����ScrollPane����
        ScrollPane scrollPane=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        scrollPane.add(new TextField(20));
        scrollPane.add(new Button("������"));
        frame.add(scrollPane);
        frame.setBounds(30,30,250,120);
        frame.setVisible(true);
    }
}
