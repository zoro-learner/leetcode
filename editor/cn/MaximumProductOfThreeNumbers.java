package leetcode.editor.cn;

//Given an integer array, find three numbers whose product is maximum and output
// the maximum product. 
//
// Example 1: 
//
// 
//Input: [1,2,3]
//Output: 6
// 
//
// 
//
// Example 2: 
//
// 
//Input: [1,2,3,4]
//Output: 24
// 
//
// 
//
// Note: 
//
// 
// The length of the given array will be in range [3,104] and all elements are i
//n the range [-1000, 1000]. 
// Multiplication of any three numbers in the input won't exceed the range of 32
//-bit signed integer. 
// 
//
// 
// Related Topics 数组 数学 
// 👍 154 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-11 19:12:13
 */
public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        Solution solution = new MaximumProductOfThreeNumbers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int maxPositive = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int maxWithNegative = nums[0] * nums[1] * nums[len - 1];
        return Math.max(maxPositive, maxWithNegative);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}