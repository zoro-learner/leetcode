package leetcode.editor.cn;

//Given the array nums, obtain a subsequence of the array whose sum of elements 
//is strictly greater than the sum of the non included elements in such subsequenc
//e. 
//
// If there are multiple solutions, return the subsequence with minimum size and
// if there still exist multiple solutions, return the subsequence with the maximu
//m total sum of all its elements. A subsequence of an array can be obtained by er
//asing some (possibly zero) elements from the array. 
//
// Note that the solution with the given constraints is guaranteed to be unique.
// Also return the answer sorted in non-increasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [4,3,10,9,8]
//Output: [10,9] 
//Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum 
//of their elements is strictly greater than the sum of elements not included, how
//ever, the subsequence [10,9] has the maximum total sum of its elements. 
// 
//
// Example 2: 
//
// 
//Input: nums = [4,4,7,6,7]
//Output: [7,7,6] 
//Explanation: The subsequence [7,7] has the sum of its elements equal to 14 whi
//ch is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6
//). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. 
//Note the subsequence has to returned in non-decreasing order.  
// 
//
// Example 3: 
//
// 
//Input: nums = [6]
//Output: [6]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 500 
// 1 <= nums[i] <= 100 
// Related Topics 贪心算法 排序 
// 👍 21 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-03 17:22:49
 */
public class MinimumSubsequenceInNonIncreasingOrder {
    public static void main(String[] args) {
        Solution solution = new MinimumSubsequenceInNonIncreasingOrder().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> minSubsequence(int[] nums) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}