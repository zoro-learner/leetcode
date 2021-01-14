package leetcode.editor.cn;

//Given string S and a dictionary of words words, find the number of words[i] th
//at is a subsequence of S. 
//
// 
//Example :
//Input: 
//S = "abcde"
//words = ["a", "bb", "acd", "ace"]
//Output: 3
//Explanation: There are three words in words that are a subsequence of S: "a", 
//"acd", "ace".
// 
//
// Note: 
//
// 
// All words in words and S will only consists of lowercase letters. 
// The length of S will be in the range of [1, 50000]. 
// The length of words will be in the range of [1, 5000]. 
// The length of words[i] will be in the range of [1, 50]. 
// 
// Related Topics 数组 
// 👍 115 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-10-31 08:36:25
 */
public class NumberOfMatchingSubsequences {
    public static void main(String[] args) {
        Solution solution = new NumberOfMatchingSubsequences().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numMatchingSubseq(String S, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int count = 0;
        for (String word : map.keySet()) {
            if (isSubsequence(word, S)) {
                count += map.get(word);
            }
        }
        return count;
    }

    private boolean isSubsequence(String word, String s) {
        if (word.length() > s.length()) {
            return false;
        }
        int pa = 0;
        int pb = 0;
        while (pa < word.length() && pb < s.length()) {
            if (word.length() - pa > s.length() - pb) {
                return false;
            }
            if (word.charAt(pa) == s.charAt(pb)) {
                pa++;
            }
            pb++;
        }
        return pa == word.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}