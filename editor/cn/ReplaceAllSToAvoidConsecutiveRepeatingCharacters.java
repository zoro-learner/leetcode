package leetcode.editor.cn;

//Given a string s containing only lower case English letters and the '?' charac
//ter, convert all the '?' characters into lower case letters such that the final 
//string does not contain any consecutive repeating characters. You cannot modify 
//the non '?' characters. 
//
// It is guaranteed that there are no consecutive repeating characters in the gi
//ven string except for '?'. 
//
// Return the final string after all the conversions (possibly zero) have been m
//ade. If there is more than one solution, return any of them. It can be shown tha
//t an answer is always possible with the given constraints. 
//
// 
// Example 1: 
//
// 
//Input: s = "?zs"
//Output: "azs"
//Explanation: There are 25 solutions for this problem. From "azs" to "yzs", all
// are valid. Only "z" is an invalid modification as the string will consist of co
//nsecutive repeating characters in "zzs". 
//
// Example 2: 
//
// 
//Input: s = "ubv?w"
//Output: "ubvaw"
//Explanation: There are 24 solutions for this problem. Only "v" and "w" are inv
//alid modifications as the strings will consist of consecutive repeating characte
//rs in "ubvvw" and "ubvww".
// 
//
// Example 3: 
//
// 
//Input: s = "j?qg??b"
//Output: "jaqgacb"
// 
//
// Example 4: 
//
// 
//Input: s = "??yw?ipkj?"
//Output: "acywaipkja"
// 
//
// 
// Constraints: 
//
// 
// 
// 1 <= s.length <= 100 
// 
// 
// s contains only lower case English letters and '?'. 
// 
// 
// Related Topics 字符串 
// 👍 8 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-04 11:15:17
 */
public class ReplaceAllSToAvoidConsecutiveRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new ReplaceAllSToAvoidConsecutiveRepeatingCharacters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String modifyString(String s) {
        char[] text = s.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (text[i] == '?') {
                char prev = i == 0 ? '0' : text[i - 1];
                char next = i < text.length - 1 ? text[i + 1] : '0';
                text[i] = getValidAlpha(prev, next);
            }
        }
        return new String(text);
    }

    private char getValidAlpha(char prev, char next) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch != prev && ch != next) {
                return ch;
            }
        }
        return '0';

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}