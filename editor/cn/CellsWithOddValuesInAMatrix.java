package leetcode.editor.cn;

//Given n and m which are the dimensions of a matrix initialized by zeros and gi
//ven an array indices where indices[i] = [ri, ci]. For each pair of [ri, ci] you 
//have to increment all cells in row ri and column ci by 1. 
//
// Return the number of cells with odd values in the matrix after applying the i
//ncrement to all indices. 
//
// 
// Example 1: 
//
// 
//Input: n = 2, m = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
// 
//
// Example 2: 
//
// 
//Input: n = 2, m = 2, indices = [[1,1],[0,0]]
//Output: 0
//Explanation: Final matrix = [[2,2],[2,2]]. There is no odd number in the final
// matrix.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 50 
// 1 <= m <= 50 
// 1 <= indices.length <= 100 
// 0 <= indices[i][0] < n 
// 0 <= indices[i][1] < m 
// 
// Related Topics 数组 
// 👍 37 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-22 10:39:23
 */
public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        Solution solution = new CellsWithOddValuesInAMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        Map<Integer, Integer> rowCount = new HashMap<>();
        Map<Integer, Integer> colCount = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            rowCount.put(row, rowCount.getOrDefault(row, 0) + 1);
            colCount.put(col, colCount.getOrDefault(col, 0) + 1);
        }

        int rowOdd = (int) rowCount.values().stream().filter(t -> (t & 1) != 0).count();
        int colOdd = (int) colCount.values().stream().filter(t -> (t & 1) != 0).count();
        return Math.abs(rowOdd * m + colOdd * n - 2 * rowOdd * colOdd);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}