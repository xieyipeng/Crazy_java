package test5;

public class DotNetTeacher extends Teacher {
    String name;
    String introduce;

    public DotNetTeacher(String name, String introduce) {
        this.name = name;
        this.introduce = introduce;
    }

    @Override
    public void introduction() {
        System.out.println("我叫" + name + ",我的简历：" + introduce);
    }

    @Override
    public void lesson() {
        System.out.println("上DotNet课");
    }
}