package leetcode.editor.cn;

//Given a collection of candidate numbers (candidates) and a target number (targ
//et), find all unique combinations in candidates where the candidate numbers sums
// to target. 
//
// Each number in candidates may only be used once in the combination. 
//
// Note: 
//
// 
// All numbers (including target) will be positive integers. 
// The solution set must not contain duplicate combinations. 
// 
//
// Example 1: 
//
// 
//Input: candidates = [10,1,2,7,6,1,5], target = 8,
//A solution set is:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
// 
//
// Example 2: 
//
// 
//Input: candidates = [2,5,2,1,2], target = 5,
//A solution set is:
//[
//  [1,2,2],
//  [5]
//]
// 
// Related Topics 数组 回溯算法 
// 👍 418 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-10-09 19:41:21
 */
public class CombinationSumIi {
    public static void main(String[] args) {
        Solution solution = new CombinationSumIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> nums = new ArrayList<>();
        dfs(res, nums, candidates, 0, target);
        return new ArrayList<>(res);
    }

    private void dfs(Set<List<Integer>> res, List<Integer> nums, int[] candidates, int startIdx, int target) {
        if (target < 0) {
            return ;
        }
        if (target == 0) {
            res.add(new ArrayList<>(nums));
            return ;
        }

        for (int i = startIdx; i < candidates.length; i++) {
            nums.add(candidates[i]);
            dfs(res, nums, candidates, i + 1, target - candidates[i]);
            nums.remove(nums.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}