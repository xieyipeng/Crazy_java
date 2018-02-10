package Unit8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * �����Ϸ
 */
public class c8_8_1 {
    //�������֧�ֶ��ٸ������
    private final int PLAY_NUM=5;
    private String[] types={"����","�ݻ�","����","����"};
    private String[] values={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    //cards��һ����Ϸ��ʣ�µ��˿���
    private List<String> cards=new LinkedList<>();
    //�����������
    private String[] players =new String[PLAY_NUM];
    //����������ϵ��˿���
    private List<String>[] playersCards=new List[PLAY_NUM];
    /**
     * ��ʼ���˿��ƣ�����52���˿���
     * ��ʹ��shuffle�����������������
     */
    public void initCards(){
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i]+values[j]);
            }
        }
        //�������
        Collections.shuffle(cards);
    }
    /**
     * ��ʼ����ң�����ÿ����ҷ����û���
     */
    public void initPlayer(String ...names){
        if (names.length>PLAY_NUM||names.length<2){
            //Ч���������
            System.out.println("�����������");
            return;
        }else {
            //��ʼ���û���
            for (int i = 0; i < names.length; i++) {
                players[i]=names[i];
            }
        }
    }
    /**
     * ��ʼ��������е��˿��ƣ���ʼʱ���������Ϊ��
     */
    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++) {
            if (players[i]!=null && !players[i].equals("")){
                playersCards[i]=new LinkedList<String>();
            }
        }
    }
    /**
     * ���ȫ���˿��ƣ���������ʹ��
     */
    public void showAllCard(){
        for (String card:cards){
            System.out.println(card);
        }
    }

    /**
     * ���˿���
     * @param first �����ɸ�˭
     */
    public void deliverCard(String first){
        //����ArrayUtils�������search����
        //��ѯָ��Ԫ���������е�����
        int firstPos=ArrayUtils.search(players,first);
        //���θ�λ��ָ�����֮���ÿ��������˿���
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        //���θ�λ�ڸ�ָ�����ǰ���ÿ��������˿���
        for (int i = 0; i < firstPos; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }
    /**
     * ���������ϵ���
     */
    public void showPlayerCard(){
        for (int i = 0; i < PLAY_NUM; i++) {
            if (players[i]!=null){
                //������
                System.out.println(players[i]+":  ");
                for (String card:playersCards[i]){
                    System.out.print(card+"\t");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        c8_8_1 c=new c8_8_1();
        c.initPlayer("�������","�����");
        c.initCards();
        c.initPlayerCards();
        System.out.println("--------");
        //���������տ�ʼ����
        c.deliverCard("�����");
        c.showPlayerCard();
        /**
         * ����ط���Ҫ���Ӵ���
         * 1���������������ע
         * 2����������Ƿ��ע
         * 3����Ϸ�Ƿ�ֻʣһ����ң����ǣ�����ʤ��
         * 4������Ѿ������һ���ƣ���Ƚ�ʣ����ҵ������С
         */
        //�ٴδӡ�������ҡ���ʼ����
        c.deliverCard("�������");
        c.showPlayerCard();
    }
}
