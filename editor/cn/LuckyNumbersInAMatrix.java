package leetcode.editor.cn;

//Given a m * n matrix of distinct numbers, return all lucky numbers in the matr
//ix in any order. 
//
// A lucky number is an element of the matrix such that it is the minimum elemen
//t in its row and maximum in its column. 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row an
//d the maximum in its column
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
//Output: [12]
//Explanation: 12 is the only lucky number since it is the minimum in its row an
//d the maximum in its column.
// 
//
// Example 3: 
//
// 
//Input: matrix = [[7,8],[1,2]]
//Output: [7]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= n, m <= 50 
// 1 <= matrix[i][j] <= 10^5. 
// All elements in the matrix are distinct. 
// Related Topics 数组 
// 👍 24 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-24 10:26:51
 */
public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {
        Solution solution = new LuckyNumbersInAMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            int c = getMinColIdx(matrix[r]);
//            System.out.println(c);
            if (isColMax(matrix, r, c)) {
                res.add(matrix[r][c]);
            }
        }
        return res;
    }

    private boolean isColMax(int[][] matrix, int r, int c) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][c] > matrix[r][c]) {
                return false;
            }
        }
        return true;
    }

    private int getMinColIdx(int[] row) {
        int minRowIdx = 0;
        int minRow = row[0];
        for (int c = 1; c < row.length; c++) {
            if (row[c] < minRow) {
                minRow = row[c];
                minRowIdx = c;
            }
        }
        return minRowIdx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}