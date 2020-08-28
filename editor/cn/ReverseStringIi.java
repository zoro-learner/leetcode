package leetcode.editor.cn;

//
//Given a string and an integer k, you need to reverse the first k characters fo
//r every 2k characters counting from the start of the string. If there are less t
//han k characters left, reverse all of them. If there are less than 2k but greate
//r than or equal to k characters, then reverse the first k characters and left th
//e other as original.
// 
//
// Example: 
// 
//Input: s = "abcdefg", k = 2
//Output: "bacdfeg"
// 
// 
//
//Restrictions: 
// 
// The string consists of lower English letters only. 
// Length of the given string and k will in the range [1, 10000] 
// Related Topics 字符串 
// 👍 88 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-27 10:37:52
 */
public class ReverseStringIi {
    public static void main(String[] args) {
        Solution solution = new ReverseStringIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s.length());
        int step = 1;
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % k == 0) {
                step = -step;
                idx = Math.min(k + i, s.length());
            }
            if (step < 0) {
                idx--;
            } else {
                idx = i;
            }
            sb.append(s.charAt(idx));
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}