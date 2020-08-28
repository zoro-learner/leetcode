package leetcode.editor.cn;

//International Morse Code defines a standard encoding where each letter is mapp
//ed to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-.
//..", "c" maps to "-.-.", and so on. 
//
// For convenience, the full table for the 26 letters of the English alphabet is
// given below: 
//
// 
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--
//","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.
//."] 
//
// Now, given a list of words, each word can be written as a concatenation of th
//e Morse code of each letter. For example, "cab" can be written as "-.-..--...", 
//(which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatena
//tion, the transformation of a word. 
//
// Return the number of different transformations among all words we have. 
//
// 
//Example:
//Input: words = ["gin", "zen", "gig", "msg"]
//Output: 2
//Explanation: 
//The transformation of each word is:
//"gin" -> "--...-."
//"zen" -> "--...-."
//"gig" -> "--...--."
//"msg" -> "--...--."
//
//There are 2 different transformations, "--...-." and "--...--.".
// 
//
// Note: 
//
// 
// The length of words will be at most 100. 
// Each words[i] will have length in range [1, 12]. 
// words[i] will only consist of lowercase letters. 
// 
// Related Topics 字符串 
// 👍 130 👎 0



import java.util.HashSet;
import java.util.Set;


/**
 * @author zoro-learner
 * @create 2020-08-28 14:53:13
 */
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        Solution solution = new UniqueMorseCodeWords().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            set.add(encode(word));
        }
        return set.size();
    }

    private String encode(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            sb.append(letterCodes[ch - 'a']);
        }
        return sb.toString();
    }

    final private String[] letterCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
}
//leetcode submit region end(Prohibit modification and deletion)

    
}