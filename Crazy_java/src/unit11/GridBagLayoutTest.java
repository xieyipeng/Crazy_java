package unit11;

import java.awt.*;

public class GridBagLayoutTest {

    private Frame frame=new Frame("���Դ���");
    private GridBagLayout gridBagLayout=new GridBagLayout();
    private GridBagConstraints gridBagConstraints=new GridBagConstraints();
    private Button[] buttons=new Button[10];

    public void init(){
        frame.setLayout(gridBagLayout);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i]=new Button("��ť"+i);
        }
        //�����齨�����ں�������������
        gridBagConstraints.fill=GridBagConstraints.BOTH;
        gridBagConstraints.weightx=1;
        addButton(buttons[0]);
        addButton(buttons[1]);
        addButton(buttons[2]);
        //��gridBagConstraints���Ƶ�GUI��Ϊ�������һ�����
        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        addButton(buttons[3]);
        //��gridBagConstraints���Ƶ�GUI�ں����ϲ�������
        gridBagConstraints.weightx=0;
        addButton(buttons[4]);
        //��gridBagConstraints���Ƶ�GUI�����������
        gridBagConstraints.gridwidth=2;
        addButton(buttons[5]);
        // ��GridBagConstraints���Ƶ�GUI��������һ������
        gridBagConstraints.gridwidth = 1;
        // ��GridBagConstraints���Ƶ�GUI������������������
        gridBagConstraints.gridheight = 2;
        // ��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ��Ԫ��
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        addButton(buttons[6]);
        // ��GridBagConstraints���Ƶ�GUI����������Խһ�����������Խ2������
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 2;
        // ��GridBagConstraints���Ƶ�GUI������������Ȩ����1
        gridBagConstraints.weighty = 1;
        addButton(buttons[7]);
        // ��������İ�ť�������ϲ�������
        gridBagConstraints.weighty = 0;
        // ��GridBagConstraints���Ƶ�GUI��������Ϊ�������һ��Ԫ��
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        // ��GridBagConstraints���Ƶ�GUI����������Ϻ��һ������
        gridBagConstraints.gridheight = 1;
        addButton(buttons[8]);
        addButton(buttons[9]);
        frame.pack();
        frame.setVisible(true);
    }

    private void addButton(Button button){
        gridBagLayout.setConstraints(button,gridBagConstraints);
        frame.add(button);
    }

    public static void main(String[] args) {
        new GridBagLayoutTest().init();
    }
}
