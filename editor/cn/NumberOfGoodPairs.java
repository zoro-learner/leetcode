package leetcode.editor.cn;

//Given an array of integers nums. 
//
// A pair (i,j) is called good if nums[i] == nums[j] and i < j. 
//
// Return the number of good pairs. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,1,1,1]
//Output: 6
//Explanation: Each pair in the array are good.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 100 
// Related Topics 数组 哈希表 数学 
// 👍 21 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-24 19:06:07
 */
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Solution solution = new NumberOfGoodPairs().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count >= 2) {
                res += count * (count - 1) / 2;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}