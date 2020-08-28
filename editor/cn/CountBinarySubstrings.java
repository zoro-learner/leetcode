package leetcode.editor.cn;

//Give a string s, count the number of non-empty (contiguous) substrings that ha
//ve the same number of 0's and 1's, and all the 0's and all the 1's in these subs
//trings are grouped consecutively. 
// 
// Substrings that occur multiple times are counted the number of times they occ
//ur. 
//
// Example 1: 
// 
//Input: "00110011"
//Output: 6
//Explanation: There are 6 substrings that have equal number of consecutive 1's 
//and 0's: "0011", "01", "1100", "10", "0011", and "01".
// Notice that some of these substrings repeat and are counted the number of tim
//es they occur.
// Also, "00110011" is not a valid substring because all the 0's (and 1's) are n
//ot grouped together.
// 
// 
//
// Example 2: 
// 
//Input: "10101"
//Output: 4
//Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal nu
//mber of consecutive 1's and 0's.
// 
// 
//
// Note:
// s.length will be between 1 and 50,000. 
// s will only consist of "0" or "1" characters. 
// Related Topics 字符串 
// 👍 276 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-28 10:54:20
 */
public class CountBinarySubstrings {
    public static void main(String[] args) {
        Solution solution = new CountBinarySubstrings().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countBinarySubstrings(String s) {
        if (s.length() == 1) {
            return 0;
        }
        return helper(s, s.length() - 1);
    }

    private int helper(String s, int tail) {
        if (tail == 0) {
            return 0;
        }
        int last = helper(s, tail - 1);
        int head = tail;
        while (head >= 0 && s.charAt(head) == s.charAt(tail)) {
            head--;
        }
        int one = tail - head + 1;
        tail = head;
        while (head >= 0 && s.charAt(head) == s.charAt(tail)) {
            head--;
        }
        int other = tail - head + 1;
        int cur = one == other ? 1 : 0;
        return cur + last;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}