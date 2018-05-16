package unit11;

import javax.swing.*;
import java.awt.*;

public class BoxTest {
    private Frame frame=new Frame("测试");
    //定义水平摆放的组建的Box对象
    private Box horizontal=Box.createHorizontalBox();
    //定义垂直摆放的组建的Box对象
    private Box vertical=Box.createVerticalBox();
    public void init(){
        horizontal.add(new Button("水平按钮一"));
        horizontal.add(new Button("水平按钮二"));
        vertical.add(new Button("垂直按钮一"));
        vertical.add(new Button("垂直按钮二"));
        frame.add(horizontal,BorderLayout.NORTH);
        frame.add(vertical);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new BoxTest().init();
    }
}
