package Unit6;

/**
 * 缓存
 * Integer  valueOf() 只缓存-128~127之间的对象
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
        //遍历缓存的对象，若有相同实例，返回该缓存的实例
        for (int i = 0; i < Max_size; i++) {
            if(cacheImmutales[i]!=null && cacheImmutales[i].getName().equals(name)){
                return cacheImmutales[i];
            }
        }
        //如果缓存池满
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