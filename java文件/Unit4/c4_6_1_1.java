package Unit4;
//���鳤�ȸı�ļ���
public class c4_6_1_1 {
	public static void main(String[] args) {
		int[] a= {3,5,7};
		int[] b=new int[4];
		System.out.println("a���鳤�� "+a.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("b���鳤�� "+b.length);
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		b=a;
		System.out.println("���ĺ�b�ĳ��� "+b.length);
	}
}
