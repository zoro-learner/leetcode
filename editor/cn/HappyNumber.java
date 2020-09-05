package leetcode.editor.cn;

//Write an algorithm to determine if a number n is "happy". 
//
// A happy number is a number defined by the following process: Starting with an
//y positive integer, replace the number by the sum of the squares of its digits, 
//and repeat the process until the number equals 1 (where it will stay), or it loo
//ps endlessly in a cycle which does not include 1. Those numbers for which this p
//rocess ends in 1 are happy numbers. 
//
// Return True if n is a happy number, and False if not. 
//
// Example: 
//
// 
//Input: 19
//Output: true
//Explanation: 
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
// 
// Related Topics 哈希表 数学 
// 👍 431 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-09-02 11:04:00
 */
public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new HappyNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = sumOfSquredDigits(n);
        }
        return true;
    }

    private int sumOfSquredDigits(int n) {
        int res = 0;
        while (n > 0) {
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}