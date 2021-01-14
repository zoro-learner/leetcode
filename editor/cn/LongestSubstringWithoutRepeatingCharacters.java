package leetcode.editor.cn;

//Given a string s, find the length of the longest substring without repeating c
//haracters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// Example 4: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 104 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4406 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-10-07 17:20:40
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        final int RANGE = 128;
        int[] dict = new int[RANGE];
        int res = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (dict[s.charAt(right)] != 0) {
                dict[s.charAt(left)] = 0;
                left++;
            } else {
                dict[s.charAt(right)] = 1;
                right++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

    
}