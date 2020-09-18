package leetcode.editor.cn;

//A boomerang is a set of 3 points that are all distinct and not in a straight l
//ine. 
//
// Given a list of three points in the plane, return whether these points are a 
//boomerang. 
//
// 
//
// Example 1: 
//
// 
//Input: [[1,1],[2,3],[3,2]]
//Output: true
// 
//
// 
// Example 2: 
//
// 
//Input: [[1,1],[2,2],[3,3]]
//Output: false 
// 
//
// 
//
// Note: 
//
// 
// points.length == 3 
// points[i].length == 2 
// 0 <= points[i][j] <= 100 
// 
//
// 
// 
// Related Topics 数学 
// 👍 20 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-10 08:45:02
 */
public class ValidBoomerang {
    public static void main(String[] args) {
        Solution solution = new ValidBoomerang().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isBoomerang(int[][] points) {
        return isAllDistinct(points) && !isOnOneLine(points);
    }

    private boolean isOnOneLine(int[][] points) {
        int dx1 = getXDiff(points[0], points[1]);
        int dy1 = getYDiff(points[0], points[1]);
        int dx2 = getXDiff(points[1], points[2]);
        int dy2 = getYDiff(points[1], points[2]);
        return dx1 * dy2 == dx2 * dy1;
    }

    private boolean isAllDistinct(int[][] points) {
        for (int i = 0; i < points.length - 1; i++) {
            if (isSamePoint(points[i], points[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private boolean isSamePoint(int[] p1, int[] p2) {
        return getXDiff(p1, p2) == 0 && getYDiff(p1, p2) == 0;
    }

    private int getX(int[] point) {
        return point[0];
    }

    private int getY(int[] point) {
        return point[1];
    }

    private int getXDiff(int[] p1, int[] p2) {
        return getX(p1) - getX(p2);
    }

    private int getYDiff(int[] p1, int[] p2) {
        return getY(p1) - getY(p2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}