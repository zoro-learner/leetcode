package leetcode.editor.cn;

//Three stones are on a number line at positions a, b, and c. 
//
// Each turn, you pick up a stone at an endpoint (ie., either the lowest or high
//est position stone), and move it to an unoccupied position between those endpoin
//ts. Formally, let's say the stones are currently at positions x, y, z with x < y
// < z. You pick up the stone at either position x or position z, and move that st
//one to an integer position k, with x < k < z and k != y. 
//
// The game ends when you cannot make any more moves, ie. the stones are in cons
//ecutive positions. 
//
// When the game ends, what is the minimum and maximum number of moves that you 
//could have made? Return the answer as an length 2 array: answer = [minimum_moves
//, maximum_moves] 
//
// 
//
// Example 1: 
//
// 
//Input: a = 1, b = 2, c = 5
//Output: [1,2]
//Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
// 
//
// 
// Example 2: 
//
// 
//Input: a = 4, b = 3, c = 2
//Output: [0,0]
//Explanation: We cannot make any moves.
// 
//
// 
// Example 3: 
//
// 
//Input: a = 3, b = 5, c = 1
//Output: [1,2]
//Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
// 
//
// 
// 
// 
//
// Note: 
//
// 
// 1 <= a <= 100 
// 1 <= b <= 100 
// 1 <= c <= 100 
// a != b, b != c, c != a 
// 
//
// 
// 
//
// 
// 
// 
// 
// Related Topics 脑筋急转弯 
// 👍 26 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-06 15:34:35
 */
public class MovingStonesUntilConsecutive {
    public static void main(String[] args) {
        Solution solution = new MovingStonesUntilConsecutive().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        Arrays.sort(nums);

        int d1 = nums[1] - nums[0];
        int d2 = nums[2] - nums[1];
        int min = 0;
        int max = 0;
        if (d1 > 1 || d2 > 1) {
            if (d1 <= 2 || d2 <= 2) {
                min = 1;
            } else {
                min = 2;
            }
            max = d1 + d2 - 2;
        }

        return new int[]{min, max};
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}