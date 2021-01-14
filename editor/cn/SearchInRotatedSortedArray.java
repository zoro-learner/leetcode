package leetcode.editor.cn;

//You are given an integer array nums sorted in ascending order, and an integer 
//target. 
//
// Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [
//0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]). 
//
// If target is found in the array return its index, otherwise, return -1. 
//
// 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// Example 3: 
// Input: nums = [1], target = 0
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// -10^4 <= nums[i] <= 10^4 
// All values of nums are unique. 
// nums is guranteed to be rotated at some pivot. 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 二分查找 
// 👍 996 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-09 14:50:46
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Solution solution = new SearchInRotatedSortedArray().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
//            System.out.println(left + " " + right + " " + nums[mid]);
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[left] < nums[right]) {
                    if (nums[mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else if (nums[mid] >= nums[left]) {
                    if (nums[mid] < target || target < nums[left]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                } else {
                    if (nums[mid] > target || target > nums[right]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}