package unit15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
    public static void main(String[] args) {
        try (
                InputStreamReader inputStreamReader=new InputStreamReader(System.in);
                BufferedReader bufferedReader=new BufferedReader(inputStreamReader)
                ){
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                if (line.equals("exit")){
                    System.exit(1);
                }
                System.out.println("输入内容为："+line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
