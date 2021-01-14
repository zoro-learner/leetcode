package leetcode.editor.cn;

//
//Given a non-negative integer, you could swap two digits at most once to get th
//e maximum valued number. Return the maximum valued number you could get.
// 
//
// Example 1: 
// 
//Input: 2736
//Output: 7236
//Explanation: Swap the number 2 and the number 7.
// 
// 
//
// Example 2: 
// 
//Input: 9973
//Output: 9973
//Explanation: No swap.
// 
// 
//
//
// Note: 
// 
// The given number is in the range [0, 108] 
// 
// Related Topics 数组 数学 
// 👍 121 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-10-28 14:18:45
 */
public class MaximumSwap {
    public static void main(String[] args) {
        Solution solution = new MaximumSwap().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumSwap(int num) {
        if (num == 0) {
            return 0;
        }
        int[] digits = getDigitArray(num);
        for (int i = 0; i < digits.length; i++) {
            int maxIdx = i;
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[j] >= max) {
                    max = digits[j];
                    maxIdx = j;
                }
            }
            if (max > digits[i]) {
                swap(digits, maxIdx, i);
                break;
            }
        }
        return convertToNum(digits);
    }

    private int convertToNum(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res * 10 + num;
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private int[] getDigitArray(int num) {
        Deque<Integer> digits = new LinkedList<>();
        while (num > 0) {
            int digit = num % 10;
            digits.addFirst(digit);
            num /= 10;
        }
        return digits
            .stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}