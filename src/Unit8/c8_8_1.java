package Unit8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 梭哈游戏
 */
public class c8_8_1 {
    //定义最多支持多少个玩家玩
    private final int PLAY_NUM=5;
    private String[] types={"方块","草花","红心","黑桃"};
    private String[] values={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    //cards是一局游戏中剩下的扑克牌
    private List<String> cards=new LinkedList<>();
    //定义所有玩家
    private String[] players =new String[PLAY_NUM];
    //所有玩家手上的扑克牌
    private List<String>[] playersCards=new List[PLAY_NUM];
    /**
     * 初始化扑克牌，放入52章扑克牌
     * 并使用shuffle方法是他们随机排列
     */
    public void initCards(){
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i]+values[j]);
            }
        }
        //随机排列
        Collections.shuffle(cards);
    }
    /**
     * 初始化玩家，并给每个玩家分派用户名
     */
    public void initPlayer(String ...names){
        if (names.length>PLAY_NUM||names.length<2){
            //效验玩家数量
            System.out.println("玩家数量出错");
            return;
        }else {
            //初始化用户名
            for (int i = 0; i < names.length; i++) {
                players[i]=names[i];
            }
        }
    }
    /**
     * 初始化玩家手中的扑克牌，开始时玩家手中牌为空
     */
    public void initPlayerCards(){
        for (int i = 0; i < players.length; i++) {
            if (players[i]!=null && !players[i].equals("")){
                playersCards[i]=new LinkedList<String>();
            }
        }
    }
    /**
     * 输出全部扑克牌，仅作测试使用
     */
    public void showAllCard(){
        for (String card:cards){
            System.out.println(card);
        }
    }

    /**
     * 派扑克牌
     * @param first 最先派给谁
     */
    public void deliverCard(String first){
        //调用ArrayUtils工具类的search方法
        //查询指定元素在数组中的索引
        int firstPos=ArrayUtils.search(players,first);
        //依次给位于指定玩家之后的每个玩家派扑克牌
        for (int i = firstPos; i < PLAY_NUM; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
        //依次给位于该指定玩家前面的每个玩家派扑克牌
        for (int i = 0; i < firstPos; i++) {
            if (players[i]!=null){
                playersCards[i].add(cards.get(0));
                cards.remove(0);
            }
        }
    }
    /**
     * 输出玩家手上的排
     */
    public void showPlayerCard(){
        for (int i = 0; i < PLAY_NUM; i++) {
            if (players[i]!=null){
                //输出玩家
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
        c.initPlayer("电脑玩家","孙悟空");
        c.initCards();
        c.initPlayerCards();
        System.out.println("--------");
        //下面从孙悟空开始派牌
        c.deliverCard("孙悟空");
        c.showPlayerCard();
        /**
         * 这个地方需要增加处理
         * 1、牌面最大的玩家下注
         * 2、其他玩家是否跟注
         * 3、游戏是否只剩一个玩家，若是，则她胜利
         * 4、如果已经是最后一张牌，则比较剩下玩家的牌面大小
         */
        //再次从“电脑玩家”开始派牌
        c.deliverCard("电脑玩家");
        c.showPlayerCard();
    }
}
