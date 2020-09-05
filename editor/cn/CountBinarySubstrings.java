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
        int zero = 0;
        int one = 0;
        int res = 0;
        char last = s.charAt(0);
        for (char ch : s.toCharArray()) {
            if (ch == last) {
                if (ch == '0') {
                    if (one == 0) {
                        zero++;
                    } else if (zero < one) {
                        zero++;
                        res++;
                    } else {
                        zero++;
                        one = 0;
                    }
                } else {
                    if (zero == 0) {
                        one++;
                    } else if (one < zero) {
                        one++;
                        res++;
                    } else {
                        one++;
                        zero = 0;
                    }
                }
            } else {
                if (ch == '0') {
                    zero = 1;
                } else {
                    one = 1;
                }
                res++;
            }
            last = ch;
//            System.out.println(zero + ", " + one + ", " + res);
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}