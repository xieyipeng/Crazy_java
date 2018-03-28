package Unit4;

//五子棋
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang {
    private static int BOARD_SIZE = 15;
    private String[][] board;

    /**
     * 创建棋盘
     */
    public void initboare() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = " + ";
            }
        }
    }

    /**
     * 输出棋盘
     */
    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {

        System.out.println("  x->");
        System.out.println("y");
        System.out.println("|");

        Gobang gb = new Gobang();
        gb.initboare();
        gb.printBoard();

        System.out.println("输入坐标");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while ((inputStr = br.readLine()) != null) {
            String[] posStrArr = inputStr.split(",");//split：分割
            int xpos = Integer.parseInt(posStrArr[0]);
            int ypos = Integer.parseInt(posStrArr[1]);
            gb.board[ypos - 1][xpos - 1] = " ● ";
            gb.printBoard();
            System.out.println("输入坐标");
        }
    }
}
