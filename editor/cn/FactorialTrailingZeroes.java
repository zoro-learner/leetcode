package leetcode.editor.cn;

//Given an integer n, return the number of trailing zeroes in n!. 
//
// Example 1: 
//
// 
//Input: 3
//Output: 0
//Explanation: 3! = 6, no trailing zero. 
//
// Example 2: 
//
// 
//Input: 5
//Output: 1
//Explanation: 5! = 120, one trailing zero. 
//
// Note: Your solution should be in logarithmic time complexity. 
// Related Topics 数学 
// 👍 347 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-08 15:19:09
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Solution solution = new FactorialTrailingZeroes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trailingZeroes(int n) {
        return countDivisor(n, 5);
    }

    private int countDivisor(int n, int d) {
        int count = 0;
        int t = 1;
        while (t <= n / d) {
            t *= d;
            count += n / t;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}