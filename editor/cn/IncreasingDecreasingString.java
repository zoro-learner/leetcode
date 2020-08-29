package leetcode.editor.cn;

//Given a string s. You should re-order the string using the following algorithm
//: 
//
// 
// Pick the smallest character from s and append it to the result. 
// Pick the smallest character from s which is greater than the last appended ch
//aracter to the result and append it. 
// Repeat step 2 until you cannot pick more characters. 
// Pick the largest character from s and append it to the result. 
// Pick the largest character from s which is smaller than the last appended cha
//racter to the result and append it. 
// Repeat step 5 until you cannot pick more characters. 
// Repeat the steps from 1 to 6 until you pick all characters from s. 
// 
//
// In each step, If the smallest or the largest character appears more than once
// you can choose any occurrence and append it to the result. 
//
// Return the result string after sorting s with this algorithm. 
//
// 
// Example 1: 
//
// 
//Input: s = "aaaabbbbcccc"
//Output: "abccbaabccba"
//Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
//After steps 4, 5 and 6 of the first iteration, result = "abccba"
//First iteration is done. Now s = "aabbcc" and we go back to step 1
//After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
//After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
// 
//
// Example 2: 
//
// 
//Input: s = "rat"
//Output: "art"
//Explanation: The word "rat" becomes "art" after re-ordering it with the mentio
//ned algorithm.
// 
//
// Example 3: 
//
// 
//Input: s = "leetcode"
//Output: "cdelotee"
// 
//
// Example 4: 
//
// 
//Input: s = "ggggggg"
//Output: "ggggggg"
// 
//
// Example 5: 
//
// 
//Input: s = "spo"
//Output: "ops"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 500 
// s contains only lower-case English letters. 
// 
// Related Topics 排序 字符串 
// 👍 19 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-29 15:37:31
 */
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        Solution solution = new IncreasingDecreasingString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String sortString(String s) {
        final char CHAR_MIN = 'a' - 1;
        final char CHAR_MAX = 'z' + 1;
        boolean isIncr = true;
        char[] chars = s.toCharArray();
        char smallest = CHAR_MAX;
        char last = CHAR_MIN;
        int foundIdx = 0;
        char largest = CHAR_MIN;
        for (int i = 0; i < chars.length; i++) {
            foundIdx = -1;
            if (isIncr) {
                smallest = CHAR_MAX;
                for (int j = i; j < chars.length; j++) {
                    if (chars[j] > last && chars[j] < smallest) {
                        smallest = chars[j];
                        foundIdx = j;
                    }
                }
                if (foundIdx == -1) {
                    isIncr = !isIncr;
                    last = CHAR_MAX;
                    i--;
                } else {
                    last = smallest;
                    swap(chars, i, foundIdx);
                }
            } else {
                largest = CHAR_MIN;
                for (int j = i; j < chars.length; j++) {
                    if (chars[j] < last && chars[j] > largest) {
                        largest = chars[j];
                        foundIdx = j;
                    }
                }
                if (foundIdx == -1) {
                    isIncr = !isIncr;
                    last = CHAR_MIN;
                    i--;
                } else {
                    last = largest;
                    swap(chars, i, foundIdx);
                }
            }
//            System.out.println(foundIdx);
//            System.out.println(Arrays.toString(chars));
        }
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}