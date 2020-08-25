package leetcode.editor.cn;

//On an 8 x 8 chessboard, there is one white rook. There also may be empty squar
//es, white bishops, and black pawns. These are given as characters 'R', '.', 'B',
// and 'p' respectively. Uppercase characters represent white pieces, and lowercas
//e characters represent black pieces. 
//
// The rook moves as in the rules of Chess: it chooses one of four cardinal dire
//ctions (north, east, west, and south), then moves in that direction until it cho
//oses to stop, reaches the edge of the board, or captures an opposite colored paw
//n by moving to the same square it occupies. Also, rooks cannot move into the sam
//e square as other friendly bishops. 
//
// Return the number of pawns the rook can capture in one move. 
//
// 
//
// Example 1: 
//
// 
//
// 
//Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],["
//.",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".","
//.",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 3
//Explanation: 
//In this example the rook is able to capture all the pawns.
// 
//
// Example 2: 
//
// 
//
// 
//Input: [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],["
//.","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","
//B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 0
//Explanation: 
//Bishops are blocking the rook to capture any pawn.
// 
//
// Example 3: 
//
// 
//
// 
//Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],["
//.",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".","
//.",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".","
//.","."],[".",".",".",".",".",".",".","."]]
//Output: 3
//Explanation: 
//The rook can capture the pawns at positions b5, d6 and f5.
// 
//
// 
//
// Note: 
//
// 
// board.length == board[i].length == 8 
// board[i][j] is either 'R', '.', 'B', or 'p' 
// There is exactly one cell with board[i][j] == 'R' 
// 
// Related Topics 数组 
// 👍 78 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:28
 */
public class AvailableCapturesForRook {
    public static void main(String[] args) {
        Solution solution = new AvailableCapturesForRook().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numRookCaptures(char[][] board) {
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}