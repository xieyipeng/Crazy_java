package Unit9;

/**
 * 设定类型形参的上限
 */

class Aplle<T extends Number>{

    T col;

    public static void main(String[] args) {
        Aplle<Integer> aplle1=new Aplle<>();
        Aplle<Double> aplle2=new Aplle<>();
        //下面出错
        //Aplle<String> aplle3=new Aplle<>();
    }
}

//为程序类型形参设定多个上限

public class c9_3_3 <T extends Number & java.io.Serializable>{
}
