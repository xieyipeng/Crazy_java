package unit11;

import java.awt.*;

public class PanelTest {
    public static void main(String[] args) {
        Frame frame=new Frame("测试窗口");
        //创建Panel容器
        Panel panel=new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("单机我"));
        //将Panel容器添加到frame窗口
        frame.add(panel);
        frame.setBounds(30,30,250,120);
        frame.setVisible(true);
    }
}
