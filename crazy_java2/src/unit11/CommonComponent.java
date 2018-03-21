package unit11;

import javax.swing.*;
import java.awt.*;

public class CommonComponent {
    Frame frame=new Frame();
    Button ok=new Button("ȷ��");
    //��ѡ��
    CheckboxGroup checkboxGroup=new CheckboxGroup();
    Checkbox male=new Checkbox("��",checkboxGroup,true);
    Checkbox female=new Checkbox("Ů",checkboxGroup,false);
    //��ѡ��
    Checkbox married=new Checkbox("�Ƿ��ѻ飿",false);
    //����ѡ���
    Choice colorChooser=new Choice();
    List colorList=new List(6,true);
    //�����ı���
    TextArea textArea=new TextArea(5,20);
    //�����ı�
    TextField name=new TextField();
    public void init(){
        colorChooser.add("��ɫ");
        colorChooser.add("��ɫ");
        colorChooser.add("��ɫ");
        colorList.add("��ɫ");
        colorList.add("��ɫ");
        colorList.add("��ɫ");
        //����һ��װ�����ı��򣬰�ť��Panel
        Panel bottom=new Panel();
        bottom.add(name);
        bottom.add(ok);
        frame.add(bottom, BorderLayout.SOUTH);
        //����һ��װ��������ѡ�������Checkbox��Panel
        Panel checkPanel=new Panel();
        checkPanel.add(colorChooser);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);
        //����һ����ֱ���е�Box��װ���ı���Panel
        Box topLeft=Box.createVerticalBox();
        topLeft.add(textArea);
        topLeft.add(checkPanel);
        //����ˮƽ���е������װ��topLeft��colorList
        Box top=Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);
        //��top��Box������ӵ������м�
        frame.add(top);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CommonComponent().init();
    }
}
