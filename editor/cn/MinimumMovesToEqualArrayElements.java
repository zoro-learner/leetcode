package leetcode.editor.cn;

//Given a non-empty integer array of size n, find the minimum number of moves re
//quired to make all array elements equal, where a move is incrementing n - 1 elem
//ents by 1. 
//
// Example:
// 
//Input:
//[1,2,3]
//
//Output:
//3
//
//Explanation:
//Only three moves are needed (remember each move increments two elements):
//
//[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
// 
// Related Topics 数学 
// 👍 142 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-09 09:57:17
 */
public class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        Solution solution = new MinimumMovesToEqualArrayElements().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }
        int res = sum - min * nums.length;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}