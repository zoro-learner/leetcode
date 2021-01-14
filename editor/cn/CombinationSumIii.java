package leetcode.editor.cn;

//Find all valid combinations of k numbers that sum up to n such that the follow
//ing conditions are true: 
//
// 
// Only numbers 1 through 9 are used. 
// Each number is used at most once. 
// 
//
// Return a list of all possible valid combinations. The list must not contain t
//he same combination twice, and the combinations may be returned in any order. 
//
// 
// Example 1: 
//
// 
//Input: k = 3, n = 7
//Output: [[1,2,4]]
//Explanation:
//1 + 2 + 4 = 7
//There are no other valid combinations. 
//
// Example 2: 
//
// 
//Input: k = 3, n = 9
//Output: [[1,2,6],[1,3,5],[2,3,4]]
//Explanation:
//1 + 2 + 6 = 9
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//There are no other valid combinations.
// 
//
// Example 3: 
//
// 
//Input: k = 4, n = 1
//Output: []
//Explanation: There are no valid combinations. [1,2,1] is not valid because 1 i
//s used twice.
// 
//
// Example 4: 
//
// 
//Input: k = 3, n = 2
//Output: []
//Explanation: There are no valid combinations.
// 
//
// Example 5: 
//
// 
//Input: k = 9, n = 45
//Output: [[1,2,3,4,5,6,7,8,9]]
//Explanation:
//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
//​​​​​​​There are no other valid combinations.
// 
//
// 
// Constraints: 
//
// 
// 2 <= k <= 9 
// 1 <= n <= 60 
// 
// Related Topics 数组 回溯算法 
// 👍 220 👎 0


import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-10-24 15:19:47
 */
public class CombinationSumIii {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIii().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Set<Integer> nums = new HashSet<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k, n, 1);
        return res;
    }

    private void dfs(int k, int n, int startNum) {
        if (k == 0 && n == 0) {
            res.add(new ArrayList<>(nums));
        }
        if (k <= 0 || n < startNum || startNum > 9) {
            return ;
        }
        nums.add(startNum);
        dfs(k - 1, n - startNum, startNum + 1);
        nums.remove(startNum);

        dfs(k, n, startNum + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}