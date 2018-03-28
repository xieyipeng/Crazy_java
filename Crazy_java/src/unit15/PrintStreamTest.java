package unit15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws IOException{
        try (
                FileOutputStream fileOutputStream=new FileOutputStream("test.txt");
                PrintStream printStream=new PrintStream(fileOutputStream);
                ){
            printStream.println("普通字符串");
            printStream.println(new PrintStreamTest());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
