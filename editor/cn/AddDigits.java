package leetcode.editor.cn;

//Given a non-negative integer num, repeatedly add all its digits until the resu
//lt has only one digit. 
//
// Example: 
//
// 
//Input: 38
//Output: 2 
//Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
//             Since 2 has only one digit, return it.
// 
//
// Follow up: 
//Could you do it without any loop/recursion in O(1) runtime? Related Topics 数学 
//
// 👍 275 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-08 16:10:40
 */
public class AddDigits {
    public static void main(String[] args) {
        Solution solution = new AddDigits().new Solution();
        for (int n = 1; n < 100; n++) {
            int num = solution.addDigits(n);
            System.out.println(n + " " + num);
        }
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    private int sumOfDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}