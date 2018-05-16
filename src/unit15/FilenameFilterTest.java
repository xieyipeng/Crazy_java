package unit15;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
    public static void main(String[] args) {
        File file=new File(".");
        String[] nameList=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java")||new File(name).isDirectory();
            }
        });
        for (String name
                :nameList
             ) {
            System.out.println(name);
        }
    }
}
