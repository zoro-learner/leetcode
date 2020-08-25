package leetcode.editor.cn;

//Given an array nums, write a function to move all 0's to the end of it while m
//aintaining the relative order of the non-zero elements. 
//
// Example: 
//
// 
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0] 
//
// Note: 
//
// 
// You must do this in-place without making a copy of the array. 
// Minimize the total number of operations. 
// Related Topics 数组 双指针 
// 👍 688 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-10 11:20:16
 */
public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[p] == 0) {
               nums[p] = nums[i];
                nums[i] = 0;
            }
            p++;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}