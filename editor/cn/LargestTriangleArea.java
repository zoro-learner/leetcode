package leetcode.editor.cn;

//You have a list of points in the plane. Return the area of the largest triangl
//e that can be formed by any 3 of the points. 
//
// 
//Example:
//Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
//Output: 2
//Explanation: 
//The five points are show in the figure below. The red triangle is the largest.
//
// 
//
// 
//
// Notes: 
//
// 
// 3 <= points.length <= 50. 
// No points will be duplicated. 
// -50 <= points[i][j] <= 50. 
// Answers within 10^-6 of the true value will be accepted as correct. 
// 
//
// 
// Related Topics 数学 
// 👍 63 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 10:53:42
 */
public class LargestTriangleArea {
    public static void main(String[] args) {
        Solution solution = new LargestTriangleArea().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double largestTriangleArea(int[][] points) {
        double res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double a = getDistance(points[i], points[j]);
                for (int k = j + 1; k < points.length; k++) {
                    double b = getDistance(points[i], points[k]);
                    double c = getDistance(points[j], points[k]);
                    if (isTriangle(a, b, c)) {
                        res = Math.max(res, getArea(a, b, c));
                    }
                }
            }
        }
        return res;
    }

    private double getArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    private boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private double getDistance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}