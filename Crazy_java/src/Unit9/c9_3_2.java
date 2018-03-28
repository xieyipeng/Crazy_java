package Unit9;

import java.util.List;

/**
 * 设定类型通配符的上限
 */

abstract class Shape{
    public abstract void draw(Canvas canvas);
}

class Circle extends Shape{
    @Override
    public void draw(Canvas canvas) {
        System.out.println("在"+canvas+"上画一个圈");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(Canvas canvas) {
        System.out.println("把一个矩形画在画布"+canvas+"上");
    }
}

//class Canvas{
//    public void drawAll(List<Shape> list){
//        for (Shape shape:list){
//            shape.draw(this);
//        }
//    }
//}

//class Canvas{
//    public void drawAll(List<?> list){
//        for (Object object:list){
//            Shape shape=(Shape)object;
//            shape.draw(this);
//        }
//    }
//}

/**
 * 被限制的泛型通配符
 * List<? extends Shape>
 * 表示所有Shape泛型List的父类
 * 依旧无法加入元素
 */

class Canvas{
    public void drawAll(List<? extends Shape> shapes){
        for (Shape shape:shapes){
            shape.draw(this);
        }
    }
}

public class c9_3_2 {

}
