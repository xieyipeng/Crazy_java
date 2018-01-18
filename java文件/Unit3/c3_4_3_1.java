package Unit3;

public class c3_4_3_1 {
	public static void main(String[] args) {
		float af=5.23268845744f;
		System.out.println(af);//发生变化
		double a=0.0;
		double c=Double.NEGATIVE_INFINITY;//负无穷大
		float d=Float.NEGATIVE_INFINITY;//负无穷大
		System.out.println(c == d);//true
		System.out.println(a/a);//NaN
		System.out.println(a/a==Float.NaN);//两个非数字之间不想等
		/*
		 它们用来标示溢出和出错。例如，用0除一个正数的结果是正无穷大而0/0或者对一个负数求开方则产生NaN
		 不可以这样使用：
		 if(x==Float.NaN)
		 要这样使用：
		 if(Float.isNaN(x)) 
		 */
		System.out.println(6.0/0==555.0/0);//所有正数无穷大都为零
		System.out.println(-8/a);
	}
}
