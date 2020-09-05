package leetcode.editor.cn;

//Given two strings s and t , write a function to determine if t is an anagram o
//f s. 
//
// Example 1: 
//
// 
//Input: s = "anagram", t = "nagaram"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "rat", t = "car"
//Output: false
// 
//
// Note: 
//You may assume the string contains only lowercase alphabets. 
//
// Follow up: 
//What if the inputs contain unicode characters? How would you adapt your soluti
//on to such case? 
// Related Topics 排序 哈希表 
// 👍 245 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-02 15:38:15
 */
public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final int RANGE = 256;
        int[] dict = new int[RANGE];
        for (char ch : s.toCharArray()) {
            dict[ch]++;
        }
        for (char ch : t.toCharArray()) {
            if (dict[ch] == 0) {
                return false;
            }
            dict[ch]--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}