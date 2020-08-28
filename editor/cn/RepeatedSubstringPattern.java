package leetcode.editor.cn;

//Given a non-empty string check if it can be constructed by taking a substring 
//of it and appending multiple copies of the substring together. You may assume th
//e given string consists of lowercase English letters only and its length will no
//t exceed 10000. 
//
// 
//
// Example 1: 
//
// 
//Input: "abab"
//Output: True
//Explanation: It's the substring "ab" twice.
// 
//
// Example 2: 
//
// 
//Input: "aba"
//Output: False
// 
//
// Example 3: 
//
// 
//Input: "abcabcabcabc"
//Output: True
//Explanation: It's the substring "abc" four times. (And the substring "abcabc" 
//twice.)
// 
// Related Topics 字符串 
// 👍 344 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 19:40:45
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        Solution solution = new RepeatedSubstringPattern().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (isPattern(i + 1, s)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPattern(int len, String s) {
        if (s.length() % len != 0) {
            return false;
        }
        for (int i = 0; i <= s.length() - len; i += len) {
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) != s.charAt(i + j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}