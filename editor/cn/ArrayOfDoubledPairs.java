package leetcode.editor.cn;

//Given an array of integers A with even length, return true if and only if it i
//s possible to reorder it such that A[2 * i + 1] = 2 * A[2 * i] for every 0 <= i 
//< len(A) / 2. 
//
// 
// 
// 
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
//Input: A = [3,1,3,6]
//Output: false
// 
//
// Example 2: 
//
// 
//Input: A = [2,1,2,6]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: A = [4,-2,2,-4]
//Output: true
//Explanation: We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or 
//[2,4,-2,-4].
// 
//
// Example 4: 
//
// 
//Input: A = [1,2,4,16,8,4]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 0 <= A.length <= 3 * 104 
// A.length is even. 
// -105 <= A[i] <= 105 
// 
// Related Topics 数组 哈希表 
// 👍 36 👎 0


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zoro-learner
 * @create 2020-11-02 19:08:45
 */
public class ArrayOfDoubledPairs {
    public static void main(String[] args) {
        Solution solution = new ArrayOfDoubledPairs().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canReorderDoubled(int[] A) {
        int[] sortedA = Arrays.stream(A)
            .boxed()
            .sorted((o1, o2) -> {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }
                return Math.abs(o1) - Math.abs(o2);
            })
            .mapToInt(Integer::intValue)
            .toArray();
//        System.out.println(Arrays.toString(sortedA));
        int N = A.length;
        for (int i = 0; i < N / 2; i++) {
            if (sortedA[i] * 2 != sortedA[i + N / 2]) {
                return false;
            }
        }
        return true;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}