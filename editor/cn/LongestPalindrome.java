package leetcode.editor.cn;

//Given a string s which consists of lowercase or uppercase letters, return the 
//length of the longest palindrome that can be built with those letters. 
//
// Letters are case sensitive, for example, "Aa" is not considered a palindrome 
//here. 
//
// 
// Example 1: 
//
// 
//Input: s = "abccccdd"
//Output: 7
//Explanation:
//One longest palindrome that can be built is "dccaccd", whose length is 7.
// 
//
// Example 2: 
//
// 
//Input: s = "a"
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: s = "bb"
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2000 
// s consits of lower-case and/or upper-case English letters only. 
// 
// Related Topics 哈希表 
// 👍 224 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-09-02 18:28:28
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        Solution solution = new LongestPalindrome().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int res = 0;
        boolean hasOdd = false;
        for (Character ch : map.keySet()) {
            int cnt = map.get(ch);
            if (cnt % 2 == 0) {
                res += cnt;
            } else {
                hasOdd = true;
                res += cnt - 1;
            }
        }
        if (hasOdd) {
            res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}