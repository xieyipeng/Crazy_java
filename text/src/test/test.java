package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test {
        public static void main(String[] args) {
            String string="qwertyuio";
            int length=string.length();
            List list=new ArrayList();
            for (int i = length-1; i >=0; i--) {
                list.add(string.charAt(i));
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
}
