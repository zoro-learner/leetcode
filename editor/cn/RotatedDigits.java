package leetcode.editor.cn;

//X is a good number if after rotating each digit individually by 180 degrees, w
//e get a valid number that is different from X. Each digit must be rotated - we c
//annot choose to leave it alone. 
//
// A number is valid if each digit remains a digit after rotation. 0, 1, and 8 r
//otate to themselves; 2 and 5 rotate to each other (on this case they are rotated
// in a different direction, in other words 2 or 5 gets mirrored); 6 and 9 rotate 
//to each other, and the rest of the numbers do not rotate to any other number and
// become invalid. 
//
// Now given a positive number N, how many numbers X from 1 to N are good? 
//
// 
//Example:
//Input: 10
//Output: 4
//Explanation: 
//There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
//Note that 1 and 10 are not good numbers, since they remain unchanged after rot
//ating.
// 
//
// Note: 
//
// 
// N will be in range [1, 10000]. 
// 
// Related Topics 字符串 
// 👍 79 👎 0


import com.sun.deploy.panel.ExceptionListDialog;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-08-28 14:00:25
 */
public class RotatedDigits {
    public static void main(String[] args) {
        Solution solution = new RotatedDigits().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int rotatedDigits(int N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (isGoodNum(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isGoodNum(int num) {
        if (canRotate(num)) {
            int rotatedNum = rotate(num);
            return rotatedNum != num;
        }
        return false;
    }

    private int rotate(int num) {
        int[] digits = {0, 1, 5, 3, 4, 2, 9, 7, 8, 6};
        int res = 0;
        int ten = 1;
        while (ten <= num) {
            ten *= 10;
        }
        ten /= 10;

        while (ten > 0) {
            res = res * 10 + digits[num / ten];
            num %= ten;
            ten /= 10;
        }
        return res;
    }

    private boolean canRotate(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 4 || digit == 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}