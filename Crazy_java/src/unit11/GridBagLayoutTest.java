package unit11;

import java.awt.*;

public class GridBagLayoutTest {

    private Frame frame=new Frame("测试窗口");
    private GridBagLayout gridBagLayout=new GridBagLayout();
    private GridBagConstraints gridBagConstraints=new GridBagConstraints();
    private Button[] buttons=new Button[10];

    public void init(){
        frame.setLayout(gridBagLayout);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i]=new Button("按钮"+i);
        }
        //所有组建可以在横向，纵向上扩大
        gridBagConstraints.fill=GridBagConstraints.BOTH;
        gridBagConstraints.weightx=1;
        addButton(buttons[0]);
        addButton(buttons[1]);
        addButton(buttons[2]);
        //该gridBagConstraints控制的GUI成为横向最后一个组件
        gridBagConstraints.gridwidth=GridBagConstraints.REMAINDER;
        addButton(buttons[3]);
        //该gridBagConstraints控制的GUI在横向上不会扩大
        gridBagConstraints.weightx=0;
        addButton(buttons[4]);
        //该gridBagConstraints控制的GUI横跨两个网格
        gridBagConstraints.gridwidth=2;
        addButton(buttons[5]);
        // 该GridBagConstraints控制的GUI组件将横跨一个网格
        gridBagConstraints.gridwidth = 1;
        // 该GridBagConstraints控制的GUI组件将纵向跨两个网格
        gridBagConstraints.gridheight = 2;
        // 该GridBagConstraints控制的GUI组件将会成为横向最后一个元素
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        addButton(buttons[6]);
        // 该GridBagConstraints控制的GUI组件将横向跨越一个网格，纵向跨越2个网格。
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 2;
        // 该GridBagConstraints控制的GUI组件纵向扩大的权重是1
        gridBagConstraints.weighty = 1;
        addButton(buttons[7]);
        // 设置下面的按钮在纵向上不会扩大
        gridBagConstraints.weighty = 0;
        // 该GridBagConstraints控制的GUI组件将会成为横向最后一个元素
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        // 该GridBagConstraints控制的GUI组件将纵向上横跨一个网格
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
