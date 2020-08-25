package leetcode.editor.cn;

//
//Given an array of 2n integers, your task is to group these integers into n pai
//rs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, 
//bi) for all i from 1 to n as large as possible.
// 
//
// Example 1: 
// 
//Input: [1,4,3,2]
//
//Output: 4
//Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4)
//.
// 
// 
//
// Note: 
// 
// n is a positive integer, which is in the range of [1, 10000]. 
// All the integers in the array will be in the range of [-10000, 10000]. 
// 
// Related Topics 数组 
// 👍 178 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-11 14:21:19
 */
public class ArrayPartitionI {
    public static void main(String[] args) {
        Solution solution = new ArrayPartitionI().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length % 2 != 0) {
            throw new IllegalArgumentException("The length of array should be even");
        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length; i += 2) {
            res += nums[i];
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}