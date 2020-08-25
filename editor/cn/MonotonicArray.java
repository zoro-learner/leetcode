package leetcode.editor.cn;

//An array is monotonic if it is either monotone increasing or monotone decreasi
//ng. 
//
// An array A is monotone increasing if for all i <= j, A[i] <= A[j]. An array A
// is monotone decreasing if for all i <= j, A[i] >= A[j]. 
//
// Return true if and only if the given array A is monotonic. 
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
//Input: [1,2,2,3]
//Output: true
// 
//
// 
// Example 2: 
//
// 
//Input: [6,5,4,4]
//Output: true
// 
//
// 
// Example 3: 
//
// 
//Input: [1,3,2]
//Output: false
// 
//
// 
// Example 4: 
//
// 
//Input: [1,2,4,5]
//Output: true
// 
//
// 
// Example 5: 
//
// 
//Input: [1,1,1]
//Output: true
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 50000 
// -100000 <= A[i] <= 100000 
// 
// 
// 
// 
// 
// 
// Related Topics 数组 
// 👍 69 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 11:00:41
 */
public class MonotonicArray {
    public static void main(String[] args) {
        Solution solution = new MonotonicArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length < 2) {
            return true;
        }
        int k = 0;
        while (k + 1 < A.length && A[k] == A[k + 1]) {
            k++;
        }
        if (k + 1 == A.length) {
            return true;
        }
        boolean isIncreasing = A[k] < A[k + 1];
        if (isIncreasing) {
            while (k + 1 < A.length) {
                if (A[k] > A[k + 1]) {
                    return false;
                }
                k++;
            }
        } else {
            while (k + 1 < A.length) {
                if (A[k] < A[k + 1]) {
                    return false;
                }
                k++;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}