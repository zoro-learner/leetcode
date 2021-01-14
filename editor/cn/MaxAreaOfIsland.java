package leetcode.editor.cn;

//Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (r
//epresenting land) connected 4-directionally (horizontal or vertical.) You may as
//sume all four edges of the grid are surrounded by water. 
//
// Find the maximum area of an island in the given 2D array. (If there is no isl
//and, the maximum area is 0.) 
//
// Example 1: 
//
// 
//[[0,0,1,0,0,0,0,1,0,0,0,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],
// [0,1,0,0,1,1,0,0,1,1,1,0,0],
// [0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,0,0,0,0,0,0,1,1,0,0,0,0]]
// 
//Given the above grid, return 6. Note the answer is not 11, because the island 
//must be connected 4-directionally.
//
// Example 2: 
//
// 
//[[0,0,0,0,0,0,0,0]] 
//Given the above grid, return 0.
//
// Note: The length of each dimension in the given grid does not exceed 50. 
// Related Topics 深度优先搜索 数组 
// 👍 380 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-29 08:37:24
 */
public class MaxAreaOfIsland {
    public static void main(String[] args) {
        Solution solution = new MaxAreaOfIsland().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<Integer> areas = new ArrayList<>();
    boolean[][] used;
    int[] step = {-1, 1};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        used = new boolean[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 0 || used[r][c]) {
                    continue;
                }
                System.out.println(r + " " + c);
                dfs(grid, r, c, 1);
                System.out.println(areas.get(areas.size() - 1));
            }
        }
        int maxArea = areas.stream().mapToInt(Integer::intValue).max().orElse(0);
        return maxArea;
    }

    private void dfs(int[][] grid, int r, int c, int area) {
        int m = grid.length;
        int n = grid[0].length;
        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0 || used[r][c]) {
            return ;
        }
        if ((r == m - 1 || used[r + 1][c] || grid[r + 1][c] == 0)
            && (c == n - 1 || used[r][c + 1] || grid[r][c + 1] == 0)
            && (r == 0 || used[r - 1][c] || grid[r - 1][c] == 0)
            && (c == 0 || used[r][c - 1] || grid[r][c - 1] == 0)) {
            areas.add(area);
        }
        used[r][c] = true;
        dfs(grid, r - 1, c, area + 1);
        dfs(grid, r, c - 1, area + 1);
        dfs(grid, r, c + 1, area + 1);
        dfs(grid, r + 1, c, area + 1);
        used[r][c] = false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}