package leetcode.editor.cn;

//Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = 
//[c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one 
//domino can be rotated to be equal to another domino. 
//
// Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and
// dominoes[i] is equivalent to dominoes[j]. 
//
// 
// Example 1: 
// Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= dominoes.length <= 40000 
// 1 <= dominoes[i][j] <= 9 
// Related Topics 数组 
// 👍 31 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-19 19:17:17
 */
public class NumberOfEquivalentDominoPairs {
    public static void main(String[] args) {
        Solution solution = new NumberOfEquivalentDominoPairs().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        final int RANGE = 10;
        int[][] grid = new int[RANGE][RANGE];
        for (int[] domino : dominoes) {
            int row = Math.min(domino[0], domino[1]);
            int col = Math.max(domino[0], domino[1]);
            grid[row][col]++;
        }

        int res = 0;
        for (int i = 1; i < RANGE; i++) {
            for (int j = i; j < RANGE; j++) {
                res += (grid[i][j] - 1) * grid[i][j] / 2;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}