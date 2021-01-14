package leetcode.editor.cn;

//Given an array nums with n objects colored red, white, or blue, sort them in-p
//lace so that objects of the same color are adjacent, with the colors in the orde
//r red, white, and blue. 
//
// Here, we will use the integers 0, 1, and 2 to represent the color red, white,
// and blue respectively. 
//
// Follow up: 
//
// 
// Could you solve this problem without using the library's sort function? 
// Could you come up with a one-pass algorithm using only O(1) constant space? 
// 
//
// 
// Example 1: 
// Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
// Example 2: 
// Input: nums = [2,0,1]
//Output: [0,1,2]
// Example 3: 
// Input: nums = [0]
//Output: [0]
// Example 4: 
// Input: nums = [1]
//Output: [1]
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 300 
// nums[i] is 0, 1, or 2. 
// 
// Related Topics 排序 数组 双指针 
// 👍 666 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-11 15:25:10
 */
public class SortColors {
    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // [2, 0, 1] --> [1, 0, 2] --> [1, 0, 2] --> [0, 1, 2]
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return ;
        }
        int n = nums.length;
        int head = 0;
        int curr = head;
        int tail = n - 1;

        while (curr <= tail) {
            if (nums[curr] == 0) {
                swap(nums, curr, head++);
                curr = head;
            } else if (nums[curr] == 2) {
                swap(nums, curr, tail--);
            } else {
                curr++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}