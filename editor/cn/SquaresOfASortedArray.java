package leetcode.editor.cn;

//Given an array of integers A sorted in non-decreasing order, return an array o
//f the squares of each number, also in sorted non-decreasing order. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
// 
//
// 
// Example 2: 
//
// 
//Input: [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// -10000 <= A[i] <= 10000 
// A is sorted in non-decreasing order. 
// 
// 
// Related Topics 数组 双指针 
// 👍 113 👎 0


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:18
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] A) {
        int zeroIdx = Arrays.binarySearch(A, 0);
//        System.out.println(zeroIdx);
        int[] res = new int[A.length];

        if (zeroIdx == -1) {
            for (int i = 0; i < res.length; i++) {
                res[i] = A[i] * A[i];
            }
            return res;
//            return Arrays.stream(A).map(t -> t * t).toArray();
        }

        if (zeroIdx == -A.length - 1) {
//            return Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).map(t -> t * t).mapToInt(Integer::intValue).toArray();
            for (int i = 0; i < res.length; i++) {
                res[i] = A[res.length - 1 - i] * A[res.length - 1 - i];
            }
            return res;
        }

        if (zeroIdx < 0) {
            zeroIdx = -zeroIdx - 1;
        }

        int left = zeroIdx - 1;
        int right = zeroIdx;

        for (int i = 0; i < res.length; i++) {
            if (left < 0) {
                res[i] = A[right] * A[right];
                right++;
            } else if (right >= A.length) {
                res[i] = A[left] * A[left];
                left--;
            } else {
                int leftSquare = A[left] * A[left];
                int rightSquare = A[right] * A[right];
                if (leftSquare <= rightSquare) {
                    res[i] = leftSquare;
                    left--;
                } else {
                    res[i] = rightSquare;
                    right++;
                }

            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}