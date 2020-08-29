package leetcode.editor.cn;

//Given a string S, return the "reversed" string where all characters that are n
//ot a letter stay in the same place, and all letters reverse their positions. 
//
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
//
// 
// Example 1: 
//
// 
//Input: "ab-cd"
//Output: "dc-ba"
// 
//
// 
// Example 2: 
//
// 
//Input: "a-bC-dEf-ghIj"
//Output: "j-Ih-gfE-dCba"
// 
//
// 
// Example 3: 
//
// 
//Input: "Test1ng-Leet=code-Q!"
//Output: "Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 
// Note: 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S doesn't contain \ or " 
// 
// 
// 
// 
// Related Topics 字符串 
// 👍 60 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-28 17:26:51
 */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Solution solution = new ReverseOnlyLetters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder(S);
        int head = 0;
        int tail = sb.length() - 1;
        while (head < tail) {
            if (Character.isLetter(sb.charAt(head))) {
                if (Character.isLetter(sb.charAt(tail))) {
                    char tmp = sb.charAt(head);
                    sb.setCharAt(head, sb.charAt(tail));
                    sb.setCharAt(tail, tmp);
                    head++;
                    tail--;
                } else {
                    tail--;
                }
            } else {
                head++;
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}