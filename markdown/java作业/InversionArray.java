public class InversionArray {
    public static void main(String[] args) {
        int ints[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<(ints.length/2);i++){
            int temp;
            temp=ints[ints.length-1-i];
            ints[ints.length-1-i]=ints[i];
            ints[i]=temp;
        }
        for (int number :
                ints) {
            System.out.print(number+" ");
        }
    }
}