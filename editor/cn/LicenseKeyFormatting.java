package leetcode.editor.cn;

//You are given a license key represented as a string S which consists only alph
//anumeric character and dashes. The string is separated into N+1 groups by N dash
//es. 
//
// Given a number K, we would want to reformat the strings such that each group 
//contains exactly K characters, except for the first group which could be shorter
// than K, but still must contain at least one character. Furthermore, there must 
//be a dash inserted between two groups and all lowercase letters should be conver
//ted to uppercase. 
//
// Given a non-empty string S and a number K, format the string according to the
// rules described above. 
//
// Example 1: 
// 
//Input: S = "5F3Z-2e-9-w", K = 4
//
//Output: "5F3Z-2E9W"
//
//Explanation: The string S has been split into two parts, each part has 4 chara
//cters.
//Note that the two extra dashes are not needed and can be removed.
// 
// 
//
//
// Example 2: 
// 
//Input: S = "2-5g-3-J", K = 2
//
//Output: "2-5G-3J"
//
//Explanation: The string S has been split into three parts, each part has 2 cha
//racters except the first part as it could be shorter as mentioned above.
// 
// 
//
// Note: 
// 
// The length of string S will not exceed 12,000, and K is a positive integer. 
// String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-
//9) and dashes(-). 
// String S is non-empty. 
// 
// 👍 50 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-06 10:18:38
 */
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        Solution solution = new LicenseKeyFormatting().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int t = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) != '-') {
                sb.append(Character.toUpperCase(S.charAt(i)));
                t++;
            }
            if (t == K) {
                sb.append('-');
                t = 0;
            }
        }

        int idx = sb.length() - 1;
        while (idx >= 0 && sb.charAt(idx) == '-') {
            sb.deleteCharAt(idx);
            idx--;
        }

        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}