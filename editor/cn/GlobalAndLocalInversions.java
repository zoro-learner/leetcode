package leetcode.editor.cn;

//We have some permutation A of [0, 1, ..., N - 1], where N is the length of A. 
//
//
// The number of (global) inversions is the number of i < j with 0 <= i < j < N 
//and A[i] > A[j]. 
//
// The number of local inversions is the number of i with 0 <= i < N and A[i] > 
//A[i+1]. 
//
// Return true if and only if the number of global inversions is equal to the nu
//mber of local inversions. 
//
// Example 1: 
//
// 
//Input: A = [1,0,2]
//Output: true
//Explanation: There is 1 global inversion, and 1 local inversion.
// 
//
// Example 2: 
//
// 
//Input: A = [1,2,0]
//Output: false
//Explanation: There are 2 global inversions, and 1 local inversion.
// 
//
// Note: 
//
// 
// A will be a permutation of [0, 1, ..., A.length - 1]. 
// A will have length in range [1, 5000]. 
// The time limit for this problem has been reduced. 
// 
// Related Topics 数组 数学 
// 👍 49 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-30 19:26:42
 */
public class GlobalAndLocalInversions {
    public static void main(String[] args) {
        Solution solution = new GlobalAndLocalInversions().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIdealPermutation(int[] A) {
        return numOfGlobalInversions(A) == numOfLocalInversions(A);
    }

    private int numOfGlobalInversions(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private int numOfLocalInversions(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                cnt++;
            }
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}