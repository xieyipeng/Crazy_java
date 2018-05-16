package unit15;

import java.io.FileReader;
import java.io.IOException;

public class FilderReaderTest {
    public static void main(String[] args) throws IOException{
        try (
                FileReader fileReader=new FileReader("FilderReaderTest.java"))
        {
            char[] chars=new char[32];
            int hasRead=0;
            while ((hasRead=fileReader.read(chars))>0){
                System.out.println(new String(chars,0,hasRead));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
