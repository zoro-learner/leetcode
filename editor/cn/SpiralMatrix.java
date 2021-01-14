package leetcode.editor.cn;

//Given a matrix of m x n elements (m rows, n columns), return all elements of t
//he matrix in spiral order. 
//
// Example 1: 
//
// 
//Input:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//Output: [1,2,3,6,9,8,7,4,5]
// 
//
// Example 2: 
//
// 
//Input:
//[
//  [1, 2, 3, 4],
//  [5, 6, 7, 8],
//  [9,10,11,12]
//]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// 
// Related Topics 数组 
// 👍 512 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-10 09:46:45
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int k = (1 + Math.min(m, n)) / 2;
        for (int i = 0; i < k; i++) {
            int left = i;
            int right = m - 1 - i;
            int up = i;
            int down = n - 1 - i;
            int r = i;
            int c = i;
            if (left == right) {
                while (r <= down) {
                    res.add(matrix[r++][c]);
                }
            } else if (down == up) {
                while (c <= right) {
                    res.add(matrix[r][c++]);
                }
            } else {
                while (c < right) {
                    res.add(matrix[r][c++]);
                }
                while (r < down) {
                    res.add(matrix[r++][c]);
                }
                while (c > left) {
                    res.add(matrix[r][c--]);
                }
                while (r > up) {
                    res.add(matrix[r--][c]);
                }
            }
//            System.out.println(res);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}