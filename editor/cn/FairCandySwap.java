package leetcode.editor.cn;

//Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th
// bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that
// Bob has. 
//
// Since they are friends, they would like to exchange one candy bar each so tha
//t after the exchange, they both have the same total amount of candy. (The total 
//amount of candy a person has is the sum of the sizes of candy bars they have.) 
//
// Return an integer array ans where ans[0] is the size of the candy bar that Al
//ice must exchange, and ans[1] is the size of the candy bar that Bob must exchang
//e. 
//
// If there are multiple answers, you may return any one of them. It is guarante
//ed an answer exists. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: A = [1,1], B = [2,2]
//Output: [1,2]
// 
//
// 
// Example 2: 
//
// 
//Input: A = [1,2], B = [2,3]
//Output: [1,2]
// 
//
// 
// Example 3: 
//
// 
//Input: A = [2], B = [1,3]
//Output: [2,3]
// 
//
// 
// Example 4: 
//
// 
//Input: A = [1,2,5], B = [2,4]
//Output: [5,4]
// 
//
// 
//
// Note: 
//
// 
// 1 <= A.length <= 10000 
// 1 <= B.length <= 10000 
// 1 <= A[i] <= 100000 
// 1 <= B[i] <= 100000 
// It is guaranteed that Alice and Bob have different total amounts of candy. 
// It is guaranteed there exists an answer. 
// 
// 
// 
// 
// 
// Related Topics 数组 
// 👍 76 👎 0


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-18 10:38:17
 */
public class FairCandySwap {
    public static void main(String[] args) {
        Solution solution = new FairCandySwap().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        Set<Integer> setA = Arrays.stream(A).boxed().collect(Collectors.toSet());
        Set<Integer> setB = Arrays.stream(B).boxed().collect(Collectors.toSet());
        for (Integer a : setA) {
            int b = a - (sumA - sumB) / 2;
            if (setB.contains(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{-1, -1};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}