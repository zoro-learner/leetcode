package leetcode.editor.cn;

//Given an integer n and an integer start. 
//
// Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.le
//ngth. 
//
// Return the bitwise XOR of all elements of nums. 
//
// 
// Example 1: 
//
// 
//Input: n = 5, start = 0
//Output: 8
//Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) 
//= 8.
//Where "^" corresponds to bitwise XOR operator.
// 
//
// Example 2: 
//
// 
//Input: n = 4, start = 3
//Output: 8
//Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8. 
//
// Example 3: 
//
// 
//Input: n = 1, start = 7
//Output: 7
// 
//
// Example 4: 
//
// 
//Input: n = 10, start = 5
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// 0 <= start <= 1000 
// n == nums.length 
// Related Topics 位运算 数组 
// 👍 10 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-24 17:28:56
 */
public class XorOperationInAnArray {
    public static void main(String[] args) {
        Solution solution = new XorOperationInAnArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= start + 2 * i;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}