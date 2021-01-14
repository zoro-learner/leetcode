package leetcode.editor.cn;

//Given an integer array of size n, find all elements that appear more than ⌊ n/
//3 ⌋ times. 
//
// Follow-up: Could you solve the problem in linear time and in O(1) space? 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,2,3]
//Output: [3]
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: [1]
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5 * 104 
// -109 <= nums[i] <= 109 
// 
// Related Topics 数组 
// 👍 289 👎 0


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author zoro-learner
 * @create 2020-10-26 17:09:17
 */
public class MajorityElementIi {
    public static void main(String[] args) {
        Solution solution = new MajorityElementIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> counts = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));

        return counts.keySet().stream()
            .filter(k -> counts.get(k) > nums.length / 3)
            .collect(Collectors.toList());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}