package Unit3;
//random   ��������ַ���
public class c3_5_2_2 {
	public static void main(String[] args) {
		String str=" ";
		for(int i=0;i<6;i++) {
			int a=(int)(Math.random()*26+97);
			str=str+(char)a;
		}
		System.out.println(str);
		/*
		int a=(int)(Math.random()*16);
		System.out.println(a);
		*/
		float f1=5.6f;
		float f2=(float)5.6;
		System.out.println(f1==f2);//true
		
		String a="45";
		int b=Integer.parseInt(a);//���ַ�������ת��Ϊint
		System.out.println(a);
		System.out.println("********");
		System.out.println(b);
	}
}
