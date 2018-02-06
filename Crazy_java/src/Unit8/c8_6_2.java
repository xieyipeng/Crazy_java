package Unit8;

import java.util.Hashtable;

/**
 * HashMap和HashTable实现类
 * 不能保存顺序
 *    若是使用可变对象作为HashMap，HashTable的key，并且修改了作为key的可变对象
 * 那么程序可能无法准确的访问Map中被修改过的key
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
        hashtable.put(new D(60000),"疯狂java讲义");
        hashtable.put(new D(87563),"轻量级java EE企业应用实战");
        hashtable.put(new D(12321), new E());
        //输出
        System.out.println(hashtable);
        //equals()方法
        System.out.println(hashtable.containsValue("测试字符串"));
        System.out.println(hashtable.containsKey(new D(87563)));
        hashtable.remove(new D(12321));
        System.out.println(hashtable);
    }
}
