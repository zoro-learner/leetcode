package leetcode.editor.cn;

//We have an array A of integers, and an array queries of queries. 
//
// For the i-th query val = queries[i][0], index = queries[i][1], we add val to 
//A[index]. Then, the answer to the i-th query is the sum of the even values of A.
// 
//
// (Here, the given index = queries[i][1] is a 0-based index, and each query per
//manently modifies the array A.) 
//
// Return the answer to all queries. Your answer array should have answer[i] as 
//the answer to the i-th query. 
//
// 
//
// Example 1: 
//
// 
//Input: A = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
//Output: [8,6,2,4]
//Explanation: 
//At the beginning, the array is [1,2,3,4].
//After adding 1 to A[0], the array is [2,2,3,4], and the sum of even values is 
//2 + 2 + 4 = 8.
//After adding -3 to A[1], the array is [2,-1,3,4], and the sum of even values i
//s 2 + 4 = 6.
//After adding -4 to A[0], the array is [-2,-1,3,4], and the sum of even values 
//is -2 + 4 = 2.
//After adding 2 to A[3], the array is [-2,-1,3,6], and the sum of even values i
//s -2 + 6 = 4.
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// -10000 <= A[i] <= 10000 
// 1 <= queries.length <= 10000 
// -10000 <= queries[i][0] <= 10000 
// 0 <= queries[i][1] < A.length 
// 
// Related Topics 数组 
// 👍 45 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:23
 */
public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        Solution solution = new SumOfEvenNumbersAfterQueries().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[queries.length];
        int evenSum = sumOfEvenNums(A);
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];
            int oldVal = A[idx];
            A[idx] += val;
            if ((oldVal & 1) == 0) {
                evenSum -= oldVal;
            }
            if ((A[idx] & 1) == 0) {
                evenSum += A[idx];
            }
            ans[i] = evenSum;
        }
        return ans;
    }

    private int sumOfEvenNums(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if ((num & 1) == 0) {
                sum += num;
            }
        }
        return sum;
//        return Arrays.stream(nums).filter(t -> t % 2 == 0).sum();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}