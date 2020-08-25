package leetcode.editor.cn;

//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find 
//the one that is missing from the array. 
//
// Example 1: 
//
// 
//Input: [3,0,1]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: [9,6,4,2,3,5,7,0,1]
//Output: 8
// 
//
// Note: 
//Your algorithm should run in linear runtime complexity. Could you implement it
// using only constant extra space complexity? Related Topics 位运算 数组 数学 
// 👍 300 👎 0


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author zoro-learner
 * @create 2020-08-10 10:57:03
 */
public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new MissingNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for (int i = 1; i <= nums.length; i++) {
            res ^= i;
        }
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}