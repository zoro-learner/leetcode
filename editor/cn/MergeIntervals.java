package leetcode.editor.cn;

//Given a collection of intervals, merge all overlapping intervals. 
//
// Example 1: 
//
// 
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// 
//
// Example 2: 
//
// 
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping. 
//
// NOTE: input types have been changed on April 15, 2019. Please reset to defaul
//t code definition to get new method signature. 
//
// 
// Constraints: 
//
// 
// intervals[i][0] <= intervals[i][1] 
// 
// Related Topics 排序 数组 
// 👍 641 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-10 14:58:38
 */
public class MergeIntervals {
    public static void main(String[] args) {
        Solution solution = new MergeIntervals().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int[][] res = new int[intervals.length][2];

        int[] curr = intervals[0];
        int k = 0;
        int idx = 1;
        while (idx < intervals.length) {
            if (curr[1] < intervals[idx][0]) {
                System.arraycopy(curr, 0, res[k++], 0, 2);
                curr = intervals[idx];
            } else if (curr[1] < intervals[idx][1]) {
                curr = new int[]{curr[0], intervals[idx][1]};
            }
            idx++;
        }
        System.arraycopy(curr, 0, res[k++], 0, 2);

        return Arrays.copyOf(res, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}