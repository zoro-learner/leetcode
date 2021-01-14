package leetcode.editor.cn;

//You are given a string text of words that are placed among some number of spac
//es. Each word consists of one or more lowercase English letters and are separate
//d by at least one space. It's guaranteed that text contains at least one word. 
//
// Rearrange the spaces so that there is an equal number of spaces between every
// pair of adjacent words and that number is maximized. If you cannot redistribute
// all the spaces equally, place the extra spaces at the end, meaning the returned
// string should be the same length as text. 
//
// Return the string after rearranging the spaces. 
//
// 
// Example 1: 
//
// 
//Input: text = "  this   is  a sentence "
//Output: "this   is   a   sentence"
//Explanation: There are a total of 9 spaces and 4 words. We can evenly divide t
//he 9 spaces between the words: 9 / (4-1) = 3 spaces.
// 
//
// Example 2: 
//
// 
//Input: text = " practice   makes   perfect"
//Output: "practice   makes   perfect "
//Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces p
//lus 1 extra space. We place this extra space at the end of the string.
// 
//
// Example 3: 
//
// 
//Input: text = "hello   world"
//Output: "hello   world"
// 
//
// Example 4: 
//
// 
//Input: text = "  walks  udp package   into  bar a"
//Output: "walks  udp  package  into  bar  a "
// 
//
// Example 5: 
//
// 
//Input: text = "a"
//Output: "a"
// 
//
// 
// Constraints: 
//
// 
// 1 <= text.length <= 100 
// text consists of lowercase English letters and ' '. 
// text contains at least one word. 
// 
// Related Topics 字符串 
// 👍 0 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-22 19:08:48
 */
public class RearrangeSpacesBetweenWords {
    public static void main(String[] args) {
        Solution solution = new RearrangeSpacesBetweenWords().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
//        System.out.println(Arrays.toString(words));
        int total = numOfSpace(text);

        StringBuilder spaces = new StringBuilder();
        int per = total;
        if (words.length > 1) {
            per = total / (words.length - 1);
        }
        for (int i = 0; i < per; i++) {
            spaces.append(" ");
        }

        StringBuilder res = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            res.append(spaces).append(words[i]);
        }
        int remains = total - per * (words.length - 1);
        for (int i = 0; i < remains; i++) {
            res.append(" ");
        }
        return res.toString();
    }

    private int numOfSpace(String text) {
        int cnt = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') {
                cnt++;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}