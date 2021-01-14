package leetcode.editor.cn;

//
//An image is represented by a 2-D array of integers, each integer representing 
//the pixel value of the image (from 0 to 65535).
// 
//Given a coordinate (sr, sc) representing the starting pixel (row and column) o
//f the flood fill, and a pixel value newColor, "flood fill" the image.
// 
//To perform a "flood fill", consider the starting pixel, plus any pixels connec
//ted 4-directionally to the starting pixel of the same color as the starting pixe
//l, plus any pixels connected 4-directionally to those pixels (also with the same
// color as the starting pixel), and so on. Replace the color of all of the aforem
//entioned pixels with the newColor.
// 
//At the end, return the modified image.
// 
// Example 1: 
// 
//Input: 
//image = [[1,1,1],[1,1,0],[1,0,1]]
//sr = 1, sc = 1, newColor = 2
//Output: [[2,2,2],[2,2,0],[2,0,1]]
//Explanation: 
//From the center of the image (with position (sr, sc) = (1, 1)), all pixels con
//nected 
//by a path of the same color as the starting pixel are colored with the new col
//or.
//Note the bottom corner is not colored 2, because it is not 4-directionally con
//nected
//to the starting pixel.
// 
// 
//
// Note:
// The length of image and image[0] will be in the range [1, 50]. 
// The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < im
//age[0].length. 
// The value of each color in image[i][j] and newColor will be an integer in [0,
// 65535]. 
// Related Topics 深度优先搜索 
// 👍 139 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-29 15:10:18
 */
public class FloodFill {
    public static void main(String[] args) {
        Solution solution = new FloodFill().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startColor = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, visited, sr, sc, startColor, newColor);

        return image;
    }

    private void helper(int[][] image, boolean[][] visited, int sr, int sc, int startColor, int newColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) {
            return ;
        }
        if (image[sr][sc] != startColor || visited[sr][sc]) {
            return ;
        }
        image[sr][sc] = newColor;
        visited[sr][sc] = true;
//        System.out.println(sr + " " + sc);

        if (sr > 0 && image[sr - 1][sc] == startColor) {
            helper(image, visited, sr - 1, sc, startColor, newColor);
        }
        if (sr < image.length - 1 && image[sr + 1][sc] == startColor) {
            helper(image, visited, sr + 1, sc, startColor, newColor);
        }
        if (sc > 0 && image[sr][sc - 1] == startColor) {
            helper(image, visited, sr, sc - 1, startColor, newColor);
        }
        if (sc < image[0].length - 1 && image[sr][sc + 1] == startColor) {
            helper(image, visited, sr, sc + 1, startColor, newColor);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}