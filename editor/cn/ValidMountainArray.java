package leetcode.editor.cn;

//Given an array A of integers, return true if and only if it is a valid mountai
//n array. 
//
// Recall that A is a mountain array if and only if: 
//
// 
// A.length >= 3 
// There exists some i with 0 < i < A.length - 1 such that:
// 
// A[0] < A[1] < ... A[i-1] < A[i] 
// A[i] > A[i+1] > ... > A[A.length - 1] 
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
//Input: [2,1]
//Output: false
// 
//
// 
// Example 2: 
//
// 
//Input: [3,5,5]
//Output: false
// 
//
// 
// Example 3: 
//
// 
//Input: [0,3,2,1]
//Output: true 
// 
// 
//
// 
//
// Note: 
//
// 
// 0 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 
//
// 
// 
//
// 
// 
// 
// Related Topics 数组 
// 👍 52 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:02
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        Solution solution = new ValidMountainArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int peakIdx = 0;
        while (peakIdx + 1 < A.length && A[peakIdx] < A[peakIdx + 1]) {
            peakIdx++;
        }
        if (peakIdx == 0 || peakIdx + 1 == A.length) {
            return false;
        }
        while (peakIdx + 1 < A.length) {
            if (A[peakIdx] <= A[peakIdx + 1]) {
                return false;
            }
            peakIdx++;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}