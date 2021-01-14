package leetcode.editor.cn;

//Given an array of integers A, a move consists of choosing any A[i], and increm
//enting it by 1. 
//
// Return the least number of moves to make every value in A unique. 
//
// 
//
// Example 1: 
//
// 
//Input: [1,2,2]
//Output: 1
//Explanation:  After 1 move, the array could be [1, 2, 3].
// 
//
// 
// Example 2: 
//
// 
//Input: [3,2,1,2,1,7]
//Output: 6
//Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
//It can be shown with 5 or less moves that it is impossible for the array to ha
//ve all unique values.
// 
//
// 
// 
//
// Note: 
//
// 
// 0 <= A.length <= 40000 
// 0 <= A[i] < 40000 
// 
//
// 
// 
// Related Topics 数组 
// 👍 156 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-11-02 19:09:24
 */
public class MinimumIncrementToMakeArrayUnique {
    public static void main(String[] args) {
        Solution solution = new MinimumIncrementToMakeArrayUnique().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // [1, 2, 2] -> [0, 1, 1]
    // [3, 2, 1, 2, 1, 7] -> [2, 1, 0, 1, 0, 6]
    public int minIncrementForUnique(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> keys = new HashSet<>(map.keySet());

        int sum = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                continue;
            }
            int next = num + 1;
            int k = map.get(num);
            while (k-- > 1) {
                while (keys.contains(next)) {
                    next++;
                }
                keys.add(next);
                sum += next - num;
            }
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}