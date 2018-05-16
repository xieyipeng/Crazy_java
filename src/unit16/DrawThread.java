package unit16;

public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name,Account account,double drawAmount){
        super(name);
        this.account=account;
        this.drawAmount=drawAmount;
    }

    @Override
    public void run() {
//        synchronized (account){
//            //同步监视器
//            if (account.getBalance()>=drawAmount){
//                System.out.println(getName()+"取钱成功"+drawAmount);
////            try {
////                Thread.sleep(1);
////            }catch (InterruptedException e){
////                e.printStackTrace();
////            }
//                account.setBalance(account.getBalance()-drawAmount);
//                System.out.println(getName()+" :余额为："+account.getBalance());
//            }else {
//                System.out.println("余额不足");
//            }
//        }
        account.draw(drawAmount);
    }
}
