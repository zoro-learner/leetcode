package leetcode.editor.cn;

//Given two integer arrays A and B, return the maximum length of an subarray tha
//t appears in both arrays. 
//
// Example 1: 
//
// 
//Input:
//A: [1,2,3,2,1]
//B: [3,2,1,4,7]
//Output: 3
//Explanation: 
//The repeated subarray with maximum length is [3, 2, 1].
// 
//
// 
//
// Note: 
//
// 
// 1 <= len(A), len(B) <= 1000 
// 0 <= A[i], B[i] < 100 
// 
//
// 
// Related Topics 数组 哈希表 二分查找 动态规划 
// 👍 336 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-29 15:57:17
 */
public class MaximumLengthOfRepeatedSubarray {
    public static void main(String[] args) {
        Solution solution = new MaximumLengthOfRepeatedSubarray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] cache;
    public int findLength(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        cache = new int[m][n];
        for (int r = 0; r < m; r++) {
            Arrays.fill(cache[r], -1);
        }
        int res = longestCommonLength(A, 0, B, 0);
        return res;
    }

    private int longestCommonLength(int[] a, int aIdx, int[] b, int bIdx) {
        if (aIdx >= a.length || bIdx >= b.length) {
            return 0;
        }
        if (cache[aIdx][bIdx] != -1) {
            return cache[aIdx][bIdx];
        }
        int max = 0;
        int pa = aIdx;
        int pb = bIdx;
        while (pa < a.length && pb < b.length && a[pa] == b[pb]) {
            pa++;
            pb++;
            max++;
        }
        max = Math.max(max, longestCommonLength(a, aIdx + 1, b, bIdx));
        max = Math.max(max, longestCommonLength(a, aIdx, b, bIdx + 1));
        cache[aIdx][bIdx] = max;
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}