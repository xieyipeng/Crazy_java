package Unit8;

import java.util.TreeSet;

/**
 * TreeSet
 * ��SortedSet�ӿ�ʵ�ֵ�
 * ����ʹ�ü���Ԫ�ش�������״̬
 * ֧����������ʽ��
 * һ����Ȼ����
 * 1������compareTo()�����Ƚϴ�С
 * 2����������
 * 3�������ڲ�ֻ����ͬһ����󣬱���ʵ��Compare�ӿ�
 * 4������������Ƚϴ�С��ȣ����¶����޷���ӵ�������
 * 5��Compare��������0�����ʾ���
 * 6����ӿɱ����󣬸��Ķ���TreeSet�����ٴε������ǵ�˳��
 * ����ܵ���ɾ��ʧ��
 * ������������
 * 1����Ҫ�ڴ���TreeSet����ʱ�ṩһ��Compare�������TreeSet���Ϲ���
 * 2��ʵ����������
 */
class M {
    int age;

    public M(int age) {
        this.age = age;
    }

    public String toString() {
        return "M [age:" + age + "]";
    }

}

public class c8_3_3 {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(10);
        nums.add(-9);
        Integer a = 1;
        System.out.println(nums);
        //�����һ��Ԫ��
        System.out.println(nums.first());
        //���һ��
        System.out.println(nums.last());
        //����С��4�ļ���
        System.out.println(nums.headSet(4));
        //���ش��ڵ���5�ļ���
        System.out.println(nums.tailSet(5));
        //���ش���-3С��4�ļ���
        System.out.println(nums.subSet(-3, 4));

//        TreeSet treeSet=new TreeSet(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                M m1=(M)o1;
//                M m2=(M)o2;
//                return m1.age>m2.age ? -1
//                        : m1.age<m2.age ? 1 : 0;
//            }
//        });
        //ʵ����������
        TreeSet treeSet=new TreeSet((o1, o2) -> {
            M m1=(M)o1;
            M m2=(M)o2;
            return m1.age>m2.age ? -1
                    : m1.age<m2.age ? 1 : 0;
        });

        treeSet.add(new M(5));
        treeSet.add(new M(-3));
        treeSet.add(new M(9));
        System.out.println(treeSet);
    }
}
