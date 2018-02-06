package Unit8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Properties是HashTable的子类
 * 使用Properties读写属性文件
 */
public class c8_6_4 {
    public static void main(String[] args)
            throws Exception{
        Properties properties=new Properties();
        //向properties中添加数据
        properties.setProperty("username","yeeku");
        properties.setProperty("password","123456");
        //将Properties的key-value对写入文件
        properties.store(new FileOutputStream("F:\\github\\Crazy_java\\Crazy_java\\src\\Unit8\\a.ini")
                ,"comment line");
        Properties properties1=new Properties();
        properties1.setProperty("gender","male");
        properties1.load(new FileInputStream("F:\\github\\Crazy_java\\Crazy_java\\src\\Unit8\\a.ini"));
        System.out.println(properties1);
    }
}
