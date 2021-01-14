package leetcode.editor.cn;

//Given a set of distinct integers, nums, return all possible subsets (the power
// set). 
//
// Note: The solution set must not contain duplicate subsets. 
//
// Example: 
//
// 
//Input: nums = [1,2,3]
//Output:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics 位运算 数组 回溯算法 
// 👍 836 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-11 16:29:14
 */
public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(res, subset, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> subset, int[] nums, int fromIdx) {
        res.add(new ArrayList<>(subset));
        if (fromIdx == nums.length) {
            return ;
        }

        for (int i = fromIdx; i < nums.length; i++) {
            subset.add(nums[i]);
            dfs(res, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}