package Unit8;

import java.util.Hashtable;

/**
 * HashMap��HashTableʵ����
 * ���ܱ���˳��
 *    ����ʹ�ÿɱ������ΪHashMap��HashTable��key�������޸�����Ϊkey�Ŀɱ����
 * ��ô��������޷�׼ȷ�ķ���Map�б��޸Ĺ���key
 */
class D{
    int count;

    public D(int count) {
        this.count = count;
    }

    public boolean equals(Object object){
        if (object==this){
            return true;
        }
        if (object!=null&&object.getClass()==D.class){
            D d=(D)object;
            return this.count==d.count;
        }
        return false;
    }

    public int hashCode(){
        return this.count;
    }
}
class E{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
public class c8_6_2 {
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put(new D(60000),"���java����");
        hashtable.put(new D(87563),"������java EE��ҵӦ��ʵս");
        hashtable.put(new D(12321), new E());
        //���
        System.out.println(hashtable);
        //equals()����
        System.out.println(hashtable.containsValue("�����ַ���"));
        System.out.println(hashtable.containsKey(new D(87563)));
        hashtable.remove(new D(12321));
        System.out.println(hashtable);
    }
}
