package leetcode.editor.cn;

//Given an array of integers nums, write a method that returns the "pivot" index
// of this array. 
//
// We define the pivot index as the index where the sum of all the numbers to th
//e left of the index is equal to the sum of all the numbers to the right of the i
//ndex. 
//
// If no such index exists, we should return -1. If there are multiple pivot ind
//exes, you should return the left-most pivot index. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the su
//m of numbers to the right of index 3.
//Also, 3 is the first index where this occurs.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3]
//Output: -1
//Explanation:
//There is no index that satisfies the conditions in the problem statement.
// 
//
// 
// Constraints: 
//
// 
// The length of nums will be in the range [0, 10000]. 
// Each element nums[i] will be an integer in the range [-1000, 1000]. 
// 
// Related Topics 数组 
// 👍 204 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-12 16:59:41
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        Solution solution = new FindPivotIndex().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }
        int pivot = 0;
        int leftSum = 0;
        int rightSum = Arrays.stream(nums, 1, nums.length).sum();
        while (pivot < nums.length) {
            if (leftSum == rightSum) {
                return pivot;
            }
            leftSum += nums[pivot];
            if (pivot + 1 < nums.length) {
                rightSum -= nums[pivot + 1];
            }
            pivot++;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}