package leetcode.editor.cn;

//A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 
//such that each row, column, and both diagonals all have the same sum. 
//
// Given an grid of integers, how many 3 x 3 "magic square" subgrids are there? 
//(Each subgrid is contiguous). 
//
// 
//
// Example 1: 
//
// 
//Input: [[4,3,8,4],
//        [9,5,1,9],
//        [2,7,6,2]]
//Output: 1
//Explanation: 
//The following subgrid is a 3 x 3 magic square:
//438
//951
//276
//
//while this one is not:
//384
//519
//762
//
//In total, there is only one magic square inside the given grid.
// 
//
// Note: 
//
// 
// 1 <= grid.length <= 10 
// 1 <= grid[0].length <= 10 
// 0 <= grid[i][j] <= 15 
// 
// Related Topics 数组 
// 👍 38 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-18 09:10:40
 */
public class MagicSquaresInGrid {
    public static void main(String[] args) {
        Solution solution = new MagicSquaresInGrid().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int cnt = 0;
        for (int r = 0; r + 2 < grid.length; r++) {
            for (int c = 0; c + 2 < grid[0].length; c++) {
                if (isMagicSquares(grid, r, c)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private boolean isMagicSquares(int[][] grid, int r, int c) {
        return isDistinctNum(grid, r, c) && isSumEqual(grid, r, c);
    }

    private boolean isDistinctNum(int[][] grid, int r, int c) {
        if (r < 0 || r + 2 >= grid.length || c < 0 || c + 2 >= grid[0].length) {
            return false;
        }
        int[] dict = new int[10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = grid[r + i][c + j];
                if (num <= 0 || num > 9) {
                    return false;
                }
                dict[num]++;
            }
        }
        for (int count : dict) {
            if (count > 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isSumEqual(int[][] grid, int r, int c) {
        if (r < 0 || r + 2 >= grid.length || c < 0 || c + 2 >= grid[0].length) {
            return false;
        }

        int sum = 0;
        int diagSum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grid[r + i][c + i];
            diagSum += grid[r + 2 - i][c + i];
        }
        if (diagSum != sum) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += grid[r + i][c + j];
                colSum += grid[r + j][c + i];
            }
            if (rowSum != sum || colSum != sum) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}