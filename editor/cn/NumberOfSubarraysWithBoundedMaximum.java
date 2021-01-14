package leetcode.editor.cn;

//We are given an array A of positive integers, and two positive integers L and 
//R (L <= R). 
//
// Return the number of (contiguous, non-empty) subarrays such that the value of
// the maximum array element in that subarray is at least L and at most R. 
//
// 
//Example :
//Input: 
//A = [2, 1, 4, 3]
//L = 2
//R = 3
//Output: 3
//Explanation: There are three subarrays that meet the requirements: [2], [2, 1]
//, [3].
// 
//
// Note: 
//
// 
// L, R and A[i] will be an integer in the range [0, 10^9]. 
// The length of A will be in the range of [1, 50000]. 
// 
// Related Topics 数组 
// 👍 87 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-31 09:29:31
 */
public class NumberOfSubarraysWithBoundedMaximum {
    public static void main(String[] args) {
        Solution solution = new NumberOfSubarraysWithBoundedMaximum().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int[] signs = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sign = 0;
            if (A[i] < L) {
                sign = -1;
            } else if (A[i] > R) {
                sign = 1;
            }
            signs[i] = sign;
        }
//        System.out.println(Arrays.toString(signs));

        int count = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i] != 0) {
                continue;
            }
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && signs[left] == -1) {
                left--;
            }
            while (right < signs.length && signs[right] <= 0) {
                right++;
            }
//            System.out.println(left + " " + i + " " + right);
            count += (i - left) * (right - i);
        }

        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}