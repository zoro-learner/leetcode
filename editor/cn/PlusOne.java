package leetcode.editor.cn;

//Given a non-empty array of digits representing a non-negative integer, increme
//nt one to the integer. 
//
// The digits are stored such that the most significant digit is at the head of 
//the list, and each element in the array contains a single digit. 
//
// You may assume the integer does not contain any leading zero, except the numb
//er 0 itself. 
//
// Example 1: 
//
// 
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
// 
//
// Example 2: 
//
// 
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
// 
// Related Topics 数组 
// 👍 521 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-06 19:20:38
 */
public class PlusOne {
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = digits[i] + 1 + carry;
            digits[i] = num / 10;
            carry = num % 10;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}