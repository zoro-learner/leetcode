package leetcode.editor.cn;

//Given an m x n matrix. If an element is 0, set its entire row and column to 0.
// Do it in-place. 
//
// Follow up: 
//
// 
// A straight forward solution using O(mn) space is probably a bad idea. 
// A simple improvement uses O(m + n) space, but still not the best solution. 
// Could you devise a constant space solution? 
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
// 
//
// Example 2: 
//
// 
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[0].length 
// 1 <= m, n <= 200 
// -231 <= matrix[i][j] <= 231 - 1 
// 
// Related Topics 数组 
// 👍 301 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 20:00:56
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        Solution solution = new SetMatrixZeroes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;

        boolean isRowZero = false;
        for (int r = 0; r < m; r++) {
            if (matrix[r][0] == 0) {
                isRowZero = true;
                break;
            }
        }

        boolean isColZero = false;
        for (int c = 0; c < n; c++) {
            if (matrix[0][c] == 0) {
                isColZero = true;
                break;
            }
        }

        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        for (int c = 1; c < n; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 0; r < m; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        for (int r = 0; r < m; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 0; c < n; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (isRowZero) {
            for (int r = 0; r < m; r++) {
                matrix[r][0] = 0;
            }
        }

        if (isColZero) {
            for (int c = 0; c < n; c++) {
                matrix[0][c] = 0;
            }
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}