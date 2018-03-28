package Unit3;
//random   随机生成字符串
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
		int b=Integer.parseInt(a);//将字符串类型转换为int
		System.out.println(a);
		System.out.println("********");
		System.out.println(b);
	}
}
