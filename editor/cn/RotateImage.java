package leetcode.editor.cn;

//You are given an n x n 2D matrix representing an image, rotate the image by 90
// degrees (clockwise). 
//
// You have to rotate the image in-place, which means you have to modify the inp
//ut 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation. 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
// 
//
// Example 2: 
//
// 
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
// 
//
// Example 3: 
//
// 
//Input: matrix = [[1]]
//Output: [[1]]
// 
//
// Example 4: 
//
// 
//Input: matrix = [[1,2],[3,4]]
//Output: [[3,1],[4,2]]
// 
//
// 
// Constraints: 
//
// 
// matrix.length == n 
// matrix[i].length == n 
// 1 <= n <= 20 
// -1000 <= matrix[i][j] <= 1000 
// 
// Related Topics 数组 
// 👍 593 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-10 09:23:40
 */
public class RotateImage {
    public static void main(String[] args) {
        Solution solution = new RotateImage().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            rotateOuter(matrix, i, n - i);
        }
    }

    private void rotateOuter(int[][] matrix, int fromIdx, int toIdx) {
        int n = toIdx - fromIdx;
        for (int i = 0; i < n - 1; i++) {
            int tmp = matrix[fromIdx][fromIdx + i];
            matrix[fromIdx][fromIdx + i] = matrix[toIdx - 1 - i][fromIdx];
            matrix[toIdx - 1 - i][fromIdx] = matrix[toIdx - 1][toIdx - 1 - i];
            matrix[toIdx - 1][toIdx - 1 - i] = matrix[fromIdx + i][toIdx - 1];
            matrix[fromIdx + i][toIdx - 1] = tmp;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}