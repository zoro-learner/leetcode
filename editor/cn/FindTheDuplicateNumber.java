package leetcode.editor.cn;

//Given an array of integers nums containing n + 1 integers where each integer i
//s in the range [1, n] inclusive. 
//
// There is only one duplicate number in nums, return this duplicate number. 
//
// Follow-ups: 
//
// 
// How can we prove that at least one duplicate number must exist in nums? 
// Can you solve the problem without modifying the array nums? 
// Can you solve the problem using only constant, O(1) extra space? 
// Can you solve the problem with runtime complexity less than O(n2)? 
// 
//
// 
// Example 1: 
// Input: nums = [1,3,4,2,2]
//Output: 2
// Example 2: 
// Input: nums = [3,1,3,4,2]
//Output: 3
// Example 3: 
// Input: nums = [1,1]
//Output: 1
// Example 4: 
// Input: nums = [1,1,2]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 2 <= n <= 3 * 104 
// nums.length == n + 1 
// 1 <= nums[i] <= n 
// All the integers in nums appear only once except for precisely one integer wh
//ich appears two or more times. 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 928 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-26 18:41:49
 */
public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("No duplicate num");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}