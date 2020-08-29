package leetcode.editor.cn;

//Given a string s formed by digits ('0' - '9') and '#' . We want to map s to En
//glish lowercase characters as follows: 
//
// 
// Characters ('a' to 'i') are represented by ('1' to '9') respectively. 
// Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
// 
//
// Return the string formed after mapping. 
//
// It's guaranteed that a unique mapping will always exist. 
//
// 
// Example 1: 
//
// 
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// Example 2: 
//
// 
//Input: s = "1326#"
//Output: "acz"
// 
//
// Example 3: 
//
// 
//Input: s = "25#"
//Output: "y"
// 
//
// Example 4: 
//
// 
//Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
//Output: "abcdefghijklmnopqrstuvwxyz"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s[i] only contains digits letters ('0'-'9') and '#' letter. 
// s will be valid string such that mapping is always possible. 
// Related Topics 字符串 
// 👍 32 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 14:53:35
 */
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        Solution solution = new DecryptStringFromAlphabetToIntegerMapping().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < s.length()) {
            char ch = s.charAt(idx);
            char letter;
            if (ch == '1' || ch == '2') {
                if (idx + 2 < s.length() && s.charAt(idx + 2) == '#') {
                    letter = (char) ('a' + (ch - '0') * 10 + s.charAt(idx + 1) - '0' - 1);
                    idx += 2;
                } else {
                    letter = (char) ('a' + ch - '0' - 1);
                }
            } else {
                letter = (char) ('a' + ch - '0' - 1);
            }
            sb.append(letter);
            idx++;
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}