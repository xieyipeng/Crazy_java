package Unit8;

import com.sun.corba.se.impl.encoding.CodeSetConversion;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Set不允许包含重复的元素
 * 1、HasSet
 */

class A{
    public boolean equals(Object object){
        return true;
    }
}

class B{
    public int hashCode(){
        return 1;
    }
}

class C{
    public int hashCode(){
        return 2;
    }
    public boolean equals(Object object){
        return true;
    }
}

public class c8_3_1 {
    public static void main(String[] args) {
        HashSet books=new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
