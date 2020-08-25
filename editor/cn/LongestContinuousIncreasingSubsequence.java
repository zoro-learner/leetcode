package leetcode.editor.cn;

//
//Given an unsorted array of integers, find the length of longest continuous inc
//reasing subsequence (subarray).
// 
//
// Example 1: 
// 
//Input: [1,3,5,4,7]
//Output: 3
//Explanation: The longest continuous increasing subsequence is [1,3,5], its len
//gth is 3. 
//Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous
// one where 5 and 7 are separated by 4. 
// 
// 
//
// Example 2: 
// 
//Input: [2,2,2,2,2]
//Output: 1
//Explanation: The longest continuous increasing subsequence is [2], its length 
//is 1. 
// 
// 
//
// Note:
//Length of the array will not exceed 10,000.
// Related Topics 数组 
// 👍 100 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-12 10:21:21
 */
public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestContinuousIncreasingSubsequence().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 1;
        int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                cnt++;
            } else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}