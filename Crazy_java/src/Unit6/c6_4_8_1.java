package Unit6;

/**
 * ����
 * Integer  valueOf() ֻ����-128~127֮��Ķ���
 *
 */
class CacheImmutale{
    private static int Max_size=10;
    private static CacheImmutale[] cacheImmutales=new CacheImmutale[Max_size];
    private static int pos=0;
    private final String name;
    private CacheImmutale(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static CacheImmutale valuaOf(String name){
        //��������Ķ���������ͬʵ�������ظû����ʵ��
        for (int i = 0; i < Max_size; i++) {
            if(cacheImmutales[i]!=null && cacheImmutales[i].getName().equals(name)){
                return cacheImmutales[i];
            }
        }
        //����������
        if(pos== Max_size){
            cacheImmutales[0]=new CacheImmutale(name);
            pos=1;
        }
        else {
            System.out.println(pos);//0
            cacheImmutales[pos++]=new CacheImmutale(name);
            System.out.println(pos);//1
        }
        return cacheImmutales[pos-1];
    }
    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj!=null&&obj.getClass()==CacheImmutale.class){
            CacheImmutale ci=(CacheImmutale)obj;
            return name.equals(ci.getName());
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
public class c6_4_8_1 {
    public static void main(String[] args) {
        CacheImmutale c1=CacheImmutale.valuaOf("hello");
        CacheImmutale c2=CacheImmutale.valuaOf("hello");
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}