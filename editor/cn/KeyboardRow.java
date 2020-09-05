package leetcode.editor.cn;

//Given a List of words, return the words that can be typed using letters of alp
//habet on only one row's of American keyboard like the image below. 
//
// 
//
// 
// 
//
// Example: 
//
// 
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]
// 
//
// 
//
// Note: 
//
// 
// You may use one character in the keyboard more than once. 
// You may assume the input string will only contain letters of alphabet. 
// 
// Related Topics 哈希表 
// 👍 105 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-04 08:26:19
 */
public class KeyboardRow {
    public static void main(String[] args) {
        Solution solution = new KeyboardRow().new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = solution.findWords(words);
        System.out.println(Arrays.toString(result));
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findWords(String[] words) {
        int[] dict = getDict();
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isAllLetterOnOneRow(word, dict)) {
                res.add(word);
            }
        }
        return res.toArray(new String[0]);
    }

    private boolean isAllLetterOnOneRow(String word, int[] dict) {
        if (word.isEmpty()) {
            return true;
        }
        String lowerWord = word.toLowerCase();
        int row = dict[lowerWord.charAt(0) - 'a'];
        for (char ch : lowerWord.toCharArray()) {
            if (row != dict[ch - 'a']) {
                return false;
            }
        }
        return true;
    }

    private int[] getDict() {
        String[] keyboards = {"qwertyuiop", "asdfghjkkl", "zxcvbnm"};
        int[] res = new int[26];
        for (int i = 0; i < keyboards.length; i++) {
            for (char ch : keyboards[i].toCharArray()) {
                res[ch - 'a'] = i;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}