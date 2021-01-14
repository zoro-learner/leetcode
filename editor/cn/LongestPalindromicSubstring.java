package leetcode.editor.cn;

//Given a string s, return the longest palindromic substring in s. 
//
// 
// Example 1: 
//
// 
//Input: s = "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: s = "cbbd"
//Output: "bb"
// 
//
// Example 3: 
//
// 
//Input: s = "a"
//Output: "a"
// 
//
// Example 4: 
//
// 
//Input: s = "ac"
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consist of only digits and English letters (lower-case and/or upper-case), 
//
// 
// Related Topics 字符串 动态规划 
// 👍 2793 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-12 18:27:20
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String even = helper(s, i, i);
            String odd = helper(s, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
            if (odd.length() > longest.length()) {
                longest = odd;
            }
        }
        return longest;
    }

    private String helper(String s, int left, int right) {
        if (left < 0 || right >= s.length()) {
            return "";
        }
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return s.substring(left + 1, right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}