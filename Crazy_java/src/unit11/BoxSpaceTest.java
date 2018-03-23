package unit11;

import javax.swing.*;
import java.awt.*;

public class BoxSpaceTest {
    private Frame frame=new Frame();
    private Box horizontial=Box.createHorizontalBox();
    private Box vertial=Box.createVerticalBox();
    public void init(){
        horizontial.add(new Button("水平按钮一"));
        horizontial.add(Box.createHorizontalBox());
        horizontial.add(new Button("水平按钮二"));
        //不可拉伸
        horizontial.add(Box.createHorizontalStrut(10));
        horizontial.add(new Button("水平按钮三"));
        vertial.add(new Button("垂直按钮一"));
        vertial.add(Box.createGlue());
        vertial.add(new Button("垂直按钮二"));
        vertial.add(Box.createHorizontalStrut(10));
        vertial.add(new Button("垂直按钮三"));
        frame.add(horizontial,BorderLayout.NORTH);
        frame.add(vertial);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxSpaceTest().init();
    }
}
