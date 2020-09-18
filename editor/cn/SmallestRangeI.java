package leetcode.editor.cn;

//Given an array A of integers, for each integer A[i] we may choose any x with -
//K <= x <= K, and add x to A[i]. 
//
// After this process, we have some array B. 
//
// Return the smallest possible difference between the maximum value of B and th
//e minimum value of B. 
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
//Input: A = [1], K = 0
//Output: 0
//Explanation: B = [1]
// 
//
// 
// Example 2: 
//
// 
//Input: A = [0,10], K = 2
//Output: 6
//Explanation: B = [2,8]
// 
//
// 
// Example 3: 
//
// 
//Input: A = [1,3,6], K = 3
//Output: 0
//Explanation: B = [3,3,3] or B = [4,4,4]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// 0 <= A[i] <= 10000 
// 0 <= K <= 10000 
// 
// 
// 
// Related Topics 数学 
// 👍 56 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 14:31:51
 */
public class SmallestRangeI {
    public static void main(String[] args) {
        Solution solution = new SmallestRangeI().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int aMin = Integer.MAX_VALUE;
        int aMax = Integer.MIN_VALUE;
        for (int num : A) {
            aMin = Math.min(aMin, num);
            aMax = Math.max(aMax, num);
        }
        int bMin = aMin + K;
        int bMax = aMax - K;
        int diff = bMin < bMax ? bMax - bMin : 0;
        return diff;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}