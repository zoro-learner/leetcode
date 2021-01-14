package leetcode.editor.cn;

//A robot is located at the top-left corner of a m x n grid (marked 'Start' in t
//he diagram below). 
//
// The robot can only move either down or right at any point in time. The robot 
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the d
//iagram below). 
//
// Now consider if some obstacles are added to the grids. How many unique paths 
//would there be? 
//
// 
//
// An obstacle and empty space is marked as 1 and 0 respectively in the grid. 
//
// Note: m and n will be at most 100. 
//
// Example 1: 
//
// 
//Input:
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//Output: 2
//Explanation:
//There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
// 
// Related Topics 数组 动态规划 
// 👍 423 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 19:39:48
 */
public class UniquePathsIi {
    public static void main(String[] args) {
        Solution solution = new UniquePathsIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        final int m = obstacleGrid.length;
        final int n = obstacleGrid[0].length;
        int[][] paths = new int[m][n];
        for (int r = 0; r < m; r++) {
            if (obstacleGrid[r][0] == 0) {
                paths[r][0] = 1;
            } else {
                break;
            }
        }
        for (int c = 0; c < n; c++) {
            if (obstacleGrid[0][c] == 0) {
                paths[0][c] = 1;
            } else {
                break;
            }
        }
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (obstacleGrid[r][c] == 1) {
                    paths[r][c] = 0;
                } else {
                    paths[r][c] = paths[r - 1][c] + paths[r][c - 1];
                }
            }
        }
        return paths[m - 1][n - 1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}