package Unit3;

public class c3_4_1_1 {
	public static void main(String[] args) {
		byte a=56;
		/*系统将56当为byte类型处理
		 * 系统不会将99999999999当作long类型处理
		 * long bigValue=99999999999;
		 * 下面是正确的，加‘L’，强制转化为long型
		 */
		long bigValue=9999999999L;
		System.out.println(a);
		System.out.println(bigValue);
	}
}


