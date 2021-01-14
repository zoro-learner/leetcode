package leetcode.editor.cn;

//Given an array of non-negative integers, you are initially positioned at the f
//irst index of the array. 
//
// Each element in the array represents your maximum jump length at that positio
//n. 
//
// Determine if you are able to reach the last index. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jum
//p length is 0, which makes it impossible to reach the last index.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 10^4 
// 0 <= nums[i][j] <= 10^5 
// 
// Related Topics 贪心算法 数组 
// 👍 859 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-10 14:26:04
 */
public class JumpGame {
    public static void main(String[] args) {
        Solution solution = new JumpGame().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        boolean[] isReachable = new boolean[nums.length];
        isReachable[nums.length - 1] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            boolean tmp = false;
            for (int k = nums[i]; k >= 1; k--) {
                if (k + i >= nums.length - 1 || isReachable[i + k]) {
                    tmp = true;
                    break;
                }
            }
            isReachable[i] = tmp;
        }
        return isReachable[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}