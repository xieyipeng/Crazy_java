package Unit8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Properties��HashTable������
 * ʹ��Properties��д�����ļ�
 */
public class c8_6_4 {
    public static void main(String[] args)
            throws Exception{
        Properties properties=new Properties();
        //��properties���������
        properties.setProperty("username","yeeku");
        properties.setProperty("password","123456");
        //��Properties��key-value��д���ļ�
        properties.store(new FileOutputStream("F:\\github\\Crazy_java\\Crazy_java\\src\\Unit8\\a.ini")
                ,"comment line");
        Properties properties1=new Properties();
        properties1.setProperty("gender","male");
        properties1.load(new FileInputStream("F:\\github\\Crazy_java\\Crazy_java\\src\\Unit8\\a.ini"));
        System.out.println(properties1);
    }
}
