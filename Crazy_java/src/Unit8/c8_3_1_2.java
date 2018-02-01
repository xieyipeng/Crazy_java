package Unit8;

import java.util.HashSet;
import java.util.Iterator;

/**
 * ��дhashSet����
 *
 * ������Ҫ��hashSet����ӿɱ����
 *
 */

class R {
    int count;

    public R(int count) {
        this.count = count;
    }

    public String toString() {
        return "R[count:" + count + "]";
    }

    public boolean equals(Object object){
        if (this==object){
            return true;
        }
        if (object!=null&&object.getClass()==R.class){
            R r=(R)object;
            return this.count==r.count;
        }
        return false;
    }

    public int hashCode(){
        return this.count;
    }

}

public class c8_3_1_2 {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(new R(5));
        hashSet.add(new R(-3));
        hashSet.add(new R(9));
        hashSet.add(new R(-2));
        System.out.println("hashSet:"+hashSet);
        //ȡ����һ��Ԫ��
        Iterator iterator=hashSet.iterator();
        R first=(R)iterator.next();
        //**
        first.count=-3;
        //���ظ�Ԫ��
        System.out.println("�޸Ĺ���hashSet()"+hashSet);
        //ɾ��countΪ-3�Ķ���
        //hashSet.remove(3);   **����
        hashSet.remove(new R(-3));
        //����hashSet���ܾ�׼�ķ���Ԫ��
        System.out.println("�޸Ĺ���hashSet()"+hashSet);
        System.out.println("�Ƿ����-3��R����"+hashSet.contains(new R(-3)));
        System.out.println("�Ƿ����-2��R����"+hashSet.contains(new R(-2)));
    }
}
