package unit15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream=new FileInputStream("FileInputStreamTest.java");
        //创建长度为1042的竹筒
        byte[] bytes=new byte[1024];
        //用于保存实际读取的字节数
        int hasRead=0;
        while ((hasRead=fileInputStream.read(bytes))>0){
            //去除竹筒中的水滴，将字节数组转换成字符转输入
            System.out.println(new String(bytes,0,hasRead));
        }
        fileInputStream.close();
    }
}
