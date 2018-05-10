package test5;

public class Demo {
    public static void main(String[] args) {
        HQ3 hq3=new HQ3();
        Java_Teacher java_teacher=new Java_Teacher("张三","java老师");
        DotNetTeacher dotNetTeacher=new DotNetTeacher("李四","DotNet老师");
        DBTeacher dbTeacher=new DBTeacher("王五","数据库老师");
        hq3.judge(java_teacher);
        hq3.judge(dotNetTeacher);
        hq3.judge(dbTeacher);
    }
}
