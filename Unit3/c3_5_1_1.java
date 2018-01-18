package Unit3;
//自动类型转换
public class c3_5_1_1 {
	public static void main(String[] args) {
		int a=6;
		double d=a;
		System.out.println(d);//6.0
		String str=3.5f+" 123";//与字符串链接自动转化为字符串
		System.out.println(str);
	}
}
