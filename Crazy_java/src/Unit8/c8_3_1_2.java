package Unit8;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 重写hashSet方法
 *
 * 尽量不要向hashSet中添加可变对象
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
        //取出第一个元素
        Iterator iterator=hashSet.iterator();
        R first=(R)iterator.next();
        //**
        first.count=-3;
        //有重复元素
        System.out.println("修改过的hashSet()"+hashSet);
        //删除count为-3的对象
        //hashSet.remove(3);   **不行
        hashSet.remove(new R(-3));
        //导致hashSet不能精准的访问元素
        System.out.println("修改过的hashSet()"+hashSet);
        System.out.println("是否包含-3的R对象"+hashSet.contains(new R(-3)));
        System.out.println("是否包含-2的R对象"+hashSet.contains(new R(-2)));
    }
}
