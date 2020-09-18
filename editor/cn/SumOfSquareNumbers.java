package leetcode.editor.cn;

//Given a non-negative integer c, your task is to decide whether there're two in
//tegers a and b such that a2 + b2 = c. 
//
// Example 1: 
//
// 
//Input: 5
//Output: True
//Explanation: 1 * 1 + 2 * 2 = 5
// 
//
// 
//
// Example 2: 
//
// 
//Input: 3
//Output: False
// 
//
// 
// Related Topics 数学 
// 👍 137 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-09-09 10:00:40
 */
public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Solution solution = new SumOfSquareNumbers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 0; i == 0 || i <= c / i + 1; i++) {
            System.out.println(i);
            int other = c - i * i;
            int guess = (int) Math.sqrt(other);
            if (guess * guess == other || (guess + 1) * (guess + 1) == other) {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}