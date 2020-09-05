package leetcode.editor.cn;

//Given two strings S and T, return if they are equal when both are typed into e
//mpty text editors. # means a backspace character. 
//
// Note that after backspacing an empty text, the text will continue empty. 
//
// 
// Example 1: 
//
// 
//Input: S = "ab#c", T = "ad#c"
//Output: true
//Explanation: Both S and T become "ac".
// 
//
// 
// Example 2: 
//
// 
//Input: S = "ab##", T = "c#d#"
//Output: true
//Explanation: Both S and T become "".
// 
//
// 
// Example 3: 
//
// 
//Input: S = "a##c", T = "#a#c"
//Output: true
//Explanation: Both S and T become "c".
// 
//
// 
// Example 4: 
//
// 
//Input: S = "a#c", T = "b"
//Output: false
//Explanation: S becomes "c" while T becomes "b".
// 
//
// Note: 
//
// 
// 1 <= S.length <= 200 
// 1 <= T.length <= 200 
// S and T only contain lowercase letters and '#' characters. 
// 
//
// Follow up: 
//
// 
// Can you solve it in O(N) time and O(1) space? 
// 
// 
// 
// 
// 
// Related Topics 栈 双指针 
// 👍 148 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-31 19:44:27
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        Solution solution = new BackspaceStringCompare().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String S, String T) {
        String sReal = getRealWord(S);
        String tReal = getRealWord(T);
        return sReal.equals(tReal);
    }

    private String getRealWord(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}