package leetcode.editor.cn;

//Given an array A of positive lengths, return the largest perimeter of a triang
//le with non-zero area, formed from 3 of these lengths. 
//
// If it is impossible to form any triangle of non-zero area, return 0. 
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
//Input: [2,1,2]
//Output: 5
// 
//
// 
// Example 2: 
//
// 
//Input: [1,2,1]
//Output: 0
// 
//
// 
// Example 3: 
//
// 
//Input: [3,2,3,4]
//Output: 10
// 
//
// 
// Example 4: 
//
// 
//Input: [3,6,2,3]
//Output: 8
// 
//
// 
//
// Note: 
//
// 
// 3 <= A.length <= 10000 
// 1 <= A[i] <= 10^6 
// 
// 
// 
// 
// Related Topics 排序 数学 
// 👍 78 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-09 14:50:43
 */
public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Solution solution = new LargestPerimeterTriangle().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int maxP = 0;
        for (int i = A.length - 1; i >= 2; i--) {
            int sumOfTwoSmaller = A[i - 2] + A[i - 1];
            if (sumOfTwoSmaller > A[i]) {
                int sum = sumOfTwoSmaller + A[i];
                maxP = Math.max(maxP, sum);
            }
        }
        return maxP;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}