package leetcode.editor.cn;

//Given an integer n, return a string with n characters such that each character
// in such string occurs an odd number of times. 
//
// The returned string must contain only lowercase English letters. If there are
// multiples valid strings, return any of them. 
//
// 
// Example 1: 
//
// 
//Input: n = 4
//Output: "pppz"
//Explanation: "pppz" is a valid string since the character 'p' occurs three tim
//es and the character 'z' occurs once. Note that there are many other valid strin
//gs such as "ohhh" and "love".
// 
//
// Example 2: 
//
// 
//Input: n = 2
//Output: "xy"
//Explanation: "xy" is a valid string since the characters 'x' and 'y' occur onc
//e. Note that there are many other valid strings such as "ag" and "ur".
// 
//
// Example 3: 
//
// 
//Input: n = 7
//Output: "holasss"
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 500 
// Related Topics 字符串 
// 👍 8 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 17:16:12
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        Solution solution = new GenerateAStringWithCharactersThatHaveOddCounts().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder(n);
        int odd = n % 2 == 0 ? n - 1 : n;
        for (int i = 0; i < odd; i++) {
            sb.append('a');
        }
        if (odd < n) {
            sb.append('b');
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}