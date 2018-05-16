package unit15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringBodeTest {
    public static void main(String[] args) throws IOException{
        String string="从明天起做一个幸福的人\n" +
                "喂马，劈柴，周游世界";
        char[] chars=new char[32];
        int hasRead=0;
        try(
                StringReader stringReader=new StringReader(string)
                ) {
            while ((hasRead=stringReader.read(chars))>0){
                System.out.println(new String(chars,0,hasRead));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        try (
                StringWriter stringWriter=new StringWriter()
                ){
            stringWriter.write("有一个美丽的世界");
            System.out.println("stringWriter:");
            System.out.println(stringWriter.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
