package leetcode.editor.cn;

//Given an array, rotate the array to the right by k steps, where k is non-negat
//ive. 
//
// Follow up: 
//
// 
// Try to come up as many solutions as you can, there are at least 3 different w
//ays to solve this problem. 
// Could you do it in-place with O(1) extra space? 
// 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 10^4 
// It's guaranteed that nums[i] fits in a 32 bit-signed integer. 
// k >= 0 
// 
// Related Topics 数组 
// 👍 647 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-08 15:16:26
 */
public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k);
//        System.out.println(Arrays.toString(nums));
        reverse(nums, n - k, n);
//        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, n);
//        System.out.println(Arrays.toString(nums));
    }

    /**
     * 不包含end
     * @param nums
     * @param begin
     * @param end
     */
    private void reverse(int[] nums, int begin, int end) {
        for (int i = 0; i < (end - begin) / 2; i++) {
            int tmp = nums[begin + i];
            nums[begin + i] = nums[end - 1 - i];
            nums[end - 1 - i] = tmp;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}