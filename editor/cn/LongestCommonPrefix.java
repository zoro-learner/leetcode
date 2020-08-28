package leetcode.editor.cn;

//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// Example 1: 
//
// 
//Input: ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// Note: 
//
// All given inputs are in lowercase letters a-z. 
// Related Topics 字符串 
// 👍 1231 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-25 19:17:51
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            res = commonPrefix(res, strs[i]);
        }
        return res;
    }

    private String commonPrefix(String s, String t) {
        if (s == null || t == null) {
            return "";
        }
        int idx = 0;
        while (idx < s.length() && idx < t.length()) {
            if (s.charAt(idx) == t.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        return s.substring(0, idx);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}