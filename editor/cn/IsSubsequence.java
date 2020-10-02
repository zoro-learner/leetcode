package leetcode.editor.cn;

//Given a string s and a string t, check if s is subsequence of t. 
//
// A subsequence of a string is a new string which is formed from the original s
//tring by deleting some (can be none) of the characters without disturbing the re
//lative positions of the remaining characters. (ie, "ace" is a subsequence of "ab
//cde" while "aec" is not). 
//
// Follow up: 
//If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you w
//ant to check one by one to see if T has its subsequence. In this scenario, how w
//ould you change your code? 
//
// Credits: 
//Special thanks to @pbrother for adding this problem and creating all test case
//s. 
//
// 
// Example 1: 
// Input: s = "abc", t = "ahbgdc"
//Output: true
// Example 2: 
// Input: s = "axc", t = "ahbgdc"
//Output: false
// 
// 
// Constraints: 
//
// 
// 0 <= s.length <= 100 
// 0 <= t.length <= 10^4 
// Both strings consists only of lowercase characters. 
// 
// Related Topics 贪心算法 二分查找 动态规划 
// 👍 323 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-22 19:38:55
 */
public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        if (s.charAt(0) == t.charAt(0)) {
            return isSubsequence(s.substring(1), t.substring(1));
        } else {
            return isSubsequence(s, t.substring(1));
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}