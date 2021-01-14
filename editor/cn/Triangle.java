package leetcode.editor.cn;

//Given a triangle, find the minimum path sum from top to bottom. Each step you 
//may move to adjacent numbers on the row below. 
//
// For example, given the following triangle 
//
// 
//[
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]
// 
//
// The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11). 
//
// Note: 
//
// Bonus point if you are able to do this using only O(n) extra space, where n i
//s the total number of rows in the triangle. 
// Related Topics 数组 动态规划 
// 👍 619 👎 0


import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-13 11:25:44
 */
public class Triangle {
    public static void main(String[] args) {
        Solution solution = new Triangle().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }
        int m = triangle.size();
        int n = triangle.get(m - 1).size();
        int[] sums = new int[n];
        for (int i = 0; i < triangle.get(0).size(); i++) {
            sums[i] = triangle.get(0).get(i);
        }

//        System.out.println(Arrays.toString(sums));
        List<Integer> curr;
        for (int i = 1; i < m; i++) {
            curr = triangle.get(i);
            int last = sums[0];
            for (int j = 0; j < curr.size(); j++) {
                int min;
                if (j == 0) {
                    min = sums[0];
                } else if (j == curr.size() - 1) {
                    min = last;
                } else {
                    min = Math.min(sums[j], last);
                }
                last = sums[j];
                sums[j] = curr.get(j) + min;
            }
//            System.out.println(Arrays.toString(sums));
        }

        return Arrays.stream(sums).min().orElse(0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}