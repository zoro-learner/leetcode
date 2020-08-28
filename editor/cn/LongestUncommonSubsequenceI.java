package leetcode.editor.cn;

//Given two strings, you need to find the longest uncommon subsequence of this t
//wo strings. The longest uncommon subsequence is defined as the longest subsequen
//ce of one of these strings and this subsequence should not be any subsequence of
// the other string. 
//
// A subsequence is a sequence that can be derived from one sequence by deleting
// some characters without changing the order of the remaining elements. Trivially
//, any string is a subsequence of itself and an empty string is a subsequence of 
//any string. 
//
// The input will be two strings, and the output needs to be the length of the l
//ongest uncommon subsequence. If the longest uncommon subsequence doesn't exist, 
//return -1. 
//
// 
// Example 1: 
//
// 
//Input: a = "aba", b = "cdc"
//Output: 3
//Explanation: The longest uncommon subsequence is "aba", 
//because "aba" is a subsequence of "aba", 
//but not a subsequence of the other string "cdc".
//Note that "cdc" can be also a longest uncommon subsequence.
// 
//
// Example 2: 
//
// 
//Input: a = "aaa", b = "bbb"
//Output: 3
// 
//
// Example 3: 
//
// 
//Input: a = "aaa", b = "aaa"
//Output: -1
// 
//
// 
// Constraints: 
//
// 
// Both strings' lengths will be between [1 - 100]. 
// Only letters from a ~ z will appear in input strings. 
// 
// Related Topics 字符串 
// 👍 68 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-27 08:37:07
 */
public class LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        Solution solution = new LongestUncommonSubsequenceI().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() != b.length()) {
            return Math.max(a.length(), b.length());
        }
        if (a.equals(b)) {
            return -1;
        }
        return a.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}