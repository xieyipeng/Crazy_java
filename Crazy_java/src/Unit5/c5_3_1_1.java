package Unit5;

/**
 * ��Ա�����;ֲ�����
 */

class Person{
    public String name;//ʵ������
    public static int eyeNum;//�����
}

public class c5_3_1_1 {
    public static void main(String[] args) {
        //�Զ���ʼ��
        System.out.println("Person��eyeNum�����ֵ"+Person.eyeNum);
        Person p=new Person();
        //ͨ��person����������name����
        System.out.println("Person��eyeNum�����ֵ��nameʵ������ֵΪ��"+p.eyeNum+" "+p.name);
        p.name="�����";
        Person.eyeNum=2;
        System.out.println("Person��eyeNum�����ֵ��nameʵ������ֵΪ��"+p.eyeNum+" "+p.name);
        System.out.println("Person��eyeNum�����ֵ"+Person.eyeNum);//ͨ��p�޸�Person��eyeNum;
        Person p2=new Person();
        System.out.println("p2�����eyeNum�����ֵ"+p2.eyeNum);
    }
}