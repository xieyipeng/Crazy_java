package unit11;

import java.awt.*;

public class NullLayoutTest {

    Frame frame=new Frame();
    Button button1=new Button("第一个按钮");
    Button button2=new Button("第二个按钮");

    public void init(){
        frame.setLayout(null);
        button1.setBounds(20,30,90,28);
        frame.add(button1);
        button2.setBounds(50,45,120,35);
        frame.add(button2);
        frame.setBounds(50,50,200,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutTest().init();
    }
}
