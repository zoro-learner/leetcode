package leetcode.editor.cn;

//Given a pattern and a string str, find if str follows the same pattern. 
//
// Here follow means a full match, such that there is a bijection between a lett
//er in pattern and a non-empty word in str. 
//
// Example 1: 
//
// 
//Input: pattern = "abba", str = "dog cat cat dog"
//Output: true 
//
// Example 2: 
//
// 
//Input:pattern = "abba", str = "dog cat cat fish"
//Output: false 
//
// Example 3: 
//
// 
//Input: pattern = "aaaa", str = "dog cat cat dog"
//Output: false 
//
// Example 4: 
//
// 
//Input: pattern = "abba", str = "dog dog dog dog"
//Output: false 
//
// Notes: 
//You may assume pattern contains only lowercase letters, and str contains lower
//case letters that may be separated by a single space. 
// Related Topics 哈希表 
// 👍 186 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-09-02 15:44:22
 */
public class WordPattern {
    public static void main(String[] args) {
        Solution solution = new WordPattern().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch) && !map2.containsKey(words[i])) {
                map.put(ch, words[i]);
                map2.put(words[i], ch);
            }
            if (!words[i].equals(map.get(ch)) || ch != map2.get(words[i])) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}