package leetcode.editor.cn;

//Given a m * n matrix mat of ones (representing soldiers) and zeros (representi
//ng civilians), return the indexes of the k weakest rows in the matrix ordered fr
//om the weakest to the strongest. 
//
// A row i is weaker than row j, if the number of soldiers in row i is less than
// the number of soldiers in row j, or they have the same number of soldiers but i
// is less than j. Soldiers are always stand in the frontier of a row, that is, al
//ways ones may appear first and then zeros. 
//
// 
// Example 1: 
//
// 
//Input: mat = 
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]], 
//k = 3
//Output: [2,0,3]
//Explanation: 
//The number of soldiers for each row is: 
//row 0 -> 2 
//row 1 -> 4 
//row 2 -> 1 
//row 3 -> 2 
//row 4 -> 5 
//Rows ordered from the weakest to the strongest are [2,0,3,1,4]
// 
//
// Example 2: 
//
// 
//Input: mat = 
//[[1,0,0,0],
// [1,1,1,1],
// [1,0,0,0],
// [1,0,0,0]], 
//k = 2
//Output: [0,2]
//Explanation: 
//The number of soldiers for each row is: 
//row 0 -> 1 
//row 1 -> 4 
//row 2 -> 1 
//row 3 -> 1 
//Rows ordered from the weakest to the strongest are [0,2,3,1]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 2 <= n, m <= 100 
// 1 <= k <= m 
// matrix[i][j] is either 0 or 1. 
// Related Topics 数组 二分查找 
// 👍 29 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-22 14:38:37
 */
public class TheKWeakestRowsInAMatrix {
    public static void main(String[] args) {
        Solution solution = new TheKWeakestRowsInAMatrix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[k];
        List<List<Integer>> list = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int sum = Arrays.stream(mat[i]).sum();
//            System.out.println(sum);
            List<Integer> idxList = list.get(sum);
//            System.out.println(idxList);
            idxList.add(i);
        }
//        System.out.println(list);

        int idx = 0;
        for (List<Integer> idxList : list) {
            for (int i : idxList) {
                if (idx < k) {
                    res[idx++] = i;
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}