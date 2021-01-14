package leetcode.editor.cn;

//A robot is located at the top-left corner of a m x n grid (marked 'Start' in t
//he diagram below). 
//
// The robot can only move either down or right at any point in time. The robot 
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the d
//iagram below). 
//
// How many possible unique paths are there? 
//
// 
// Example 1: 
//
// 
//Input: m = 3, n = 7
//Output: 28
// 
//
// Example 2: 
//
// 
//Input: m = 3, n = 2
//Output: 3
//Explanation:
//From the top-left corner, there are a total of 3 ways to reach the bottom-righ
//t corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
// 
//
// Example 3: 
//
// 
//Input: m = 7, n = 3
//Output: 28
// 
//
// Example 4: 
//
// 
//Input: m = 3, n = 3
//Output: 6
// 
//
// 
// Constraints: 
//
// 
// 1 <= m, n <= 100 
// It's guaranteed that the answer will be less than or equal to 2 * 109. 
// 
// Related Topics 数组 动态规划 
// 👍 711 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 19:22:22
 */
public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new UniquePaths().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for (int r = 0; r < m; r++) {
            paths[r][0] = 1;
        }
        for (int c = 0; c < n; c++) {
            paths[0][c] = 1;
        }
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                paths[r][c] = paths[r - 1][c] + paths[r][c - 1];
            }
        }
        return paths[m - 1][n - 1];

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}