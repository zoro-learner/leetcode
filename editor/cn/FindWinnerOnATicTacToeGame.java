package leetcode.editor.cn;

//Tic-tac-toe is played by two players A and B on a 3 x 3 grid. 
//
// Here are the rules of Tic-Tac-Toe: 
//
// 
// Players take turns placing characters into empty squares (" "). 
// The first player A always places "X" characters, while the second player B al
//ways places "O" characters. 
// "X" and "O" characters are always placed into empty squares, never on filled 
//ones. 
// The game ends when there are 3 of the same (non-empty) character filling any 
//row, column, or diagonal. 
// The game also ends if all squares are non-empty. 
// No more moves can be played if the game is over. 
// 
//
// Given an array moves where each element is another array of size 2 correspond
//ing to the row and column of the grid where they mark their respective character
// in the order in which A and B play. 
//
// Return the winner of the game if it exists (A or B), in case the game ends in
// a draw return "Draw", if there are still movements to play return "Pending". 
//
// You can assume that moves is valid (It follows the rules of Tic-Tac-Toe), the
// grid is initially empty and A will play first. 
//
// 
// Example 1: 
//
// 
//Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
//Output: "A"
//Explanation: "A" wins, he always plays first.
//"X  "    "X  "    "X  "    "X  "    "X  "
//"   " -> "   " -> " X " -> " X " -> " X "
//"   "    "O  "    "O  "    "OO "    "OOX"
// 
//
// Example 2: 
//
// 
//Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
//Output: "B"
//Explanation: "B" wins.
//"X  "    "X  "    "XX "    "XXO"    "XXO"    "XXO"
//"   " -> " O " -> " O " -> " O " -> "XO " -> "XO " 
//"   "    "   "    "   "    "   "    "   "    "O  "
// 
//
// Example 3: 
//
// 
//Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
//Output: "Draw"
//Explanation: The game ends in a draw since there are no moves to make.
//"XXO"
//"OOX"
//"XOX"
// 
//
// Example 4: 
//
// 
//Input: moves = [[0,0],[1,1]]
//Output: "Pending"
//Explanation: The game has not finished yet.
//"X  "
//" O "
//"   "
// 
//
// 
// Constraints: 
//
// 
// 1 <= moves.length <= 9 
// moves[i].length == 2 
// 0 <= moves[i][j] <= 2 
// There are no repeated elements on moves. 
// moves follow the rules of tic tac toe. 
// Related Topics 数组 
// 👍 22 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-25 14:04:57
 */
public class FindWinnerOnATicTacToeGame {
    public static void main(String[] args) {
        Solution solution = new FindWinnerOnATicTacToeGame().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String tictactoe(int[][] moves) {
        final int RANGE = 3;
        int[][] boards = new int[RANGE][RANGE];
        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            int player = (i % 2) + 1;
            boards[r][c] = player;
            if (isWinner(boards, player)) {
                return player == 1 ? "A" : "B";
            }
        }
        if (moves.length >= RANGE * RANGE) {
            return "Draw";
        } else {
            return "Pending";
        }
    }

    private boolean isWinner(int[][] boards, int player) {
        int m = boards.length;
        for (int i = 0; i < m; i++) {
            boolean isSame = true;
            for (int j = 0; j < m; j++) {
                if (player != boards[i][j]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                return true;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean isSame = true;
            for (int j = 0; j < m; j++) {
                if (player != boards[j][i]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                return true;
            }
        }

        boolean isSame = true;
        for (int i = 0; i < m; i++) {
            if (player != boards[i][i]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            return true;
        }

        isSame = true;
        for (int i = 0; i < m; i++) {
            if (player != boards[i][m - 1 - i]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            return true;
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}