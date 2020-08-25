package leetcode.editor.cn;

//Given a binary array, find the maximum number of consecutive 1s in this array.
// 
//
// Example 1: 
// 
//Input: [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s.

//
//    The maximum number of consecutive 1s is 3.
// 
// 
//
// Note:
// 
// The input array will only contain 0 and 1. 
// The length of input array is a positive integer and will not exceed 10,000 
// 
// Related Topics 数组 
// 👍 113 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-10 20:28:40
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int cnt = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
            } else {
                res = Math.max(cnt, res);
                cnt = 0;
            }
        }
        res = Math.max(cnt, res);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}