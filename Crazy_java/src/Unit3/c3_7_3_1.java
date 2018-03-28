package Unit3;
//位运算符，补码反码原码的运算
public class c3_7_3_1 {
	public static void main(String[] arge) {
		System.out.println(5&9);//以二进制运算
		System.out.println(5|9);//以二进制运算
		System.out.println(~-5);
		System.out.println(5^9);
		System.out.println(-5<<2);//左移n位相等于乘以2的n次方
		System.out.println(-5>>2);//右移n位相等于除以2的n次方
		System.out.println(-5>>>2);
	}
}
