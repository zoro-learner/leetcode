package leetcode.editor.cn;

//A sentence S is given, composed of words separated by spaces. Each word consis
//ts of lowercase and uppercase letters only. 
//
// We would like to convert the sentence to "Goat Latin" (a made-up language sim
//ilar to Pig Latin.) 
//
// The rules of Goat Latin are as follows: 
//
// 
// If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of t
//he word. 
// For example, the word 'apple' becomes 'applema'. 
// 
// If a word begins with a consonant (i.e. not a vowel), remove the first letter
// and append it to the end, then add "ma". 
// For example, the word "goat" becomes "oatgma". 
// 
// Add one letter 'a' to the end of each word per its word index in the sentence
//, starting with 1. 
// For example, the first word gets "a" added to the end, the second word gets "
//aa" added to the end and so on. 
// 
//
// Return the final sentence representing the conversion from S to Goat Latin. 
//
// 
//
// Example 1: 
//
// 
//Input: "I speak Goat Latin"
//Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
// 
//
// Example 2: 
//
// 
//Input: "The quick brown fox jumped over the lazy dog"
//Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetm
//aaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
// 
//
// 
//
// Notes: 
//
// 
// S contains only uppercase, lowercase and spaces. Exactly one space between ea
//ch word. 
// 1 <= S.length <= 150. 
// 
// Related Topics 字符串 
// 👍 45 👎 0


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-28 17:23:58
 */
public class GoatLatin {
    public static void main(String[] args) {
        Solution solution = new GoatLatin().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String toGoatLatin(String S) {
        List<String> outWords = new ArrayList<>();
        String[] strs = S.split(" ");
        for (int i = 0; i < strs.length; i++) {
            outWords.add(wordToGoatLatin(strs[i]) + nCopies("a", i + 1));
        }
        return String.join(" ", outWords);
    }

    private String nCopies(String s, int n) {
        StringBuilder sb = new StringBuilder(n * s.length());
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    private String wordToGoatLatin(String word) {
        assert !word.isEmpty();
        String res;
        if (isVowel(word.charAt(0))) {
            res = word + "ma";
        } else {
            res = word.substring(1) + word.charAt(0) + "ma";
        }
        return res;
    }

    private boolean isVowel(char ch) {
        boolean res = false;
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                res = true;
                break;
            default:
                break;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}