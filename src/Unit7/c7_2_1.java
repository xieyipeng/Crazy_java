package Unit7;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * ϵͳ���
 */
public class c7_2_1 {
    public static void main(String[] args) throws Exception{
        Map<String,String>env=System.getenv();
        //1����ȡϵͳ���еĻ�������
        for (String name:env.keySet()){
            System.out.println(name+" ---> "+env.get(name));
        }
        //2����ȡָ���Ļ�������
        System.out.println("��ȡָ���Ļ�������:");
        System.out.println(System.getenv("JAVA_HOME"));
        //��ȡ����ϵͳ����
        Properties properties=System.getProperties();
        properties.store(new FileOutputStream("propreties.txt"),"System Properties");
        //3������ض���ϵͳ����
        System.out.println("����ض���ϵͳ����:");
        System.out.println(System.getProperty("os.name"));
    }
}
