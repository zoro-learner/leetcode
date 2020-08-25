package leetcode.editor.cn;

//Given a non-negative index k where k ≤ 33, return the kth index row of the Pas
//cal's triangle. 
//
// Note that the row index starts from 0. 
//
// 
//In Pascal's triangle, each number is the sum of the two numbers directly above
// it. 
//
// Example: 
//
// 
//Input: 3
//Output: [1,3,3,1]
// 
//
// Follow up: 
//
// Could you optimize your algorithm to use only O(k) extra space? 
// Related Topics 数组 
// 👍 166 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-08 10:12:55
 */
public class PascalsTriangleIi {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangleIi().new Solution();
        solution.getRow(3);
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rows = new ArrayList<>();
        if (rowIndex < 0) {
            return rows;
        }
        rows.add(1);
        for (int i = 0; i < rowIndex; i++) {
            nextRow(rows);
//            System.out.println(rows.toString());
        }
        return rows;
    }

    private void nextRow(List<Integer> rows) {
        assert !rows.isEmpty() : "Input list should not be empty.";
        int n = rows.size();
        rows.add(rows.get(n - 1));
        for (int i = n - 1; i > 0; i--) {
            int sum = rows.get(i) + rows.get(i - 1);
            rows.set(i, sum);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}