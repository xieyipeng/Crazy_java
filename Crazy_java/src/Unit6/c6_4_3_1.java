package Unit6;

import java.util.Arrays;

/**
 * final
 * final ���εķ������ܱ���д
 * final ���ε��಻��������
 */
class Dog{
    private int age;

    public Dog() {

    }

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class c6_4_3_1 {
    public static void main(String[] args) {
        /**
         * final�Ƕ��������ò���
         */
        final int[] arr={10,2,8,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr[2]=-8;
        System.out.println(Arrays.toString(arr));
        //arr=null;
        final Dog dog=new Dog(45);
        System.out.println(dog.getAge());
        dog.setAge(16);
        System.out.println(dog.getAge());

    }
}