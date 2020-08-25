package leetcode.editor.cn;

//Given an array A of integers, return true if and only if we can partition the 
//array into three non-empty parts with equal sums. 
//
// Formally, we can partition the array if we can find indexes i+1 < j with (A[0
//] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... +
// A[A.length - 1]) 
//
// 
// Example 1: 
//
// 
//Input: A = [0,2,1,-6,6,-7,9,1,2,0,1]
//Output: true
//Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
// 
//
// Example 2: 
//
// 
//Input: A = [0,2,1,-6,6,7,9,-1,2,0,1]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: A = [3,3,6,5,-2,2,5,1,-9,4]
//Output: true
//Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
// 
//
// 
// Constraints: 
//
// 
// 3 <= A.length <= 50000 
// -10^4 <= A[i] <= 10^4 
// 
// Related Topics 数组 
// 👍 118 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-19 10:19:42
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        Solution solution = new PartitionArrayIntoThreePartsWithEqualSum().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int[] sumArr = new int[A.length];
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sumArr[i] = sum;
        }

        if (sum % 3 != 0) {
            return false;
        }

        for (int i = 0; i < A.length; i++) {
            if (sumArr[i] == sum / 3) {
                for (int j = i + 2; j < A.length; j++) {
                    if (sumArr[j - 1] == sum / 3 * 2) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}