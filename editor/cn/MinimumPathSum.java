package leetcode.editor.cn;

//Given a m x n grid filled with non-negative numbers, find a path from top left
// to bottom right which minimizes the sum of all numbers along its path. 
//
// Note: You can only move either down or right at any point in time. 
//
// Example: 
//
// 
//Input:
//[
//  [1,3,1],
//  [1,5,1],
//  [4,2,1]
//]
//Output: 7
//Explanation: Because the path 1→3→1→1→1 minimizes the sum.
// 
// Related Topics 数组 动态规划 
// 👍 691 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 19:53:05
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minPathSum(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        for (int r = 1; r < m; r++) {
            grid[r][0] += grid[r - 1][0];
        }
        for (int c = 1; c < n; c++) {
            grid[0][c] += grid[0][c - 1];
        }
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                grid[r][c] += Math.min(grid[r - 1][c], grid[r][c - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}