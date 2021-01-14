package leetcode.editor.cn;

//Given a 2D board and a word, find if the word exists in the grid. 
//
// The word can be constructed from letters of sequentially adjacent cell, where
// "adjacent" cells are those horizontally or vertically neighboring. The same let
//ter cell may not be used more than once. 
//
// Example: 
//
// 
//board =
//[
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//]
//
//Given word = "ABCCED", return true.
//Given word = "SEE", return true.
//Given word = "ABCB", return false.
// 
//
// 
// Constraints: 
//
// 
// board and word consists only of lowercase and uppercase English letters. 
// 1 <= board.length <= 200 
// 1 <= board[i].length <= 200 
// 1 <= word.length <= 10^3 
// 
// Related Topics 数组 回溯算法 
// 👍 645 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-11 17:04:44
 */
public class WordSearch {
    public static void main(String[] args) {
        Solution solution = new WordSearch().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }
        int m = board.length;
        int n = board[0].length;
        boolean[][] used = new boolean[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                boolean isFound = helper(board, r, c, used, word, 0);
                if (isFound) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, int r, int c, boolean[][] used, String word, int i) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || i >= word.length()) {
            return false;
        }
        if (used[r][c] || board[r][c] != word.charAt(i)) {
            return false;
        }
        if (i == word.length() - 1) {
            return !used[r][c] && board[r][c] == word.charAt(i);
        }

        used[r][c] = true;
        for (int[] step : direction) {
            boolean isFound = helper(board, r + step[0], c + step[1], used, word, i + 1);
            if (isFound) {
                return true;
            }
        }
        used[r][c] = false;

        return false;
    }

    private final int[][] direction = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
}
//leetcode submit region end(Prohibit modification and deletion)

    
}