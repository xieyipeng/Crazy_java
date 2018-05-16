package Unit9;

import java.util.List;

/**
 * �趨����ͨ���������
 */

abstract class Shape{
    public abstract void draw(Canvas canvas);
}

class Circle extends Shape{
    @Override
    public void draw(Canvas canvas) {
        System.out.println("��"+canvas+"�ϻ�һ��Ȧ");
    }
}

class Rectangle extends Shape{
    @Override
    public void draw(Canvas canvas) {
        System.out.println("��һ�����λ��ڻ���"+canvas+"��");
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
 * �����Ƶķ���ͨ���
 * List<? extends Shape>
 * ��ʾ����Shape����List�ĸ���
 * �����޷�����Ԫ��
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
