package leetcode.editor.cn;

//Given a word, you need to judge whether the usage of capitals in it is right o
//r not. 
//
// We define the usage of capitals in a word to be right when one of the followi
//ng cases holds: 
//
// 
// All letters in this word are capitals, like "USA". 
// All letters in this word are not capitals, like "leetcode". 
// Only the first letter in this word is capital, like "Google". 
// 
//Otherwise, we define that this word doesn't use capitals in a right way.
//
// 
//
// Example 1: 
//
// 
//Input: "USA"
//Output: True
// 
//
// 
//
// Example 2: 
//
// 
//Input: "FlaG"
//Output: False
// 
//
// 
//
// Note: The input will be a non-empty word consisting of uppercase and lowercas
//e latin letters. 
// Related Topics 字符串 
// 👍 107 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 20:01:08
 */
public class DetectCapital {
    public static void main(String[] args) {
        Solution solution = new DetectCapital().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0))) {
            boolean hasUpper = false;
            boolean hasLower = false;
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    hasUpper = true;
                } else {
                    hasLower = true;
                }
                if (hasLower && hasUpper) {
                    return false;
                }
            }

        } else {
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}