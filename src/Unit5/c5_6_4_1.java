package Unit5;

/**
 * �����в��ܵ��ø���Ĺ������������Ե��ø��๹�����ĳ�ʼ������
 */
class base{
    public double size;
    public String name;

    public base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}
public class c5_6_4_1 extends base{

    public String color;


    public c5_6_4_1(double size, String name,String color) {
        super(size, name);//���ø��๹�����ĳ�ʼ������
        this.color=color;
    }

    public static void main(String[] args) {
        c5_6_4_1 c5_6_4_1=new c5_6_4_1(5.6,"xiaoming", "red");
        System.out.println(c5_6_4_1.color+"--"+c5_6_4_1.name+"--"+c5_6_4_1.size);
    }

}
