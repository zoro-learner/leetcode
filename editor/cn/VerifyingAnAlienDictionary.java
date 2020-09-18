package leetcode.editor.cn;

//In an alien language, surprisingly they also use english lowercase letters, bu
//t possibly in a different order. The order of the alphabet is some permutation o
//f lowercase letters. 
//
// Given a sequence of words written in the alien language, and the order of the
// alphabet, return true if and only if the given words are sorted lexicographical
//y in this alien language. 
// 
// Example 1: 
//
// 
//Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//Output: true
//Explanation: As 'h' comes before 'l' in this language, then the sequence is so
//rted.
// 
//
// Example 2: 
//
// 
//Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//Output: false
//Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1]
//, hence the sequence is unsorted.
// 
//
// Example 3: 
//
// 
//Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//Output: false
//Explanation: The first three characters "app" match, and the second string is 
//shorter (in size.) According to lexicographical rules "apple" > "app", because '
//l' > '∅', where '∅' is defined as the blank character which is less than any oth
//er character (More info).
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 20 
// order.length == 26 
// All characters in words[i] and order are English lowercase letters. 
// 
// Related Topics 哈希表 
// 👍 48 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-05 14:56:27
 */
public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        Solution solution = new VerifyingAnAlienDictionary().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public boolean isAlienSorted(String[] words, String order) {
        int[] dict = new int[26];
        for (int i = 0; i < order.length(); i++) {
            dict[order.charAt(i) - 'a'] = i + 1;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (compare(words[i], words[i + 1], dict) > 0) {
                return false;
            }
        }
        return true;
    }

    private int compare(String s, String t, int[] order) {
        int k = 0;
        while (k < s.length() || k < t.length()) {
            int sOrder = k < s.length() ? order[s.charAt(k) - 'a'] : 0;
            int tOrder = k < t.length() ? order[t.charAt(k) - 'a'] : 0;
            if (sOrder != tOrder) {
                return sOrder - tOrder;
            }
            k++;
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}