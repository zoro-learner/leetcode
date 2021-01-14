package leetcode.editor.cn;

//A peak element is an element that is greater than its neighbors. 
//
// Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and
// return its index. 
//
// The array may contain multiple peaks, in that case return the index to any on
//e of the peaks is fine. 
//
// You may imagine that nums[-1] = nums[n] = -∞. 
//
// Example 1: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index num
//ber 2. 
//
// Example 2: 
//
// 
//Input: nums = [1,2,1,3,5,6,4]
//Output: 1 or 5 
//Explanation: Your function can return either index number 1 where the peak ele
//ment is 2, 
//             or index number 5 where the peak element is 6.
// 
//
// Follow up: Your solution should be in logarithmic complexity. 
// Related Topics 数组 二分查找 
// 👍 316 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-23 19:04:39
 */
public class FindPeakElement {
    public static void main(String[] args) {
        Solution solution = new FindPeakElement().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("No such element");
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid == 0 || nums[mid] > nums[mid - 1]) {
                if (mid == nums.length - 1 || nums[mid] > nums[mid + 1]) {
                    return mid;
                } else { // mid < mid + 1
                    left = mid + 1;
                }
            } else { // mid < mid - 1
                right = mid;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}