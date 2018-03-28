package Unit7;

import java.io.File;
import java.util.Scanner;

/**
 * 使用 Scanner 获取键盘输入
 * Scanner 是基于正则表达式的文本扫描器
 * Scanner 的两个主要方法
 *      1、hasNextXxx();  判断是否还有下一项
 *      2、nextXxx();     获取下一个输入项
 *
 * throws Exception 表明主程序不做任何异常处理
 */
public class c7_1_2 {
    public static void main(String[] args) throws Exception{
//        Scanner scanner=new Scanner(System.in);
//        while (scanner.hasNext()){
//            System.out.println("内容："+scanner.next());
//        }
        //读取文件
        Scanner scanner=new Scanner(new File("F:\\VS-community\\View.txt"));
        System.out.println("内容如下：");
        while (scanner.hasNextLine()){
            //按行读取
            System.out.println(scanner.nextLine());
        }
    }
}
