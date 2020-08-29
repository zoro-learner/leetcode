package leetcode.editor.cn;

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t (
//t concatenated with itself 1 or more times) 
//
// Given two strings str1 and str2, return the largest string x such that x divi
//des both str1 and str2. 
//
// 
// Example 1: 
// Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
// Example 2: 
// Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
// Example 3: 
// Input: str1 = "LEET", str2 = "CODE"
//Output: ""
// Example 4: 
// Input: str1 = "ABCDEF", str2 = "ABC"
//Output: ""
// 
// 
// Constraints: 
//
// 
// 1 <= str1.length <= 1000 
// 1 <= str2.length <= 1000 
// str1 and str2 consist of English uppercase letters. 
// 
// Related Topics 字符串 
// 👍 164 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 14:09:51
 */
public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        assert str1.length() > 0 && str2.length() > 0;
        int len = gcd(str1.length(), str2.length());
//        System.out.println(len);
        String term = str1.substring(0, len);
        String tmp = nCopies(term, str1.length() / len);
//        System.out.println(tmp);
        if (!str1.equals(tmp)) {
            return "";
        }
        tmp = nCopies(term, str2.length() / len);
//        System.out.println(tmp);
        if (!str2.equals(tmp)) {
            return "";
        }
        return term;
    }

    private String nCopies(String s, int n) {
        StringBuilder sb = new StringBuilder(s.length() * n);
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}