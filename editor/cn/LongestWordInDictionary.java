package leetcode.editor.cn;

//Given a list of strings words representing an English Dictionary, find the lon
//gest word in words that can be built one character at a time by other words in w
//ords. If there is more than one possible answer, return the longest word with th
//e smallest lexicographical order. If there is no answer, return the empty string
//.
//
// Example 1: 
// 
//Input: 
//words = ["w","wo","wor","worl", "world"]
//Output: "world"
//Explanation: 
//The word "world" can be built one character at a time by "w", "wo", "wor", and
// "worl".
// 
// 
//
// Example 2: 
// 
//Input: 
//words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
//Output: "apple"
//Explanation: 
//Both "apply" and "apple" can be built from other words in the dictionary. Howe
//ver, "apple" is lexicographically smaller than "apply".
// 
// 
//
// Note:
// All the strings in the input will only contain lowercase letters. 
// The length of words will be in the range [1, 1000]. 
// The length of words[i] will be in the range [1, 30]. 
// Related Topics 字典树 哈希表 
// 👍 97 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-09-04 17:14:18
 */
public class LongestWordInDictionary {
    public static void main(String[] args) {
        Solution solution = new LongestWordInDictionary().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestWord(String[] words) {
        final int RANGE = 35;
        List<Set<String>> listOfSet = new ArrayList<>(RANGE);
        for (int i = 0; i < RANGE; i++) {
            listOfSet.add(new HashSet<>());
        }
        for (String word : words) {
            listOfSet.get(word.length()).add(word);
        }
        List<String> res = new ArrayList<>();
        int longestLen = 0;
        for (int i = listOfSet.size() - 1; i >= longestLen; i--) {
            Set<String> set = listOfSet.get(i);
            if (!set.isEmpty()) {
                for (String word : set) {
                    if (word.length() >= longestLen && isValidWord(listOfSet, word)) {
                        res.add(word);
                        longestLen = Math.max(longestLen, word.length());
                    }
                }
            }
        }
        if (res.isEmpty()) {
            return "";
        }
        res = res.stream().sorted().collect(Collectors.toList());
        return res.get(0);
    }

    private boolean isValidWord(List<Set<String>> listOfSet, String word) {
        if (word.isEmpty()) {
            return true;
        }
        Set<String> set = listOfSet.get(word.length());
        if (!set.contains(word)) {
            return false;
        }
        return isValidWord(listOfSet, word.substring(0, word.length() - 1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}