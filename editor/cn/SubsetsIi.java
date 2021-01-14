package leetcode.editor.cn;

//Given a collection of integers that might contain duplicates, nums, return all
// possible subsets (the power set). 
//
// Note: The solution set must not contain duplicate subsets. 
//
// Example: 
//
// 
//Input: [1,2,2]
//Output:
//[
//  [2],
//  [1],
//  [1,2,2],
//  [2,2],
//  [1,2],
//  []
//]
// 
// Related Topics 数组 回溯算法 
// 👍 321 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-10-11 18:26:40
 */
public class SubsetsIi {
    public static void main(String[] args) {
        Solution solution = new SubsetsIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        dfs(res, subset, nums, 0);
        return new ArrayList<>(res);
    }

    private void dfs(Set<List<Integer>> res, List<Integer> subset, int[] nums, int fromIdx) {
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