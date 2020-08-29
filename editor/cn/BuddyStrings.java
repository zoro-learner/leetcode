package leetcode.editor.cn;

//Given two strings A and B of lowercase letters, return true if and only if we 
//can swap two letters in A so that the result equals B. 
//
// 
//
// Example 1: 
//
// 
// 
//Input: A = "ab", B = "ba"
//Output: true
// 
//
// 
// Example 2: 
//
// 
//Input: A = "ab", B = "ab"
//Output: false
// 
//
// 
// Example 3: 
//
// 
//Input: A = "aa", B = "aa"
//Output: true
// 
//
// 
// Example 4: 
//
// 
//Input: A = "aaaaaaabc", B = "aaaaaaacb"
//Output: true
// 
//
// 
// Example 5: 
//
// 
//Input: A = "", B = "aa"
//Output: false
// 
// 
// 
// 
// 
// 
//
// 
// Constraints: 
//
// 
// 0 <= A.length <= 20000 
// 0 <= B.length <= 20000 
// A and B consist only of lowercase letters. 
// 
// Related Topics 字符串 
// 👍 106 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-28 17:25:49
 */
public class BuddyStrings {
    public static void main(String[] args) {
        Solution solution = new BuddyStrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        final int RANGE = 26;
        int[] dict = new int[RANGE];
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                cnt++;
                dict[A.charAt(i) - 'a']++;
                dict[B.charAt(i) - 'a']--;
            }
            if (cnt > 2) {
                return false;
            }
        }
        if (cnt == 0) {
            return hasSameChar(A);
        }
        for (int i = 0; i < RANGE; i++) {
            if (dict[i] != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean hasSameChar(String s) {
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) {
            if (chars[ch - 'a'] > 0) {
                return true;
            }
            chars[ch - 'a'] = 1;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}