public class Reverse {
    public static void main(String[] args) {
        String string = "hello world";
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(string.length() - i - 1);
        }
        System.out.println(chars);
    }
}