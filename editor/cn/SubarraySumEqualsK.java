package leetcode.editor.cn;

//Given an array of integers and an integer k, you need to find the total number
// of continuous subarrays whose sum equals to k. 
//
// Example 1: 
//
// 
//Input:nums = [1,1,1], k = 2
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// The length of the array is in range [1, 20,000]. 
// The range of numbers in the array is [-1000, 1000] and the range of the integ
//er k is [-1e7, 1e7]. 
// 
// Related Topics 数组 哈希表 
// 👍 653 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-27 10:58:21
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
        Solution solution = new SubarraySumEqualsK().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            sums[i + 1] = sum;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sums[j + 1] - sums[i] == k) {
                    res++;
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}