package Unit8;

import java.util.WeakHashMap;

/**
 * WeakHashMap
 * HashMap保存了随想的强引用，不会被内存销毁
 * WeakHashMap保存了对象的弱引用，可能被内存回收
 * <p>
 * 当垃圾回收机制回收了该key所对应的实际对象后，WeakHashMap
 * 会自动删除该key对应的key-value对
 */
public class c8_6_6 {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
        weakHashMap.put(new String("语文"), new String("良好"));
        weakHashMap.put(new String("数学"), new String("及格"));
        weakHashMap.put(new String("英语"), new String("中等"));
        //再添加一个key-value对,key是系统缓存的字符串对象
        //该key是一个字符串类型的直接量
        //垃圾回收机制不回收他
        weakHashMap.put("java", new String("中等"));
        //输出4个
        System.out.println("first  " + weakHashMap);
        //通知系统进行垃圾回收
        System.gc();
        System.runFinalization();
        //通常情况下，将只看到一个key-value对
        System.out.println("last  " + weakHashMap);
    }
}
