package leetcode.editor.cn;

//Write an efficient algorithm that searches for a value in an m x n matrix. Thi
//s matrix has the following properties: 
//
// 
// Integers in each row are sorted from left to right. 
// The first integer of each row is greater than the last integer of the previou
//s row. 
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 3
//Output: true
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,50]], target = 13
//Output: false
// 
//
// Example 3: 
//
// 
//Input: matrix = [], target = 0
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 0 <= m, n <= 100 
// -104 <= matrix[i][j], target <= 104 
// 
// Related Topics 数组 二分查找 
// 👍 254 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-11 10:56:11
 */
public class SearchA2dMatrix {
    public static void main(String[] args) {
        Solution solution = new SearchA2dMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        boolean res = searchMatrixWithinRange(matrix, 0, matrix.length, target);
        return res;
    }

    private boolean searchMatrixWithinRange(int[][] matrix, int fromIdx, int toIdx, int target) {
        if (toIdx - fromIdx == 1) {
            return Arrays.binarySearch(matrix[fromIdx], target) >= 0;
        }
        int n = matrix[0].length;
        int rMid = fromIdx + (toIdx - fromIdx) / 2;
        int cMid = n / 2;
        if (target == matrix[rMid][cMid]) {
            return true;
        } else if (target > matrix[rMid][cMid]) {
            fromIdx = rMid;
        } else if (target >= matrix[rMid][0]) {
            fromIdx = rMid;
            toIdx = rMid + 1;
        } else {
            toIdx = rMid;
        }
        return searchMatrixWithinRange(matrix, fromIdx, toIdx, target);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}