package leetcode.editor.cn;

//Given a string, find the first non-repeating character in it and return its in
//dex. If it doesn't exist, return -1. 
//
// Examples: 
//
// 
//s = "leetcode"
//return 0.
//
//s = "loveleetcode"
//return 2.
// 
//
// 
//
// Note: You may assume the string contains only lowercase English letters. 
// Related Topics 哈希表 字符串 
// 👍 256 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 17:29:54
 */
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution solution = new FirstUniqueCharacterInAString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        int[] count = getLowerLetterCount(s);
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    private int[] getLowerLetterCount(String s) {
        final int RANGE = 26;
        int[] dict = new int[RANGE];
        for (char ch : s.toCharArray()) {
            dict[ch - 'a']++;
        }
        return dict;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}