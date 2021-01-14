package leetcode.editor.cn;

//Given two non-negative integers num1 and num2 represented as strings, return t
//he product of num1 and num2, also represented as a string. 
//
// Note: You must not use any built-in BigInteger library or convert the inputs 
//to integer directly. 
//
// 
// Example 1: 
// Input: num1 = "2", num2 = "3"
//Output: "6"
// Example 2: 
// Input: num1 = "123", num2 = "456"
//Output: "56088"
// 
// 
// Constraints: 
//
// 
// 1 <= num1.length, num2.length <= 200 
// num1 and num2 consist of digits only. 
// Both num1 and num2 do not contain any leading zero, except the number 0 itsel
//f. 
// 
// Related Topics 数学 字符串 
// 👍 498 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-23 11:14:49
 */
public class MultiplyStrings {
    public static void main(String[] args) {
        Solution solution = new MultiplyStrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int len2 = num2.length();
        for (int i = 0; i < len2; i++) {
            StringBuilder tmp = mul(num1, num2.charAt(len2 - 1 - i));
            if (tmp.length() > 0) {
                tmp.append("0".repeat(i));
            }
            res = add(res, tmp);
        }
        return res.length() > 0 ? res.toString() : "0";
    }

    private StringBuilder add(StringBuilder s1, StringBuilder s2) {
        if (s1.length() == 0) {
            return s2;
        }
        if (s2.length() == 0) {
            return s1;
        }
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int idx1 = s1.length() - 1;
        int idx2 = s2.length() - 1;
        while (idx1 >= 0 || idx2 >= 0) {
            int num1 = idx1 >= 0 ? s1.charAt(idx1) - '0' : 0;
            int num2 = idx2 >= 0 ? s2.charAt(idx2) - '0' : 0;
            int tmp = num1 + num2 + carry;
            sum.append((char) ('0' + (tmp % 10)));
            carry = tmp / 10;
            idx1--;
            idx2--;
        }
        if (carry > 0) {
            sum.append((char) ('0' + carry));
        }
        return sum.reverse();
    }

    private StringBuilder mul(String s, char ch) {
        StringBuilder res = new StringBuilder();
        if (ch == '0' || "0".equals(s)) {
            return res;
        }
        int carry = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int tmp = (s.charAt(i) - '0') * (ch - '0');
            tmp += carry;
            res.append((char) ('0' + (tmp % 10)));
            carry = tmp / 10;
        }
        if (carry > 0) {
            res.append((char) ('0' + carry));
        }
        return res.reverse();
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}