package leetcode.editor.cn;

//Suppose an array sorted in ascending order is rotated at some pivot unknown to
// you beforehand. 
//
// (i.e., [0,0,1,2,2,5,6] might become [2,5,6,0,0,1,2]). 
//
// You are given a target value to search. If found in the array return true, ot
//herwise return false. 
//
// Example 1: 
//
// 
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
// 
//
// Example 2: 
//
// 
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false 
//
// Follow up: 
//
// 
// This is a follow up problem to Search in Rotated Sorted Array, where nums may
// contain duplicates. 
// Would this affect the run-time complexity? How and why? 
// 
// Related Topics 数组 二分查找 
// 👍 232 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-12 20:59:19
 */
public class SearchInRotatedSortedArrayIi {
    public static void main(String[] args) {
        Solution solution = new SearchInRotatedSortedArrayIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean search(int[] nums, int target) {
        return Arrays.stream(nums).anyMatch(t -> t == target);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}