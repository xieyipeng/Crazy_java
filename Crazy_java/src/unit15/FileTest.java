package unit15;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException{
        File file=new File(".");
        System.out.println(file.getName());
        //获取相对路径的父路径
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径下创建一个文件
        File tempFile=File.createTempFile("aaa",".txt",file);
        //当JVM退出时删除该文件
        tempFile.deleteOnExit();
        //以当前时间为文件名创建新文件
        File newFile=new File(System.currentTimeMillis()+"");
        System.out.println("newFile对象是否存在："+newFile.exists());
        //以指定newFile文件创建一个文件
        newFile.createNewFile();
        //以newFile文件创建一个目录，因为newFile文件已经存在,所以返回false
        newFile.mkdir();
        //使用List方法列出当前路径下的所有文件和路径
        String[] fileList=file.list();
        System.out.println("当前路径下的所有文件");
        for (String fileName
                :fileList
             ) {
            System.out.println(fileName);
        }
        //listRoots方法列出所有磁盘的根路径
        File[] roots=File.listRoots();
        for (File root :
                roots) {
            System.out.println(root);
        }
    }
}
