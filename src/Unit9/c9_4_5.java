package Unit9;

/**
 * ���ͷ����뷽������
 * java8�Ľ��������ƶ�
 */
class MyUtil<E>{
    public static <Z> MyUtil<Z>nil(){
        return null;
    }
    public static <Z> MyUtil<Z> cons(Z head,MyUtil<Z> tail){
        return null;
    }
    E head(){
        return null;
    }
}
public class c9_4_5 {
    public static void main(String[] args) {
        //��ͨ��������ֵ��Ŀ��������ƶ����Ͳ���ΪString
        MyUtil<String> stringMyUtil1=MyUtil.nil();
        //����ָ����������
        MyUtil<String> stringMyUtil2=MyUtil.<String>nil();
        //�ɵ���cons��������Ĳ����������ƶ����Ͳ���ΪInteger
        MyUtil.cons(42,MyUtil.nil());
        //����ָ����������
        MyUtil.cons(42,MyUtil.<Integer>nil());
    }
}
