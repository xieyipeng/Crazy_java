package Unit9;

/**
 * �趨�����βε�����
 */

class Aplle<T extends Number>{

    T col;

    public static void main(String[] args) {
        Aplle<Integer> aplle1=new Aplle<>();
        Aplle<Double> aplle2=new Aplle<>();
        //�������
        //Aplle<String> aplle3=new Aplle<>();
    }
}

//Ϊ���������β��趨�������

public class c9_3_3 <T extends Number & java.io.Serializable>{
}
