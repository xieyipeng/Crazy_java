package unit16;

public class Account {

    private String accountNo;
    private double balance;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
    public synchronized void draw(double drawAmount){
        if (balance>=drawAmount){
            System.out.println("成功");
            try {
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            balance -=drawAmount;
            System.out.println("余额为："+balance);
        }else {
            System.out.println(Thread.currentThread().getName()+"余额不足");
        }
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj!=null&&obj.getClass()==Account.class){
            Account target=(Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}
