package leetcode.editor.cn;

//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be v
//alidated according to the following rules: 
//
// 
// Each row must contain the digits 1-9 without repetition. 
// Each column must contain the digits 1-9 without repetition. 
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 with
//out repetition. 
// 
//
// Note: 
//
// 
// A Sudoku board (partially filled) could be valid but is not necessarily solva
//ble. 
// Only the filled cells need to be validated according to the mentioned rules. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: board = 
//[["5","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: board = 
//[["8","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: false
//Explanation: Same as Example 1, except with the 5 in the top left corner being
// modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is inval
//id.
// 
//
// 
// Constraints: 
//
// 
// board.length == 9 
// board[i].length == 9 
// board[i][j] is a digit or '.'. 
// 
// Related Topics 哈希表 
// 👍 434 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-21 18:41:26
 */
public class ValidSudoku {
    public static void main(String[] args) {
        Solution solution = new ValidSudoku().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            int m = board.length;
            int n = board[0].length;
            assert m == n && m == 9 : "wrong input";

            int[] dict = new int[m + 1];
            for (int r = 0; r < m; r++) {
                Arrays.fill(dict, 0);
                for (int c = 0; c < n; c++) {
                    if (board[r][c] == '.') {
                        continue;
                    }
                    int idx = board[r][c] - '0';
                    if (dict[idx] > 0) {
                        return false;
                    }
                    dict[idx] = 1;
                }
            }

            for (int c = 0; c < n; c++) {
                Arrays.fill(dict, 0);
                for (int r = 0; r < m; r++) {
                    if (board[r][c] == '.') {
                        continue;
                    }
                    int idx = board[r][c] - '0';
                    if (dict[idx] > 0) {
                        return false;
                    }
                    dict[idx] = 1;
                }
            }

            for (int rs = 0; rs + 3 <= m; rs += 3) {
                for (int cs = 0; cs + 3 <= n; cs += 3) {
                    Arrays.fill(dict, 0);
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            if (board[rs + r][cs + c] == '.') {
                                continue;
                            }
                            int idx = board[rs + r][cs + c] - '0';
                            if (dict[idx] > 0) {
                                return false;
                            }
                            dict[idx] = 1;
                        }
                    }
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}