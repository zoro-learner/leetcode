package leetcode.editor.cn;

//Given a positive integer N, find and return the longest distance between two c
//onsecutive 1's in the binary representation of N. 
//
// If there aren't two consecutive 1's, return 0. 
//
// 
//
// 
// 
// 
// 
// 
// 
// 
// 
//
// 
// Example 1: 
//
// 
//Input: 22
//Output: 2
//Explanation: 
//22 in binary is 0b10110.
//In the binary representation of 22, there are three ones, and two consecutive 
//pairs of 1's.
//The first consecutive pair of 1's have distance 2.
//The second consecutive pair of 1's have distance 1.
//The answer is the largest of these two distances, which is 2.
// 
//
// 
// Example 2: 
//
// 
//Input: 5
//Output: 2
//Explanation: 
//5 in binary is 0b101.
// 
//
// 
// Example 3: 
//
// 
//Input: 6
//Output: 1
//Explanation: 
//6 in binary is 0b110.
// 
//
// 
// Example 4: 
//
// 
//Input: 8
//Output: 0
//Explanation: 
//8 in binary is 0b1000.
//There aren't any consecutive pairs of 1's in the binary representation of 8, s
//o we return 0.
// 
//
// 
//
// 
// 
// 
// Note: 
//
// 
// 1 <= N <= 10^9 
// 
// 
// 
// 
// 
// 
// 
// 
// Related Topics 数学 
// 👍 52 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 11:43:01
 */
public class BinaryGap {
    public static void main(String[] args) {
        Solution solution = new BinaryGap().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int binaryGap(int N) {
        String two = Integer.toString(N, 2);
        int last = -1;
        int res = 0;
        for (int i = 0; i < two.length(); i++) {
            char ch = two.charAt(i);
            if (ch == '1') {
                if (last >= 0) {
                    res = Math.max(res, i - last);
                }
                last = i;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}