package leetcode.editor.cn;

//A rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) are the 
//coordinates of its bottom-left corner, and (x2, y2) are the coordinates of its t
//op-right corner. 
//
// Two rectangles overlap if the area of their intersection is positive. To be c
//lear, two rectangles that only touch at the corner or edges do not overlap. 
//
// Given two (axis-aligned) rectangles, return whether they overlap. 
//
// Example 1: 
//
// 
//Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//Output: false
// 
//
// Notes: 
//
// 
// Both rectangles rec1 and rec2 are lists of 4 integers. 
// All coordinates in rectangles will be between -10^9 and 10^9. 
// 
// Related Topics 数学 
// 👍 174 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 10:58:45
 */
public class RectangleOverlap {
    public static void main(String[] args) {
        Solution solution = new RectangleOverlap().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return getX2(rec1) > getX1(rec2) && getX1(rec1) < getX2(rec2) && getY1(rec1) < getY2(rec2) && getY2(rec1) > getY1(rec2);
    }

    private int getX1(int[] rec) {
        return rec[0];
    }

    private int getY1(int[] rec) {
        return rec[1];
    }

    private int getX2(int[] rec) {
        return rec[2];
    }

    private int getY2(int[] rec) {
        return rec[3];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}