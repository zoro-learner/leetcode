package leetcode.editor.cn;

//
//Given a non-empty string s, you may delete at most one character. Judge whethe
//r you can make it a palindrome.
// 
//
// Example 1: 
// 
//Input: "aba"
//Output: True
// 
// 
//
// Example 2: 
// 
//Input: "abca"
//Output: True
//Explanation: You could delete the character 'c'.
// 
// 
//
// Note: 
// 
// The string will only contain lowercase characters a-z.
//The maximum length of the string is 50000. 
// 
// Related Topics 字符串 
// 👍 250 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-27 15:49:00
 */
public class ValidPalindromeIi {
    public static void main(String[] args) {
        Solution solution = new ValidPalindromeIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() <= 2) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        while (head < tail) {
            if (s.charAt(head) == s.charAt(tail)) {
                head++;
                tail--;
            } else {
                return isPalindrome(s, head + 1, tail) || isPalindrome(s, head, tail - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int head, int tail) {
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}