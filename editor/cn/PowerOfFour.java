package leetcode.editor.cn;

//Given an integer (signed 32 bits), write a function to check whether it is a p
//ower of 4. 
//
// Example 1: 
//
// 
//Input: 16
//Output: true
// 
//
// 
// Example 2: 
//
// 
//Input: 5
//Output: false 
// 
//
// Follow up: Could you solve it without loops/recursion? Related Topics 位运算 
// 👍 136 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-22 19:10:16
 */
public class PowerOfFour {
    public static void main(String[] args) {
        Solution solution = new PowerOfFour().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }
        while (isDivisibleByFour(num)) {
            num >>= 2;
        }
        return num == 1;
    }

    private boolean isDivisibleByFour(int num) {
        return (num & 3) == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}