package Unit4;
//数组长度改变的假象
public class c4_6_1_1 {
	public static void main(String[] args) {
		int[] a= {3,5,7};
		int[] b=new int[4];
		System.out.println("a数组长度 "+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("b数组长度 "+b.length);
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		b=a;
		System.out.println("更改后b的长度 "+b.length);
	}
}
