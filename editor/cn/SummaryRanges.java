package leetcode.editor.cn;

//You are given a sorted unique integer array nums. 
//
// Return the smallest sorted list of ranges that cover all the numbers in the a
//rray exactly. That is, each element of nums is covered by exactly one of the ran
//ges, and there is no integer x such that x is in one of the ranges but not in nu
//ms. 
//
// Each range [a,b] in the list should be output as: 
//
// 
// "a->b" if a != b 
// "a" if a == b 
// 
//
// 
// Example 1: 
//
// 
//Input: nums = [0,1,2,4,5,7]
//Output: ["0->2","4->5","7"]
//Explanation: The ranges are:
//[0,2] --> "0->2"
//[4,5] --> "4->5"
//[7,7] --> "7"
// 
//
// Example 2: 
//
// 
//Input: nums = [0,2,3,4,6,8,9]
//Output: ["0","2->4","6","8->9"]
//Explanation: The ranges are:
//[0,0] --> "0"
//[2,4] --> "2->4"
//[6,6] --> "6"
//[8,9] --> "8->9"
// 
//
// Example 3: 
//
// 
//Input: nums = []
//Output: []
// 
//
// Example 4: 
//
// 
//Input: nums = [-1]
//Output: ["-1"]
// 
//
// Example 5: 
//
// 
//Input: nums = [0]
//Output: ["0"]
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 20 
// -231 <= nums[i] <= 231 - 1 
// All the values of nums are unique. 
// 
// Related Topics 数组 
// 👍 70 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-26 16:46:35
 */
public class SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new SummaryRanges().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        int head = 0;
        int tail = 0;
        while (tail + 1 < nums.length) {
            if (nums[tail + 1] != nums[tail] + 1) {
                res.add(getRangeString(nums, head, tail));
                head = tail + 1;
            }
            tail++;
        }
        res.add(getRangeString(nums, head, tail));
        return res;
    }

    private String getRangeString(int[] nums, int head, int tail) {
        return head == tail ? "" + nums[head] : nums[head] + "->" + nums[tail];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}