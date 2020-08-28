package leetcode.editor.cn;

//Given two strings A and B, find the minimum number of times A has to be repeat
//ed such that B is a substring of it. If no such solution, return -1. 
//
// For example, with A = "abcd" and B = "cdabcdab". 
//
// Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substri
//ng of it; and B is not a substring of A repeated two times ("abcdabcd"). 
//
// Note: 
//The length of A and B will be between 1 and 10000. 
// Related Topics 字符串 
// 👍 104 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-28 09:34:12
 */
public class RepeatedStringMatch {
    public static void main(String[] args) {
        Solution solution = new RepeatedStringMatch().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int k = B.length() / A.length();
        StringBuilder sb = new StringBuilder(A.length() * (k + 2));
        for (int i = 0; i < k; i++) {
            sb.append(A);
        }
        for (int i = 0; i < 3; i++) {
            int idx = sb.indexOf(B);
            if (idx != -1) {
                return k;
            }
            sb.append(A);
            k++;
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}