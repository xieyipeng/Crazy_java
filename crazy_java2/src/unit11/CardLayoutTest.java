package unit11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest {
    Frame frame=new Frame("���Դ���");
    String[] names={"��һ��","�ڶ���","������","������"};
    Panel panel1 =new Panel();
    public void init(){
        final  CardLayout cardLayout=new CardLayout();
        panel1.setLayout(cardLayout);
        for (int i = 0; i < names.length; i++) {
            panel1.add(names[i],new Button(names[i]));
        }
        Panel panel2=new Panel();
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()){
                    case "��һ��":
                        cardLayout.previous(panel1);
                        break;
                    case "��һ��":
                        cardLayout.next(panel1);
                        break;
                    case "��һ��":
                        cardLayout.first(panel1);
                        break;
                    case "���һ��":
                        cardLayout.last(panel1);
                        break;
                    case "������":
                        cardLayout.show(panel1,"������");
                    default:
                        break;
                }
            }
        };

        Button previous=new Button("��һ��");
        previous.addActionListener(listener);
        Button next=new Button("��һ��");
        next.addActionListener(listener);
        Button first=new Button("��һ��");
        first.addActionListener(listener);
        Button last=new Button("���һ��");
        last.addActionListener(listener);
        Button third=new Button("������");
        third.addActionListener(listener);

        panel2.add(previous);
        panel2.add(next);
        panel2.add(first);
        panel2.add(last);
        panel2.add(third);

        frame.add(panel1);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CardLayoutTest().init();
    }
}
