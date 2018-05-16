package Unit8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Collection
 * 查找替换操作
 */
public class c8_8_2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(-5);
        arrayList.add(3);
        arrayList.add(0);
        System.out.println(arrayList);
        System.out.println("最大元素" + Collections.max(arrayList));
        System.out.println("最小元素" + Collections.max(arrayList));
        Collections.replaceAll(arrayList,0,1);
        System.out.println(arrayList);
        //判断-5在集合中的位置
        System.out.println(Collections.frequency(arrayList,-5));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //排序后二分法查找
        System.out.println(Collections.binarySearch(arrayList,3));
    }
}
