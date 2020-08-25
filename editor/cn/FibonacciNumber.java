package leetcode.editor.cn;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibon
//acci sequence, such that each number is the sum of the two preceding ones, start
//ing from 0 and 1. That is, 
//
// 
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), for N > 1.
// 
//
// Given N, calculate F(N). 
//
// 
//
// Example 1: 
//
// 
//Input: 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
// 
//
// Example 2: 
//
// 
//Input: 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
// 
//
// Example 3: 
//
// 
//Input: 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
// 
//
// 
//
// Note: 
//
// 0 ≤ N ≤ 30. 
// Related Topics 数组 
// 👍 149 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:06
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        Solution solution = new FibonacciNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int f0 = 0;
        int f1 = 1;
        while (--N > 0) {
            int f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}