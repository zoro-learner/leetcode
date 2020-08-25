package leetcode.editor.cn;

//Given an integer array arr, return true if there are three consecutive odd num
//bers in the array. Otherwise, return false.
// 
// Example 1: 
//
// 
//Input: arr = [2,6,4,1]
//Output: false
//Explanation: There are no three consecutive odds.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,34,3,4,5,7,23,12]
//Output: true
//Explanation: [5,7,23] are three consecutive odds.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// 1 <= arr[i] <= 1000 
// 
// Related Topics 数组 
// 👍 2 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-21 19:26:28
 */
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        Solution solution = new ThreeConsecutiveOdds().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int start = 0;
        int cnt = 0;
        while (start < arr.length) {
            if (arr[start] % 2 != 0) {
                cnt++;
                if (cnt >= 3) {
                    return true;
                }
            } else {
                cnt = 0;
            }
            start++;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}