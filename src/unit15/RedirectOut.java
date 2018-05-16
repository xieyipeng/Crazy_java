package unit15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class RedirectOut {
    public static void main(String[] args) {
        try (
                PrintStream printStream=new PrintStream(new FileOutputStream("out.txt"))
                ){
            System.setOut(printStream);
            System.out.println("普通字符串");
            System.out.println(new RedirectOut());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
