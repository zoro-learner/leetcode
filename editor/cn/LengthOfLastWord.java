package leetcode.editor.cn;

//Given a string s consists of upper/lower-case alphabets and empty space charac
//ters ' ', return the length of last word (last word means the last appearing wor
//d if we loop from left to right) in the string. 
//
// If the last word does not exist, return 0. 
//
// Note: A word is defined as a maximal substring consisting of non-space charac
//ters only. 
//
// Example: 
//
// 
//Input: "Hello World"
//Output: 5
// 
//
// 
// Related Topics 字符串 
// 👍 238 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 14:27:35
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int endIdx = s.length() - 1;
        while (endIdx >= 0 && !Character.isAlphabetic(s.charAt(endIdx))) {
            endIdx--;
        }
        int startIdx = endIdx;
        while (startIdx >= 0 && Character.isAlphabetic(s.charAt(startIdx))) {
            startIdx--;
        }
        return endIdx - startIdx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}