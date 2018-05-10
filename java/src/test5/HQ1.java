package test5;

public class HQ1 {
    public void judge(Java_Teacher java_teacher){
        java_teacher.introduction();
        java_teacher.lesson();
    }
    public void judge(DotNetTeacher dotNetTeacher){
        dotNetTeacher.introduction();
        dotNetTeacher.lesson();
    }

    public static void main(String[] args) {
        HQ1 hq1=new HQ1();
        hq1.judge(new Java_Teacher("张三","java老师"));
        hq1.judge(new DotNetTeacher("李四","DotNet老师"));
    }

}
