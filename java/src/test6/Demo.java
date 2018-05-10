package test6;

public class Demo {

}


class str {
    public static void main(String[] args) {
        Context context=new Context(new AddStrategy());
        System.out.println(context.calculate(10, 5));

    }
}
interface Strategy{
    public abstract int calculate(int a, int b);
}
class AddStrategy implements Strategy{


    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
class SubStrategy implements Strategy{


    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
class Context{
    public  Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public Strategy getStrategy(){
        return strategy;
    }
    public void setStrategy(){
        this.strategy=strategy;
    }
    public int calculate(int a,int b){
        return strategy.calculate(a,b);
    }
}



