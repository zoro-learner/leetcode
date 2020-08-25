package leetcode.editor.cn;

//Given an array A of non-negative integers, half of the integers in A are odd, 
//and half of the integers are even. 
//
// Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is e
//ven, i is even. 
//
// You may return any answer array that satisfies this condition. 
//
// 
//
// Example 1: 
//
// 
//Input: [4,2,5,7]
//Output: [4,5,2,7]
//Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
// 
//
// 
//
// Note: 
//
// 
// 2 <= A.length <= 20000 
// A.length % 2 == 0 
// 0 <= A[i] <= 1000 
// 
//
// 
// 
// Related Topics 排序 数组 
// 👍 117 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 14:10:23
 */
public class SortArrayByParityIi {
    public static void main(String[] args) {
        Solution solution = new SortArrayByParityIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int evenIdx = 0;
        int oddIdx = 1;
        while (evenIdx < A.length) {
            if (A[evenIdx] % 2 != 0) {
                while (oddIdx < A.length && A[oddIdx] % 2 != 0) {
                    oddIdx += 2;
                }
                if (oddIdx >= A.length) {
                    return A;
                }
                swap(A, evenIdx, oddIdx);
                oddIdx += 2;
            }
            evenIdx += 2;
        }
        return A;
    }

    private void swap(int[] nums, int evenIdx, int oddIdx) {
        int tmp = nums[evenIdx];
        nums[evenIdx] = nums[oddIdx];
        nums[oddIdx] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}