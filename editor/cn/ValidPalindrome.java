package leetcode.editor.cn;

//Given a string, determine if it is a palindrome, considering only alphanumeric
// characters and ignoring cases. 
//
// Note: For the purpose of this problem, we define empty string as valid palind
//rome. 
//
// Example 1: 
//
// 
//Input: "A man, a plan, a canal: Panama"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: "race a car"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// s consists only of printable ASCII characters. 
// 
// Related Topics 双指针 字符串 
// 👍 265 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 14:49:09
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            while (head < tail && !isAlphaNum(s.charAt(head))) {
                head++;
            }
            while (head < tail && !isAlphaNum(s.charAt(tail))) {
                tail--;
            }
            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    private boolean isAlphaNum(char ch) {
//        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
        return Character.isLetterOrDigit(ch);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}