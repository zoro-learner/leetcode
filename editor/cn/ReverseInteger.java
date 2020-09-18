package leetcode.editor.cn;

//Given a 32-bit signed integer, reverse digits of an integer. 
//
// Example 1: 
//
// 
//Input: 123
//Output: 321
// 
//
// Example 2: 
//
// 
//Input: -123
//Output: -321
// 
//
// Example 3: 
//
// 
//Input: 120
//Output: 21
// 
//
// Note: 
//Assume we are dealing with an environment which could only store integers with
//in the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this pro
//blem, assume that your function returns 0 when the reversed integer overflows. 
// Related Topics 数学 
// 👍 2169 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-08 10:07:55
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        long copy = x;
        long res = reverseHelper(copy);
        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)res;
    }

    private long reverseHelper(long x) {
        boolean isPositive = true;
        if (x < 0) {
            isPositive = false;
            x = -x;
        }
        long res = 0;
        while (x > 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return isPositive ? res : -res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}