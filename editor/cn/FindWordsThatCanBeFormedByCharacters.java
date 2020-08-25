package leetcode.editor.cn;

//You are given an array of strings words and a string chars. 
//
// A string is good if it can be formed by characters from chars (each character
// can only be used once). 
//
// Return the sum of lengths of all good strings in words. 
//
// 
//
// Example 1: 
//
// 
//Input: words = ["cat","bt","hat","tree"], chars = "atach"
//Output: 6
//Explanation: 
//The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
//
// 
//
// Example 2: 
//
// 
//Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//Output: 10
//Explanation: 
//The strings that can be formed are "hello" and "world" so the answer is 5 + 5 
//= 10.
// 
//
// 
//
// Note: 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// All strings contain lowercase English letters only. 
// Related Topics 数组 哈希表 
// 👍 105 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-19 14:06:25
 */
public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        Solution solution = new FindWordsThatCanBeFormedByCharacters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] source = getCharCount(chars);
        int res = 0;
        for (String word : words) {
            int[] target = getCharCount(word);
            if (canBeFormed(target, source)) {
                res += word.length();
            }
        }
        return res;
    }

    private int[] getCharCount(String chars) {
        final int LETTER_NUM = 26;
        int[] charCount = new int[LETTER_NUM];
        for (char ch : chars.toCharArray()) {
            charCount[ch - 'a']++;
        }
        return charCount;
    }

    private boolean canBeFormed(int[] target, int[] source) {
        for (int i = 0; i < target.length; i++) {
            if (target[i] > source[i]) {
                return false;
            }
        }
        return true;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

    
}