package leetcode.editor.cn;

//Given a string, you need to reverse the order of characters in each word withi
//n a sentence while still preserving whitespace and initial word order. 
//
// Example 1: 
// 
//Input: "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
// 
// 
//
// Note:
//In the string, each word is separated by single space and there will not be an
//y extra space in the string.
// Related Topics 字符串 
// 👍 217 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-27 14:09:34
 */
public class ReverseWordsInAStringIii {
    public static void main(String[] args) {
        Solution solution = new ReverseWordsInAStringIii().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        int fromIdx = 0;
        int toIdx = s.indexOf(' ');
        StringBuilder sb = new StringBuilder(s.length());
        while (true) {
//            System.out.println(toIdx);
//            System.out.println(sb.toString());
            if (toIdx == -1) {
                for (int i = s.length() - 1; i >= fromIdx; i--) {
                    sb.append(s.charAt(i));
                }
                break;
            }
            for (int i = toIdx - 1; i >= fromIdx; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(' ');
            fromIdx = toIdx + 1;
            toIdx = s.indexOf(' ', fromIdx);
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}