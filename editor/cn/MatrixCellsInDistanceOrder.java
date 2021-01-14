package leetcode.editor.cn;

//We are given a matrix with R rows and C columns has cells with integer coordin
//ates (r, c), where 0 <= r < R and 0 <= c < C. 
//
// Additionally, we are given a cell in that matrix with coordinates (r0, c0). 
//
// Return the coordinates of all cells in the matrix, sorted by their distance f
//rom (r0, c0) from smallest distance to largest distance. Here, the distance betw
//een two cells (r1, c1) and (r2, c2) is the Manhattan distance, |r1 - r2| + |c1 -
// c2|. (You may return the answer in any order that satisfies this condition.) 
//
// 
//
// 
// Example 1: 
//
// 
//Input: R = 1, C = 2, r0 = 0, c0 = 0
//Output: [[0,0],[0,1]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1]
// 
//
// 
// Example 2: 
//
// 
//Input: R = 2, C = 2, r0 = 0, c0 = 1
//Output: [[0,1],[0,0],[1,1],[1,0]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2]
//The answer [[0,1],[1,1],[0,0],[1,0]] would also be accepted as correct.
// 
//
// 
// Example 3: 
//
// 
//Input: R = 2, C = 3, r0 = 1, c0 = 2
//Output: [[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
//Explanation: The distances from (r0, c0) to other cells are: [0,1,1,2,2,3]
//There are other answers that would also be accepted as correct, such as [[1,2]
//,[1,1],[0,2],[1,0],[0,1],[0,0]].
// 
//
// 
//
// Note: 
//
// 
// 1 <= R <= 100 
// 1 <= C <= 100 
// 0 <= r0 < R 
// 0 <= c0 < C 
// 
// 
// 
// 
// Related Topics 排序 
// 👍 44 👎 0


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-10-06 14:34:48
 */
public class MatrixCellsInDistanceOrder {
    public static void main(String[] args) {
        Solution solution = new MatrixCellsInDistanceOrder().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[] zero = new int[]{r0, c0};
        List<int[]> points = new ArrayList<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                points.add(new int[]{r, c});
            }
        }

        List<int[]> sortedPoints = points.stream().sorted(Comparator.comparing(p -> distance(p, zero))).collect(Collectors.toList());

        int[][] res = new int[R * C][2];
        for (int i = 0; i < sortedPoints.size(); i++) {
            System.arraycopy(sortedPoints.get(i), 0, res[i], 0, 2);
        }
        return res;
    }

    private int distance(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}