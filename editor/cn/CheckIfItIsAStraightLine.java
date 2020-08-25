package leetcode.editor.cn;

//You are given an array coordinates, coordinates[i] = [x, y], where [x, y] repr
//esents the coordinate of a point. Check if these points make a straight line in 
//the XY plane. 
//
// 
//
// 
// Example 1: 
//
// 
//
// 
//Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//Output: true
// 
//
// Example 2: 
//
// 
//
// 
//Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 2 <= coordinates.length <= 1000 
// coordinates[i].length == 2 
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 
// coordinates contains no duplicate point. 
// 
// Related Topics 几何 数组 数学 
// 👍 33 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-22 09:55:47
 */
public class CheckIfItIsAStraightLine {
    public static void main(String[] args) {
        Solution solution = new CheckIfItIsAStraightLine().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = getXDiff(coordinates, 0, 1);
        int dy = getYDiff(coordinates, 0, 1);
        if (dx == 0) {
            for (int i = 1; i < coordinates.length - 1; i++) {
                if (dx != getXDiff(coordinates, i, i + 1)) {
                    return false;
                }
            }
        } else if (dy == 0) {
            for (int i = 1; i < coordinates.length - 1; i++) {
                if (dy != getYDiff(coordinates, i, i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < coordinates.length - 1; i++) {
                if (dx * getYDiff(coordinates, i, i + 1) != dy * getXDiff(coordinates, i, i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getYDiff(int[][] coordinates, int i, int j) {
        return getY(coordinates[j]) - getY(coordinates[i]);
    }

    private int getXDiff(int[][] coordinates, int i, int j) {
        return getX(coordinates[j]) - getX(coordinates[i]);
    }

    private int getY(int[] point) {
        assert point.length == 2;
        return point[1];
    }

    private int getX(int[] point) {
        assert point.length == 2;
        return point[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}