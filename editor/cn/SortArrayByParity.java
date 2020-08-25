package leetcode.editor.cn;

//Given an array A of non-negative integers, return an array consisting of all t
//he even elements of A, followed by all the odd elements of A. 
//
// You may return any answer array that satisfies this condition. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: [3,1,2,4]
//Output: [2,4,3,1]
//The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 5000 
// 0 <= A[i] <= 5000 
// 
// 
// Related Topics 数组 
// 👍 158 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 11:20:19
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        Solution solution = new SortArrayByParity().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 != 0) {
                while (right > left && A[right] % 2 != 0) {
                    right--;
                }
                if (left == right) {
                    return A;
                }
                swap(A, left, right);
                right--;
            }
            left++;
        }
        return A;
    }

    private void swap(int[] a, int left, int right) {
        int tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}