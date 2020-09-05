package leetcode.editor.cn;

//Given words first and second, consider occurrences in some text of the form "f
//irst second third", where second comes immediately after first, and third comes 
//immediately after second. 
//
// For each such occurrence, add "third" to the answer, and return the answer. 
//
// 
//
// Example 1: 
//
// 
//Input: text = "alice is a good girl she is a good student", first = "a", secon
//d = "good"
//Output: ["girl","student"]
// 
//
// 
// Example 2: 
//
// 
//Input: text = "we will we will rock you", first = "we", second = "will"
//Output: ["we","rock"]
// 
//
// 
//
// Note: 
//
// 
// 1 <= text.length <= 1000 
// text consists of space separated words, where each word consists of lowercase
// English letters. 
// 1 <= first.length, second.length <= 10 
// first and second consist of lowercase English letters. 
// 
// 
// Related Topics 哈希表 
// 👍 15 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-09-04 20:10:33
 */
public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        Solution solution = new OccurrencesAfterBigram().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < words.length - 2; i++) {
            int hash = getHash(words[i], words[i + 1]);
            if (!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(words[i + 2]);
        }
        int hash = getHash(first, second);
        return map.getOrDefault(hash, new ArrayList<>()).toArray(new String[0]);
    }

    private int getHash(String first, String second) {
        String s = first + " " + second;
        return s.hashCode();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}