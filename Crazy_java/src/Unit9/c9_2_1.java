package Unit9;

/**
 * ���뷺��
 * ���巺�͵Ľӿڣ���
 */

class Apple<T>{
    private T info;

    public Apple() {
    }

    public Apple(T info) {
        this.info = info;
    }

    public void setInfo(T info){
        this.info=info;
    }

    public T getInfo(){
        return this.info;
    }

}

public class c9_2_1 {
    public static void main(String[] args) {
        //String
        Apple<String> apple1=new Apple<>("ƻ��");
        System.out.println(apple1.getInfo());
        //Double
        Apple<Double> apple2=new Apple<>(5.67);
        System.out.println(apple2.getInfo());
    }
}
