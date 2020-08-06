package leetcode.editor.cn;

//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// Example: 
//
// 
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Follow up: 
//
// If you have figured out the O(n) solution, try coding another solution using 
//the divide and conquer approach, which is more subtle. 
// Related Topics 数组 分治算法 动态规划 
// 👍 2270 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-06 10:57:25
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumSubarray().new Solution();
        int[] nums = new int[]{-3, -2, 0, -1};
        System.out.println(solution.maxSubArray(nums));
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int maxSum = nums[0];
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
//            System.out.println(curSum);
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}