package leetcode.editor.cn;

//Given an arbitrary ransom note string and another string containing letters fr
//om all the magazines, write a function that will return true if the ransom note 
//can be constructed from the magazines ; otherwise, it will return false. 
//
// Each letter in the magazine string can only be used once in your ransom note.
// 
//
// 
// Example 1: 
// Input: ransomNote = "a", magazine = "b"
//Output: false
// Example 2: 
// Input: ransomNote = "aa", magazine = "ab"
//Output: false
// Example 3: 
// Input: ransomNote = "aa", magazine = "aab"
//Output: true
// 
// 
// Constraints: 
//
// 
// You may assume that both strings contain only lowercase letters. 
// 
// Related Topics 字符串 
// 👍 110 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 17:28:36
 */
public class RansomNote {
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] target = getLowerLetterCount(ransomNote);
        int[] source = getLowerLetterCount(magazine);
        for (int i = 0; i < target.length; i++) {
            if (target[i] > source[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] getLowerLetterCount(String s) {
        final int RANGE = 26;
        int[] dict = new int[RANGE];
        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
//            if (idx < 0 || idx > RANGE - 1) {
//                throw new IllegalArgumentException("Not lower letter");
//            }
            dict[idx]++;
        }
        return dict;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}