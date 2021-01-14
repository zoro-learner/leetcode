package leetcode.editor.cn;

//Given a rows x cols matrix mat, where mat[i][j] is either 0 or 1, return the n
//umber of special positions in mat. 
//
// A position (i,j) is called special if mat[i][j] == 1 and all other elements i
//n row i and column j are 0 (rows and columns are 0-indexed). 
//
// 
// Example 1: 
//
// 
//Input: mat = [[1,0,0],
//              [0,0,1],
//              [1,0,0]]
//Output: 1
//Explanation: (1,2) is a special position because mat[1][2] == 1 and all other 
//elements in row 1 and column 2 are 0.
// 
//
// Example 2: 
//
// 
//Input: mat = [[1,0,0],
//              [0,1,0],
//              [0,0,1]]
//Output: 3
//Explanation: (0,0), (1,1) and (2,2) are special positions. 
// 
//
// Example 3: 
//
// 
//Input: mat = [[0,0,0,1],
//              [1,0,0,0],
//              [0,1,1,0],
//              [0,0,0,0]]
//Output: 2
// 
//
// Example 4: 
//
// 
//Input: mat = [[0,0,0,0,0],
//              [1,0,0,0,0],
//              [0,1,0,0,0],
//              [0,0,1,0,0],
//              [0,0,0,1,1]]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// rows == mat.length 
// cols == mat[i].length 
// 1 <= rows, cols <= 100 
// mat[i][j] is 0 or 1. 
// 
// Related Topics 数组 
// 👍 4 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-04 10:51:28
 */
public class SpecialPositionsInABinaryMatrix {
    public static void main(String[] args) {
        Solution solution = new SpecialPositionsInABinaryMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int r = 0; r < m; r++) {
            int col = -1;
            for (int c = 0; c < n; c++) {
                if (mat[r][c] == 1) {
                    if (col == -1) {
                        col = c;
                    } else {
                        col = -1;
                        break;
                    }
                }
            }
            rows[r] = col;
        }

        for (int c = 0; c < n; c++) {
            int row = -1;
            for (int r = 0; r < m; r++) {
                if (mat[r][c] == 1) {
                    if (row == -1) {
                        row = r;
                    } else {
                        row = -1;
                        break;
                    }
                }
            }
            cols[c] = row;
        }

//        System.out.println(Arrays.toString(rows));
//        System.out.println(Arrays.toString(cols));
        int res = 0;
        for (int r = 0; r < m; r++) {
            if (rows[r] != -1 && cols[rows[r]] == r) {
                res++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}