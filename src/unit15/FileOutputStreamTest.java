package unit15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException{
        try (
                FileInputStream fileInputStream=new FileInputStream("FileOutputStreamTest.java");
                FileOutputStream fileOutputStream=new FileOutputStream("newFile.java")
        )
        {
            byte[] bytes=new byte[32];
            int hasRead=0;
            while ((hasRead=fileInputStream.read(bytes))>0){
                fileOutputStream.write(bytes,0,hasRead);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
