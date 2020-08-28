package leetcode.editor.cn;

//Given two binary strings, return their sum (also a binary string). 
//
// The input strings are both non-empty and contains only characters 1 or 0. 
//
// Example 1: 
//
// 
//Input: a = "11", b = "1"
//Output: "100" 
//
// Example 2: 
//
// 
//Input: a = "1010", b = "1011"
//Output: "10101" 
//
// 
// Constraints: 
//
// 
// Each string consists only of '0' or '1' characters. 
// 1 <= a.length, b.length <= 10^4 
// Each string is either "0" or doesn't contain any leading zero. 
// 
// Related Topics 数学 字符串 
// 👍 461 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 14:38:45
 */
public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int carry = 0;
        while (aIdx >= 0 || bIdx >= 0) {
            int aVal = aIdx >= 0 ? a.charAt(aIdx) - '0' : 0;
            int bVal = bIdx >= 0 ? b.charAt(bIdx) - '0' : 0;
            int sum = aVal + bVal + carry;
            res.append(sum % 2);
            carry = sum / 2;
            aIdx--;
            bIdx--;
        }
        if (carry > 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}