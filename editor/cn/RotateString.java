package leetcode.editor.cn;

//We are given two strings, A and B. 
//
// A shift on A consists of taking string A and moving the leftmost character to
// the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' af
//ter one shift on A. Return True if and only if A can become B after some number 
//of shifts on A. 
//
// 
//Example 1:
//Input: A = 'abcde', B = 'cdeab'
//Output: true
//
//Example 2:
//Input: A = 'abcde', B = 'abced'
//Output: false
// 
//
// Note: 
//
// 
// A and B will have length at most 100. 
// 
// 👍 101 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-04 16:19:35
 */
public class RotateString {
    public static void main(String[] args) {
        Solution solution = new RotateString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean rotateString(String A, String B) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("Null");
        }
        if (A.isEmpty() || B.isEmpty()) {
            return A.equals(B);
        }
        if (A.length() != B.length()) {
            return false;
        }
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == B.charAt(0)) {
                String newA = A.substring(i) + A.substring(0, i);
                if (newA.equals(B)) {
                    return true;
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}