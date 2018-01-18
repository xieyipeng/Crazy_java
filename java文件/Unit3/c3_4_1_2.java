package Unit3;
/*
 * 二进制以‘0B’‘0b’开头;32位二进制整数，最高位是符号位，1则为负数
 * 八进制以‘0’开头;
 * 十六进制以‘0x’‘0X’开头;
 */
public class c3_4_1_2 {
	public static void main(String[] args) {
		
		int binValue=0b1110011;//二进制
		int binValue1=0B10000000000000000000000000000011;
		long binValue2=0B10000000000000000000000000000011L;
		int octalValue=013;//八进制
		int hexValue1=0x13;//十六进制
		int hexValue2=0Xaf;//十六进制
		System.out.println("binValue1  "+binValue1);
		System.out.println("binValue2  "+binValue2);
		System.out.println("binValue  "+binValue);
		System.out.println("octalValue  "+octalValue);
		System.out.println(hexValue1);
		System.out.println(hexValue2);
		System.out.println("******");
		int a=hexValue2*2;
		System.out.println(a);
		/*
		 * 所有数字在计算机中都是以二进制形式存在于计算机底层，将数值直接转换为的二进制数叫原码，
		 * 但是计算机以补码形式存储所有整数    正数的补码与原码完全相同，
		 * 							负数的补码是其反码加1;
		 * 
		 * 反码是对原码取反，最高位保持不变
		 */
		
	}
}
