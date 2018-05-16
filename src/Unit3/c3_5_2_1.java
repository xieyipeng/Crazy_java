package Unit3;
//强制类型转换
public class c3_5_2_1 {
	public static void main(String[] args) {
		int a=123;
		byte b=(byte)a;
		System.out.println(b);
		//
		//short s=b;
		//int d=s;
		//char c=(char)s;
		char c=(char)b;
		System.out.println("*******");
		System.out.println(c);//byte类型不能转化成char;
		int by=0B11101001;
		System.out.println(by);
		System.out.println("*******");
		byte byt=(byte)by;
		System.out.println(byt);
	}
}
