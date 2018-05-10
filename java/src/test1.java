public class test1 {
    /**
     * 尾递归
     * @param n
     * @return
     */
    public  static long recursiveFib(long n)
    {
        if(n<0)      return -1;
        if(n <= 1)   return n;

        return recursiveFib(n-1)+recursiveFib(n-2);
    }
    public  static long tailRecursiveFib(long a,long b,int n)
    {
        if(n <0 ) return -1;
        if(n == 0) return a;
        if(n == 1) return b;

        //返回值出现在函数的末尾，且没有包含其他表达式，是尾递归！
        return tailRecursiveFib(b, a+b, n-1);
    }

    /**
     * 采用尾递归算法，可以极大地提高运行效率
     如果一个函数中所有递归形式的调用都出现在
     函数的末尾，我们称这个递归函数是尾递归。
     需要说明的是，只有当递归调用是整个函数体
     中最后执行的语句且它的返回值不属于表达式
     的一部分时，这样的递归调用才是尾递归。
     * @param args
     */
    /**
    public static void main(String[] args) {
        final int num = 50;
        long begin = System.currentTimeMillis();
        System.err.println("采用递归算法");
        long result = recursiveFib(num);
        long end = System.currentTimeMillis();
        System.err.println("fib("+num+")=="+result+"，耗时"+(end-begin)+"毫秒");
    }
     */
    public static void main(String[] args) {
        final int num = 50;
        long begin = System.currentTimeMillis();
        System.err.println("采用尾递归算法");
        long result = tailRecursiveFib(0L,1L,num);
        long end = System.currentTimeMillis();
        System.err.println("fib("+num+")=="+result+"，耗时"+(end-begin)+"毫秒");
    }
}
