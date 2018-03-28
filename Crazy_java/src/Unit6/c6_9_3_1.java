package Unit6;

/**
 * 枚举类的成员变量，方法，构造器
 */
enum Gender{//性别
    MALE("男"),FEMALE("女");
    private final String name;
    Gender(String name) {
        this.name = name;
    }
//    public void setName(String name){
//        switch (this){
//            case MALE:
//                if (name.equals("男")){
//                    this.name=name;
//                }else{
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//            case FEMALE:
//                if (name.equals("女")){
//                    this.name=name;
//                }else {
//                    System.out.println("参数错误");
//                    return;
//                }
//                break;
//        }
//    }
//    public String  getName(){
//        return this.name;
//    }

    public String getName() {
        return this.name;
    }
}
public class c6_9_3_1 {
    public static void main(String[] args) {
        /**
         * 枚举类的产生方式与一般的类不一样
         */
        System.out.println(Gender.FEMALE);
        System.out.println(Gender.FEMALE.getName());
    }
}
