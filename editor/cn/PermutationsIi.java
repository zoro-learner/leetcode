package leetcode.editor.cn;

//Given a collection of numbers that might contain duplicates, return all possib
//le unique permutations. 
//
// Example: 
//
// 
//Input: [1,1,2]
//Output:
//[
//  [1,1,2],
//  [1,2,1],
//  [2,1,1]
//]
// 
// Related Topics 回溯算法 
// 👍 489 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-10-12 19:33:08
 */
public class PermutationsIi {
    public static void main(String[] args) {
        Solution solution = new PermutationsIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    Set<List<Integer>> set = new HashSet<>();

    Deque<Integer> paths = new ArrayDeque<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, 0);
        return new ArrayList<>(set);
    }

    private void dfs(int[] nums, boolean[] used, int count) {
        if (count == nums.length) {
            set.add(new ArrayList<>(paths));
            return ;
        }
        if (count > nums.length) {
            return ;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            paths.add(nums[i]);
            used[i] = true;
            dfs(nums, used, count + 1);
            paths.removeLast();
            used[i] = false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}