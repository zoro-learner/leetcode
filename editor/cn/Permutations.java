package leetcode.editor.cn;

//Given a collection of distinct integers, return all possible permutations. 
//
// Example: 
//
// 
//Input: [1,2,3]
//Output:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// 
// Related Topics 回溯算法 
// 👍 949 👎 0


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-12 19:17:00
 */
public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> res = new ArrayList<>();

    Deque<Integer> paths = new ArrayDeque<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, 0);
        return res;
    }

    private void dfs(int[] nums, boolean[] used, int count) {
        if (count == nums.length) {
            res.add(new ArrayList<>(paths));
            return ;
        }
        if (count > nums.length) {
            return ;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            paths.add(nums[i]);
            dfs(nums, used, count + 1);
            paths.removeLast();
            used[i] = false;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}