package leetcode.editor.cn;

//Given an array nums of integers, return how many of them contain an even numbe
//r of digits.
// 
// Example 1: 
//
// 
//Input: nums = [12,345,2,6,7896]
//Output: 2
//Explanation: 
//12 contains 2 digits (even number of digits). 
//345 contains 3 digits (odd number of digits). 
//2 contains 1 digit (odd number of digits). 
//6 contains 1 digit (odd number of digits). 
//7896 contains 4 digits (even number of digits). 
//Therefore only 12 and 7896 contain an even number of digits.
// 
//
// Example 2: 
//
// 
//Input: nums = [555,901,482,1771]
//Output: 1 
//Explanation: 
//Only 1771 contains an even number of digits.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 500 
// 1 <= nums[i] <= 10^5 
// 
// Related Topics 数组 
// 👍 47 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-22 14:28:09
 */
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Solution solution = new FindNumbersWithEvenNumberOfDigits().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (isDigitEven(num)) {
                res++;
            }
        }
        return res;
    }

    private boolean isDigitEven(int num) {
        if (num == 0) {
            return false;
        }
        int cnt = 0;
        while (num != 0) {
            num /= 10;
            cnt++;
        }
        return (cnt & 1) == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}