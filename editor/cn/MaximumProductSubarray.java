package leetcode.editor.cn;

//Given an integer array nums, find the contiguous subarray within an array (con
//taining at least one number) which has the largest product. 
//
// Example 1: 
//
// 
//Input: [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
// 
//
// Example 2: 
//
// 
//Input: [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray. 
// Related Topics 数组 动态规划 
// 👍 791 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-13 15:03:16
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumProductSubarray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // f(n) = max(f(n - 1) * t(n), t(n))
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int fmax = nums[0];
        int fmin = nums[0];
        int res = nums[0];
        for (int i = 1; i < N; i++) {
            int lastMax = fmax;
            int lastMin = fmin;
            fmax = Math.max(fmax * nums[i], nums[i]);
            fmin = Math.min(fmin * nums[i], nums[i]);
            if (nums[i] < 0) {
                fmax = Math.max(fmax, lastMin * nums[i]);
                fmin = Math.min(fmin, lastMax * nums[i]);
            }
            res = Math.max(res, fmax);
//            System.out.println(fmin[i] + " " + fmax[i]);
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}