package leetcode.editor.cn;

//Given an array consisting of n integers, find the contiguous subarray of given
// length k that has the maximum average value. And you need to output the maximum
// average value. 
//
// Example 1: 
//
// 
//Input: [1,12,-5,-6,50,3], k = 4
//Output: 12.75
//Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
// 
//
// 
//
// Note: 
//
// 
// 1 <= k <= n <= 30,000. 
// Elements of the given array will be in the range [-10,000, 10,000]. 
// 
//
// 
// Related Topics 数组 
// 👍 102 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-11 19:18:32
 */
public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Solution solution = new MaximumAverageSubarrayI().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = Arrays.stream(nums, 0, k).sum();
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return (double)maxSum / k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}