package leetcode.editor.cn;

//Given an integer n. No-Zero integer is a positive integer which doesn't contai
//n any 0 in its decimal representation. 
//
// Return a list of two integers [A, B] where: 
//
// 
// A and B are No-Zero integers. 
// A + B = n 
// 
//
// It's guarateed that there is at least one valid solution. If there are many v
//alid solutions you can return any of them. 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: [1,1]
//Explanation: A = 1, B = 1. A + B = n and both A and B don't contain any 0 in t
//heir decimal representation.
// 
//
// Example 2: 
//
// 
//Input: n = 11
//Output: [2,9]
// 
//
// Example 3: 
//
// 
//Input: n = 10000
//Output: [1,9999]
// 
//
// Example 4: 
//
// 
//Input: n = 69
//Output: [1,68]
// 
//
// Example 5: 
//
// 
//Input: n = 1010
//Output: [11,999]
// 
//
// 
// Constraints: 
//
// 
// 2 <= n <= 10^4 
// Related Topics 数学 
// 👍 16 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 16:31:29
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        Solution solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int num = 1; num < n; num++) {
            if (hasNoZero(num) && hasNoZero(n - num)) {
                return new int[] {num, n - num};
            }
        }
        throw new IllegalArgumentException("No sol");
    }

    private boolean hasNoZero(int num) {
        if (num == 0) {
            return false;
        }
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}