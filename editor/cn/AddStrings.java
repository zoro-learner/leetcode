package leetcode.editor.cn;

//Given two non-negative integers num1 and num2 represented as string, return th
//e sum of num1 and num2. 
//
// Note:
// 
// The length of both num1 and num2 is < 5100. 
// Both num1 and num2 contains only digits 0-9. 
// Both num1 and num2 does not contain any leading zero. 
// You must not use any built-in BigInteger library or convert the inputs to int
//eger directly. 
// 
// Related Topics 字符串 
// 👍 254 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 18:38:57
 */
public class AddStrings {
    public static void main(String[] args) {
        Solution solution = new AddStrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        while (p1 >= 0 || p2 >= 0) {
            int n1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int n2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int sum = n1 + n2 + carry;
            res.append(sum % 10);
            carry = sum / 10;
            p1--;
            p2--;
        }
        if (carry > 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}