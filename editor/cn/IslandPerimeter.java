package leetcode.editor.cn;

//You are given a map in form of a two-dimensional integer grid where 1 represen
//ts land and 0 represents water. 
//
// Grid cells are connected horizontally/vertically (not diagonally). The grid i
//s completely surrounded by water, and there is exactly one island (i.e., one or 
//more connected land cells). 
//
// The island doesn't have "lakes" (water inside that isn't connected to the wat
//er around the island). One cell is a square with side length 1. The grid is rect
//angular, width and height don't exceed 100. Determine the perimeter of the islan
//d. 
//
// 
//
// Example: 
//
// 
//Input:
//[[0,1,0,0],
// [1,1,1,0],
// [0,1,0,0],
// [1,1,0,0]]
//
//Output: 16
//
//Explanation: The perimeter is the 16 yellow stripes in the image below:
//
//
// 
// Related Topics 哈希表 
// 👍 240 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-03 11:11:53
 */
public class IslandPerimeter {
    public static void main(String[] args) {
        Solution solution = new IslandPerimeter().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res += getPerimeter(grid, i, j);
                }
            }
        }
        return res;
    }

    private int getPerimeter(int[][] grid, int r, int c) {
        int res = 0;
        if (r == 0 || grid[r - 1][c] == 0) {
            res++;
        }
        if (r == grid.length - 1 || grid[r + 1][c] == 0) {
            res++;
        }
        if (c == 0 || grid[r][c - 1] == 0) {
            res++;
        }
        if (c == grid[0].length - 1 || grid[r][c + 1] == 0) {
            res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}