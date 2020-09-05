package leetcode.editor.cn;

//We are given two sentences A and B. (A sentence is a string of space separated
// words. Each word consists only of lowercase letters.) 
//
// A word is uncommon if it appears exactly once in one of the sentences, and do
//es not appear in the other sentence. 
//
// Return a list of all uncommon words. 
//
// You may return the list in any order. 
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
//Input: A = "this apple is sweet", B = "this apple is sour"
//Output: ["sweet","sour"]
// 
//
// 
// Example 2: 
//
// 
//Input: A = "apple apple", B = "banana"
//Output: ["banana"]
// 
//
// 
//
// Note: 
//
// 
// 0 <= A.length <= 200 
// 0 <= B.length <= 200 
// A and B both contain only spaces and lowercase letters. 
// 
// 
// 
// Related Topics 哈希表 
// 👍 66 👎 0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-09-05 14:56:29
 */
public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        Solution solution = new UncommonWordsFromTwoSentences().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        String[] aWords = A.split(" ");
        String[] bWords = B.split(" ");
        for (String word : aWords) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : bWords) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map.keySet().parallelStream().filter(t -> map.get(t) == 1).toArray(String[]::new);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}