package Unit3;

public class c3_4_3_1 {
	public static void main(String[] args) {
		float af=5.23268845744f;
		System.out.println(af);//�����仯
		double a=0.0;
		double c=Double.NEGATIVE_INFINITY;//�������
		float d=Float.NEGATIVE_INFINITY;//�������
		System.out.println(c == d);//true
		System.out.println(a/a);//NaN
		System.out.println(a/a==Float.NaN);//����������֮�䲻���
		/*
		 ����������ʾ����ͳ������磬��0��һ�������Ľ������������0/0���߶�һ�������󿪷������NaN
		 ����������ʹ�ã�
		 if(x==Float.NaN)
		 Ҫ����ʹ�ã�
		 if(Float.isNaN(x)) 
		 */
		System.out.println(6.0/0==555.0/0);//�������������Ϊ��
		System.out.println(-8/a);
	}
}
