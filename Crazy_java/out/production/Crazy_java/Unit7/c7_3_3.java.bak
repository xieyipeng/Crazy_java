package Unit7;

/**
 * String
 *      不可变类
 * StringBuffer
 *      可变，变成自己想要的之后可调用 toString() 转换成 String
 * StringBuilder
 *      和 StringBuffer 基本相似，多考虑了线程安全
 */
public class c7_3_3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        //追加字符串
        stringBuilder.append("java");
        System.out.println(stringBuilder);
        //插入
        stringBuilder.insert(0,"hello ");
        System.out.println(stringBuilder);
        //替换
        stringBuilder.replace(5,6,",");
        System.out.println(stringBuilder);
        //反转
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());   //最大限度
        stringBuilder.setLength(5);
        System.out.println(stringBuilder);
    }
}
