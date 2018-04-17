package test5;

public class Java_Teacher extends Teacher{
//    String name;
//    String introduce;
    @Override
    public void getInfo(Teacher teacher) {
        System.out.println("我是"+teacher.getClass());
    }
}
