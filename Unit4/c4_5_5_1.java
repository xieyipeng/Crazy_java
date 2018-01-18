package Unit4;
//foreach循环
public class c4_5_5_1 {
	public static void main(String[] args) {
		int[] a={5,9,6,4,8};
		/*
		 * for(int i=0;i<a.length;i++) {
		 * 	a[i]=16*i;
		 * 	System.out.println(a[i]);
		 * }
		 */
		for(int x : a) {//for(元素类型t 元素变量x : 遍历对象obj){
			System.out.println(x);
		}
	}
}
