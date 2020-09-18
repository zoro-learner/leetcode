package leetcode.editor.cn;

//Given two non-negative integers low and high. Return the count of odd numbers 
//between low and high (inclusive). 
//
// 
// Example 1: 
//
// 
//Input: low = 3, high = 7
//Output: 3
//Explanation: The odd numbers between 3 and 7 are [3,5,7]. 
//
// Example 2: 
//
// 
//Input: low = 8, high = 10
//Output: 1
//Explanation: The odd numbers between 8 and 10 are [9]. 
//
// 
// Constraints: 
//
// 
// 0 <= low <= high <= 10^9 
// Related Topics 数学 
// 👍 7 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 18:14:50
 */
public class CountOddNumbersInAnIntervalRange {
    public static void main(String[] args) {
        Solution solution = new CountOddNumbersInAnIntervalRange().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countOdds(int low, int high) {
        int counts = high - low + 1;
        int res = counts / 2;
        if (counts % 2 != 0 && low % 2 != 0) {
            res++;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}