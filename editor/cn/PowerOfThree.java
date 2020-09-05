package leetcode.editor.cn;

//Given an integer, write a function to determine if it is a power of three. 
//
// Example 1: 
//
// 
//Input: 27
//Output: true
// 
//
// Example 2: 
//
// 
//Input: 0
//Output: false 
//
// Example 3: 
//
// 
//Input: 9
//Output: true 
//
// Example 4: 
//
// 
//Input: 45
//Output: false 
//
// Follow up: 
//Could you do it without using any loop / recursion? Related Topics 数学 
// 👍 125 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-05 15:18:30
 */
public class PowerOfThree {
    public static void main(String[] args) {
        Solution solution = new PowerOfThree().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}