package leetcode.editor.cn;

//
//Find the minimum length word from a given dictionary words, which has all the 
//letters from the string licensePlate. Such a word is said to complete the given 
//string licensePlate
// 
//Here, for letters we ignore case. For example, "P" on the licensePlate still m
//atches "p" on the word.
// 
//It is guaranteed an answer exists. If there are multiple answers, return the o
//ne that occurs first in the array.
// 
//The license plate might have the same letter occurring multiple times. For exa
//mple, given a licensePlate of "PP", the word "pair" does not complete the licens
//ePlate, but the word "supper" does.
// 
//
// Example 1: 
// 
//Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"
//]
//Output: "steps"
//Explanation: The smallest length word that contains the letters "S", "P", "S",
// and "T".
//Note that the answer is not "step", because the letter "s" must occur in the w
//ord twice.
//Also note that we ignored case for the purposes of comparing whether a letter 
//exists in the word.
// 
// 
//
// Example 2: 
// 
//Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
//Output: "pest"
//Explanation: There are 3 smallest length words that contains the letters "s".
//We return the one that occurred first.
// 
// 
//
// Note: 
// 
// licensePlate will be a string with length in range [1, 7]. 
// licensePlate will contain digits, spaces, or letters (uppercase or lowercase)
//. 
// words will have a length in the range [10, 1000]. 
// Every words[i] will consist of lowercase letters, and have length in range [1
//, 15]. 
// 
// Related Topics 哈希表 
// 👍 29 👎 0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-09-04 19:34:22
 */
public class ShortestCompletingWord {
    public static void main(String[] args) {
        Solution solution = new ShortestCompletingWord().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Integer, List<String>> wordsMap = new HashMap<>();
        for (String word : words) {
            int len = word.length();
            if (!wordsMap.containsKey(len)) {
                wordsMap.put(len, new ArrayList<>());
            }
            wordsMap.get(len).add(word);
        }

        int[] dict = new int[26];
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                dict[Character.toLowerCase(ch) - 'a']++;
            }
        }

        List<Integer> lens = wordsMap.keySet().stream().sorted().collect(Collectors.toList());

        for (int len : lens) {
            for (String word : wordsMap.get(len)) {
                if (isValid(word, dict)) {
                    return word;
                }
            }
        }
        return "";
    }

    private boolean isValid(String word, int[] dict) {
        int[] wordsCount = new int[26];
        for (char ch : word.toCharArray()) {
            wordsCount[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (wordsCount[i] < dict[i]) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}