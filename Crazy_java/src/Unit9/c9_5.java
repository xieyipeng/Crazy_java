package Unit9;

import java.util.ArrayList;
import java.util.List;

/**
 * 擦除和转换
 */
class Apole<T extends Number> {
    T size;

    public Apole() {
    }

    public Apole(T size) {
        this.size = size;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }
}

public class c9_5 {
    public static void main(String[] args) {
        System.out.println("****擦除****");
        Apole<Integer> integerApole1=new Apole<>(6);
        Integer integer=integerApole1.getSize();
        //把integerApole1对象赋给不带泛型信息的integerApole2时，丢失了尖括号里的类型信息
        Apole integerApole2=integerApole1;
        //integerApole2只知道size的类型是Number
        Number size1=integerApole2.getSize();
        //下面代码出错
        //Integer size2=integerApole2.getSize();
        System.out.println("****转换****");
        List<Integer> integerList=new ArrayList<>();
        integerList.add(6);
        integerList.add(9);
        List list=integerList;
        //下面代码引起警告，但是运行编译时完全正常
        List<String> stringList=list;
        //但只要访问里面的元素，将引起运行时异常
        System.out.println(stringList.get(0));
    }
}
