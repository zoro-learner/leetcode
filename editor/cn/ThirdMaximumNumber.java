package leetcode.editor.cn;

//Given a non-empty array of integers, return the third maximum number in this a
//rray. If it does not exist, return the maximum number. The time complexity must 
//be in O(n). 
//
// Example 1: 
// 
//Input: [3, 2, 1]
//
//Output: 1
//
//Explanation: The third maximum is 1.
// 
// 
//
// Example 2: 
// 
//Input: [1, 2]
//
//Output: 2
//
//Explanation: The third maximum does not exist, so the maximum (2) is returned 
//instead.
// 
// 
//
// Example 3: 
// 
//Input: [2, 2, 3, 1]
//
//Output: 1
//
//Explanation: Note that the third maximum here means the third maximum distinct
// number.
//Both numbers with value 2 are both considered as second maximum.
// 
// Related Topics 数组 
// 👍 147 👎 0


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-10 14:10:28
 */
public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        int[] topThree = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            if (num > topThree[0]) {
                topThree[2] = topThree[1];
                topThree[1] = topThree[0];
                topThree[0] = num;
            } else if (num == topThree[0]) {
                continue;
            } else if (num > topThree[1]) {
                topThree[2] = topThree[1];
                topThree[1] = num;
            } else if (num == topThree[1]) {
                continue;
            } else if (num > topThree[2]) {
                topThree[2] = num;
            }
        }
        if (topThree[0] == topThree[1] || topThree[1] == topThree[2]) {
            return topThree[0];
        } else {
            return topThree[2];
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}