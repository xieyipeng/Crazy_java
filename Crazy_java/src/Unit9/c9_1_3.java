package Unit9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * java7�ġ����Ρ��÷�
 */
public class c9_1_3 {
    public static void main(String[] args) {
        //java�Զ��ƶϳ�ArrayList�����������String
        List<String> list=new ArrayList<>();
        list.add("���java����");
        list.add("���Android����");
        //����
        list.forEach(s -> System.out.println(s.length()));
        //java�Զ��ƶϳ�Map��Ӧ����Sting��List<String>
        Map<String ,List<String>> map=new HashMap<>();
        //�Զ��ƶ�
        List<String > strings=new ArrayList<>();
        strings.add("б�����Ƕ�");
        strings.add("����ȡ��·");
        map.put("�����",strings);
        map.forEach((s, strings1) -> System.out.println(s+"-->"+ strings1));
    }
}
