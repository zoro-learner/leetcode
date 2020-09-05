package leetcode.editor.cn;

//Given an integer, write a function to determine if it is a power of two. 
//
// Example 1: 
//
// 
//Input: 1
//Output: true 
//Explanation: 20 = 1
// 
//
// Example 2: 
//
// 
//Input: 16
//Output: true
//Explanation: 24 = 16 
//
// Example 3: 
//
// 
//Input: 218
//Output: false 
// Related Topics 位运算 数学 
// 👍 238 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-05 15:18:21
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        Solution solution = new PowerOfTwo().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfTwo(int n) {
        int oneCount = getOneCount(n);
        return oneCount == 1;
    }

    private int getOneCount(int n) {
        int res = 0;
        while (n > 0) {
            int digit = n & 1;
            res += digit;
            n >>= 1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}