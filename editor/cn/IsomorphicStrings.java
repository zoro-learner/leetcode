package leetcode.editor.cn;

//Given two strings s and t, determine if they are isomorphic. 
//
// Two strings are isomorphic if the characters in s can be replaced to get t. 
//
// All occurrences of a character must be replaced with another character while 
//preserving the order of characters. No two characters may map to the same charac
//ter but a character may map to itself. 
//
// Example 1: 
//
// 
//Input: s = "egg", t = "add"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "foo", t = "bar"
//Output: false 
//
// Example 3: 
//
// 
//Input: s = "paper", t = "title"
//Output: true 
//
// Note: 
//You may assume both s and t have the same length. 
// Related Topics 哈希表 
// 👍 232 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-02 14:33:42
 */
public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution solution = new IsomorphicStrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        final int RANGE = 256;
        char[] sDict = new char[RANGE];
        char[] tDict = new char[RANGE];
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (sDict[ch1] == 0 && tDict[ch2] == 0) {
                sDict[ch1] = ch2;
                tDict[ch2] = ch1;
            }
            if (sDict[ch1] != ch2 || tDict[ch2] != ch1) {
                return false;
            }
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}