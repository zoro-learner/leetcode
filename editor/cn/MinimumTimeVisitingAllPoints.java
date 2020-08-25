package leetcode.editor.cn;

//On a plane there are n points with integer coordinates points[i] = [xi, yi]. Y
//our task is to find the minimum time in seconds to visit all points. 
//
// You can move according to the next rules: 
//
// 
// In one second always you can either move vertically, horizontally by one unit
// or diagonally (it means to move one unit vertically and one unit horizontally i
//n one second). 
// You have to visit the points in the same order as they appear in the array. 
// 
//
// 
// Example 1: 
//
// 
//Input: points = [[1,1],[3,4],[-1,0]]
//Output: 7
//Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> 
//[1,2] -> [0,1] -> [-1,0]   
//Time from [1,1] to [3,4] = 3 seconds 
//Time from [3,4] to [-1,0] = 4 seconds
//Total time = 7 seconds 
//
// Example 2: 
//
// 
//Input: points = [[3,2],[-2,2]]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// points.length == n 
// 1 <= n <= 100 
// points[i].length == 2 
// -1000 <= points[i][0], points[i][1] <= 1000 
// 
// Related Topics 几何 数组 
// 👍 48 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-22 14:18:01
 */
public class MinimumTimeVisitingAllPoints {
    public static void main(String[] args) {
        Solution solution = new MinimumTimeVisitingAllPoints().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int dx = Math.abs(points[i + 1][0] - points[i][0]);
            int dy = Math.abs(points[i + 1][1] - points[i][1]);
            res += Math.max(dx, dy);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}