package Unit8;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/**
 * �����Ľӿڣ�Enumeration
 * Enumeration������ֻ����������Vector��Hashtable���ֹ��ϵļ���
 */
public class c8_9 {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add("���java����");
        vector.add("������java EE��ҵӦ��ʵ��");
        Hashtable hashtable=new Hashtable();
        hashtable.put("����","80");
        hashtable.put("��ѧ","83");
        Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        Enumeration enumeration1=hashtable.keys();
        while (enumeration1.hasMoreElements()){
            Object object=enumeration1.nextElement();
            System.out.println("key "+hashtable.get(object));
        }
    }
}
