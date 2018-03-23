package unit11;

import java.awt.*;

public class FrameTest {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口");
        //设置窗口大小，位置；
        frame.setBounds(30,30,250,200);
        //将窗口显示出来
        frame.setVisible(true);
    }
}
