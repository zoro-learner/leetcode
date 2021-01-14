package leetcode.editor.cn;

//Given a positive integer n, generate a square matrix filled with elements from
// 1 to n2 in spiral order. 
//
// Example: 
//
// 
//Input: 3
//Output:
//[
// [ 1, 2, 3 ],
// [ 8, 9, 4 ],
// [ 7, 6, 5 ]
//]
// 
// Related Topics 数组 
// 👍 247 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 18:45:21
 */
public class SpiralMatrixIi {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrixIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        for (int i = 0; i < n / 2; i++) {
            int r = i;
            int c = i;
            while (c < n - 1 - i) {
                matrix[r][c++] = num++;
            }
            while (r < n - 1 - i) {
                matrix[r++][c] = num++;
            }
            while (c > i) {
                matrix[r][c--] = num++;
            }
            while (r > i) {
                matrix[r--][c] = num++;
            }
        }
        if (n % 2 != 0) {
            matrix[n / 2][n / 2] = num;
        }
        return matrix;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}