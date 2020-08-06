package leetcode.editor.cn;

//Given a sorted array and a target value, return the index if the target is fou
//nd. If not, return the index where it would be if it were inserted in order. 
//
// You may assume no duplicates in the array. 
//
// Example 1: 
//
// 
//Input: [1,3,5,6], 5
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: [1,3,5,6], 2
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: [1,3,5,6], 7
//Output: 4
// 
//
// Example 4: 
//
// 
//Input: [1,3,5,6], 0
//Output: 0
// 
// Related Topics 数组 二分查找 
// 👍 632 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-06 10:47:08
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new SearchInsertPosition().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}