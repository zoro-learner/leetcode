package leetcode.editor.cn;

//Given an array of size n, find the majority element. The majority element is t
//he element that appears more than ⌊ n/2 ⌋ times. 
//
// You may assume that the array is non-empty and the majority element always ex
//ist in the array. 
//
// Example 1: 
//
// 
//Input: [3,2,3]
//Output: 3 
//
// Example 2: 
//
// 
//Input: [2,2,1,1,1,2,2]
//Output: 2
// 
// Related Topics 位运算 数组 分治算法 
// 👍 687 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-08 14:31:32
 */
public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counts.containsKey(nums[i])) {
                int oldCount = counts.get(nums[i]);
                counts.replace(nums[i], oldCount + 1);
            } else {
                counts.put(nums[i], 1);
            }
        }
        int maxNum = 0;
        int maxCount = 0;
        for (Integer num : counts.keySet()) {
            if (counts.get(num) > maxCount) {
                maxCount = counts.get(num);
                maxNum = num;
            }
        }
        return maxNum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}