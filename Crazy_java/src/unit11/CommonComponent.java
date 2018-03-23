package unit11;

import javax.swing.*;
import java.awt.*;

public class CommonComponent {
    Frame frame=new Frame();
    Button ok=new Button("确认");
    //单选框
    CheckboxGroup checkboxGroup=new CheckboxGroup();
    Checkbox male=new Checkbox("男",checkboxGroup,true);
    Checkbox female=new Checkbox("女",checkboxGroup,false);
    //复选框
    Checkbox married=new Checkbox("是否已婚？",false);
    //下拉选择框
    Choice colorChooser=new Choice();
    List colorList=new List(6,true);
    //多行文本域
    TextArea textArea=new TextArea(5,20);
    //单行文本
    TextField name=new TextField();
    public void init(){
        colorChooser.add("红色");
        colorChooser.add("绿色");
        colorChooser.add("蓝色");
        colorList.add("红色");
        colorList.add("绿色");
        colorList.add("蓝色");
        //创建一个装载了文本框，按钮的Panel
        Panel bottom=new Panel();
        bottom.add(name);
        bottom.add(ok);
        frame.add(bottom, BorderLayout.SOUTH);
        //创建一个装载了下拉选择框，三个Checkbox的Panel
        Panel checkPanel=new Panel();
        checkPanel.add(colorChooser);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        //创建一个垂直排列的Box，装在文本，Panel
        Box topLeft=Box.createVerticalBox();
        topLeft.add(textArea);
        topLeft.add(checkPanel);
        //创建水平排列的组件，装在topLeft，colorList
        Box top=Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);
        //将top，Box容器添加到窗口中间
        frame.add(top);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CommonComponent().init();
    }
}
