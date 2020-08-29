package leetcode.editor.cn;

//Given a string text, you want to use the characters of text to form as many in
//stances of the word "balloon" as possible. 
//
// You can use each character in text at most once. Return the maximum number of
// instances that can be formed. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: text = "nlaebolko"
//Output: 1
// 
//
// Example 2: 
//
// 
//
// 
//Input: text = "loonbalxballpoon"
//Output: 2
// 
//
// Example 3: 
//
// 
//Input: text = "leetcode"
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= text.length <= 10^4 
// text consists of lower case English letters only. 
// Related Topics 哈希表 字符串 
// 👍 41 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 14:42:53
 */
public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfBalloons().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = getCharCount(text);
        int[] base = getCharCount("balloon");
        int res = text.length();
        for (int i = 0; i < base.length; i++) {
            if (base[i] > 0) {
                res = Math.min(res, counts[i] / base[i]);
            }
        }
        return res;
    }

    private int[] getCharCount(String s) {
        final int RANGE = 26;
        int[] res = new int[RANGE];
        for (char ch : s.toCharArray()) {
            res[ch - 'a']++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}