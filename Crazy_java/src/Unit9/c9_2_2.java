package Unit9;

/**
 * 从泛型派生子类
 */
public class c9_2_2 extends Apple{
    //正确重写父类方法，返回值
    public String getInfo(){
        return "子类"+super.getInfo();
    }
}
