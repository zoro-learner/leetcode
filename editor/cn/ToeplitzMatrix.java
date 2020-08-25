package leetcode.editor.cn;

//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the s
//ame element. 
//
// Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
// 
// 
//
// Example 1: 
//
// 
//Input:
//matrix = [
//  [1,2,3,4],
//  [5,1,2,3],
//  [9,5,1,2]
//]
//Output: True
//Explanation:
//In the above grid, the diagonals are:
//"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//In each diagonal all elements are the same, so the answer is True.
// 
//
// Example 2: 
//
// 
//Input:
//matrix = [
//  [1,2],
//  [2,2]
//]
//Output: False
//Explanation:
//The diagonal "[1, 2]" has different elements.
// 
//
// 
//Note: 
//
// 
// matrix will be a 2D array of integers. 
// matrix will have a number of rows and columns in range [1, 20]. 
// matrix[i][j] will be integers in range [0, 99]. 
// 
//
// 
//Follow up: 
//
// 
// What if the matrix is stored on disk, and the memory is limited such that you
// can only load at most one row of the matrix into the memory at once? 
// What if the matrix is so large that you can only load up a partial row into t
//he memory at once? 
// 
// Related Topics 数组 
// 👍 124 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-13 14:46:35
 */
public class ToeplitzMatrix {
    public static void main(String[] args) {
        Solution solution = new ToeplitzMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; i + j < m && j < n; j++) {
                if (matrix[i][0] != matrix[i + j][j]) {
                    return false;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m && i + j < n; j++) {
                if (matrix[0][i] != matrix[j][i + j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}