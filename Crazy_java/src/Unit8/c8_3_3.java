package Unit8;

import java.util.TreeSet;

/**
 * TreeSet
 * 是SortedSet接口实现的
 * 可以使得集合元素处于排序状态
 * 支持两种排序方式：
 * 一、自然排序：
 * 1、调用compareTo()方法比较大小
 * 2、升序排列
 * 3、集合内部只能是同一类对象，必须实现Compare接口
 * 4、若两个对象比较大小相等，则新对象无法添加到集合中
 * 5、Compare方法返回0，则表示相等
 * 6、添加可变对象后，更改对象，TreeSet不会再次调整他们的顺序，
 * 这可能导致删除失败
 * 二、定制排序
 * 1、需要在创建TreeSet集合时提供一个Compare对象与该TreeSet集合关联
 * 2、实现逆序排序
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
        //输出第一个元素
        System.out.println(nums.first());
        //最后一个
        System.out.println(nums.last());
        //返回小于4的集合
        System.out.println(nums.headSet(4));
        //返回大于等于5的集合
        System.out.println(nums.tailSet(5));
        //返回大于-3小于4的集合
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
        //实现逆序排序
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
