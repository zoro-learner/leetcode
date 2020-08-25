package leetcode.editor.cn;

//Given an integer array sorted in non-decreasing order, there is exactly one in
//teger in the array that occurs more than 25% of the time. 
//
// Return that integer. 
//
// 
// Example 1: 
// Input: arr = [1,2,2,6,6,6,6,7,10]
//Output: 6
// 
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5 
// Related Topics 数组 
// 👍 27 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-19 16:42:26
 */
public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {
        Solution solution = new ElementAppearingMoreThan25InSortedArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findSpecialInteger(int[] arr) {
        int cnt = 0;
        int k = arr[0];
        for (int num : arr) {
            if (k == num) {
                cnt++;
            } else {
                if (cnt > arr.length / 4) {
                    return k;
                }
                k = num;
                cnt = 1;
            }
        }
        if (cnt > arr.length / 4) {
            return k;
        }
        throw new IllegalArgumentException("No solution");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}