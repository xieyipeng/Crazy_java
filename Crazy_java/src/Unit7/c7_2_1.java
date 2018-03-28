package Unit7;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * 系统相关
 */
public class c7_2_1 {
    public static void main(String[] args) throws Exception{
        Map<String,String>env=System.getenv();
        //1、获取系统所有的环境变量
        for (String name:env.keySet()){
            System.out.println(name+" ---> "+env.get(name));
        }
        //2、获取指定的环境变量
        System.out.println("获取指定的环境变量:");
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有系统属性
        Properties properties=System.getProperties();
        properties.store(new FileOutputStream("propreties.txt"),"System Properties");
        //3、输出特定的系统属性
        System.out.println("输出特定的系统属性:");
        System.out.println(System.getProperty("os.name"));
    }
}
