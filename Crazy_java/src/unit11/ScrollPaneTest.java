package unit11;

import java.awt.*;

public class ScrollPaneTest {
    public static void main(String[] args) {
        Frame frame=new Frame("测试窗口");
        //创建ScrollPane容器
        ScrollPane scrollPane=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        scrollPane.add(new TextField(20));
        scrollPane.add(new Button("单机我"));
        frame.add(scrollPane);
        frame.setBounds(30,30,250,120);
        frame.setVisible(true);
    }
}
