package leetcode.editor.cn;

//Given an array of integers A, find the sum of min(B), where B ranges over ever
//y (contiguous) subarray of A. 
//
// Since the answer may be large, return the answer modulo 10^9 + 7. 
//
// 
//
// Example 1: 
//
// 
//Input: [3,1,2,4]
//Output: 17
//Explanation: Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [
//1,2,4], [3,1,2,4]. 
//Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.  Sum is 17. 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 30000 
// 1 <= A[i] <= 30000 
// 
//
// 
// 
// 
// Related Topics 栈 数组 
// 👍 172 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-11-02 11:17:51
 */
public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        Solution solution = new SumOfSubarrayMinimums().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumSubarrayMins(int[] A) {
        int N = A.length;
        final int MOD_NUM = 1000000007;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && A[left] >= A[i]) {
                left--;
            }
            while (right < N && A[right] > A[i]) {
                right++;
            }
//            System.out.println(left + " " + i + " " + right);
            sum = sum + (A[i] % MOD_NUM) * (i - left) * (right - i);
            sum %= MOD_NUM;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}