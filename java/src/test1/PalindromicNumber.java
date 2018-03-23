package test1;

public class PalindromicNumber {
    public static void main(String[] args) {
        String string="qwertyuio";
        int length=string.length();
        char[] chars=new char[length];
        for (int i = length; i >0; i--) {
            chars[i]=string.charAt(i);
        }
        System.out.println(chars);
    }
}
