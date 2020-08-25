package leetcode.editor.cn;

//Given an integer n. Each number from 1 to n is grouped according to the sum of
// its digits. 
//
// Return how many groups have the largest size. 
//
// 
// Example 1: 
//
// 
//Input: n = 13
//Output: 4
//Explanation: There are 9 groups in total, they are grouped according sum of it
//s digits of numbers from 1 to 13:
//[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9]. There are 4 groups wi
//th largest size.
// 
//
// Example 2: 
//
// 
//Input: n = 2
//Output: 2
//Explanation: There are 2 groups [1], [2] of size 1.
// 
//
// Example 3: 
//
// 
//Input: n = 15
//Output: 6
// 
//
// Example 4: 
//
// 
//Input: n = 24
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 10^4 
// 
// Related Topics 数组 
// 👍 12 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-24 10:46:54
 */
public class CountLargestGroup {
    public static void main(String[] args) {
        Solution solution = new CountLargestGroup().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countLargestGroup(int n) {
        final int RANGE = 40;
        int[] counts = new int[RANGE];
        int maxCount = 0;
        for (int i = 1; i <= n; i++) {
            int sum = getDigitsSum(i);
            counts[sum]++;
            maxCount = Math.max(counts[sum], maxCount);
        }
        int finalMaxCount = maxCount;
        return (int) Arrays.stream(counts).filter(t -> t == finalMaxCount).count();
    }

    private int getDigitsSum(int n) {
        assert n > 0 && n <= 10000;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}