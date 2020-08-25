package leetcode.editor.cn;

//Given an integer array, you need to find one continuous subarray that if you o
//nly sort this subarray in ascending order, then the whole array will be sorted i
//n ascending order, too. 
//
// You need to find the shortest such subarray and output its length. 
//
// Example 1: 
// 
//Input: [2, 6, 4, 8, 10, 9, 15]
//Output: 5
//Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the 
//whole array sorted in ascending order.
// 
// 
//
// Note: 
// 
// Then length of the input array is in range [1, 10,000]. 
// The input array may contain duplicates, so ascending order here means <=. 
// 
// Related Topics 数组 
// 👍 369 👎 0



import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-11 14:40:49
 */
public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        Solution solution = new ShortestUnsortedContinuousSubarray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        while (left + 1 < nums.length && nums[left] <= nums[left + 1]) {
            left++;
        }
        if (left + 1 == nums.length) {
            return 0;
        }

        int right = nums.length - 1;
        while (right >= 1 && nums[right] >= nums[right - 1]) {
            right--;
        }
        int minNum = nums[left];
        int maxNum = nums[left];
        for (int i = left + 1; i <= right; i++) {
            minNum = Math.min(minNum, nums[i]);
            maxNum = Math.max(maxNum, nums[i]);
        }

        while (left >= 0 && nums[left] > minNum) {
            left--;
        }

        while (right < nums.length && nums[right] < maxNum) {
            right++;
        }

        return right - left - 1;
    }


}
//leetcode submit region end(Prohibit modification and deletion)


}