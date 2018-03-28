package Unit4;
//数组的动态初始化
public class c4_5_3_2 {
	public static void main(String[] args) {
		int[] a;
		a=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=16*i;
			System.out.println(a[i]);
		}
	}
}
