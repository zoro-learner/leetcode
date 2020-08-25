package leetcode.editor.cn;

//Given a 2D integer matrix M representing the gray scale of an image, you need 
//to design a smoother to make the gray scale of each cell becomes the average gra
//y scale (rounding down) of all the 8 surrounding cells and itself. If a cell has
// less than 8 surrounding cells, then use as many as you can. 
//
// Example 1: 
// 
//Input:
//[[1,1,1],
// [1,0,1],
// [1,1,1]]
//Output:
//[[0, 0, 0],
// [0, 0, 0],
// [0, 0, 0]]
//Explanation:
//For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
//For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
//For the point (1,1): floor(8/9) = floor(0.88888889) = 0
// 
// 
//
// Note: 
// 
// The value in the given matrix is in the range of [0, 255]. 
// The length and width of the given matrix are in the range of [1, 150]. 
// 
// Related Topics 数组 
// 👍 57 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-11 19:39:57
 */
public class ImageSmoother {
    public static void main(String[] args) {
        Solution solution = new ImageSmoother().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M == null || M.length == 0 || M[0] == null || M[0].length == 0) {
            return M;
        }
        int[][] res = new int[M.length][M[0].length];
        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[0].length; c++) {
                res[r][c] = getNewGray(M, r, c);
            }
        }
        return res;
    }

    private int getNewGray(int[][] M, int r, int c) {
        if (r < 0 || r > M.length || c < 0 || c > M[0].length) {
            throw new IllegalArgumentException("Wrong row / col");
        }
        int cnt = 0;
        int sum = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < M.length && j >= 0 && j < M[0].length) {
                    sum += M[i][j];
                    cnt++;
                }
            }
        }
        return sum / cnt;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

    
}