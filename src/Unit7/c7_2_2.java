package Unit7;

/**
 * Runtime类
 * 运行时环境
 * 访问JVM的方法
 */
public class c7_2_2 {
    public static void main(String[] args)
            throws Exception {
        /**
         * //获取java程序运行时关联的对象
         * Runtime runtime=Runtime.getRuntime();
         * System.out.println("处理数量"+runtime.availableProcessors());
         * System.out.println("空闲内存数"+runtime.freeMemory());
         * System.out.println("内存总数"+runtime.totalMemory());
         * System.out.println("可用最大内存数"+runtime.maxMemory());
         * //结果：
         * 处理数量4
         * 空闲内存数123518560
         * 内存总数126877696
         * 可用最大内存数1862270976
         */
        Runtime runtime = Runtime.getRuntime();
        //启动记事本程序
        runtime.exec("notepad.exe");
    }
}
