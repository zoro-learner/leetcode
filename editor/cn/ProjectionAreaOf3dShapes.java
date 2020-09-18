package leetcode.editor.cn;

//On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the 
//x, y, and z axes. 
//
// Each value v = grid[i][j] represents a tower of v cubes placed on top of grid
// cell (i, j). 
//
// Now we view the projection of these cubes onto the xy, yz, and zx planes. 
//
// A projection is like a shadow, that maps our 3 dimensional figure to a 2 dime
//nsional plane. 
//
// Here, we are viewing the "shadow" when looking at the cubes from the top, the
// front, and the side. 
//
// Return the total area of all three projections. 
//
// 
//
// 
// 
// 
// 
//
// 
// 
// 
// 
// 
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
//
// 
// Example 1: 
//
// 
//Input: [[2]]
//Output: 5
// 
//
// 
// Example 2: 
//
// 
//Input: [[1,2],[3,4]]
//Output: 17
//Explanation: 
//Here are the three projections ("shadows") of the shape made with each axis-al
//igned plane.
//
// 
//
// 
// Example 3: 
//
// 
//Input: [[1,0],[0,2]]
//Output: 8
// 
//
// 
// Example 4: 
//
// 
//Input: [[1,1,1],[1,0,1],[1,1,1]]
//Output: 14
// 
//
// 
// Example 5: 
//
// 
//Input: [[2,2,2],[2,1,2],[2,2,2]]
//Output: 21
// 
//
// 
//
// 
// 
// 
// Note: 
//
// 
// 1 <= grid.length = grid[0].length <= 50 
// 0 <= grid[i][j] <= 50 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// Related Topics 数学 
// 👍 41 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 14:11:40
 */
public class ProjectionAreaOf3dShapes {
    public static void main(String[] args) {
        Solution solution = new ProjectionAreaOf3dShapes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int projectionArea(int[][] grid) {
        int top = areaOfTop(grid);
        int front = areaOfFront(grid);
        int side = areaOfSide(grid);
        return top + front + side;
    }

    private int areaOfSide(int[][] grid) {
        int sum = 0;
        for (int r = 0; r < grid.length; r++) {
            int max = 0;
            for (int c = 0; c < grid[0].length; c++) {
                max = Math.max(max, grid[r][c]);
            }
            sum += max;
        }
        return sum;
    }

    private int areaOfFront(int[][] grid) {
        int sum = 0;
        for (int c = 0; c < grid[0].length; c++) {
            int max = 0;
            for (int r = 0; r < grid.length; r++) {
                max = Math.max(max, grid[r][c]);
            }
            sum += max;
        }
        return sum;
    }

    private int areaOfTop(int[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] > 0) {
                    res++;
                }
            }
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}