package Unit5;

/**
 * ��̬��ʼ����
 * ��ִ�о�̬��ʼ���飬��ִ����ͨ��ʼ����
 */
class Root{
    static {
        System.out.println("the root static initializer");
    }
    {
        System.out.println("the root initializer");
    }

    public Root() {
        System.out.println("the root construct");
    }
}
class Mid extends Root{
    static {
        System.out.println("the mid static initializer");
    }
    {
        System.out.println("the mid initializer");
    }

    public Mid() {
        System.out.println("the mid construct without number");
    }
    public Mid(String name){
        this();
        System.out.println("the mid construct with number,and the number is:"+name);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("the leaf static initializer");
    }
    {
        System.out.println("the leaf initializer");
    }

    public Leaf() {
        //super();
        super("java");
        System.out.println("the construct of leaf");
    }
}
public class c5_9_3_1 {
    public static void main(String[] args) {
        new Leaf();//��̬��ʼ����ִֻ��һ��
        new Leaf();
    }
}
