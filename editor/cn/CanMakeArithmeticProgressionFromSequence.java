package leetcode.editor.cn;

//Given an array of numbers arr. A sequence of numbers is called an arithmetic p
//rogression if the difference between any two consecutive elements is the same. 
//
// Return true if the array can be rearranged to form an arithmetic progression,
// otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: arr = [3,5,1]
//Output: true
//Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with difference
//s 2 and -2 respectively, between each consecutive elements.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,4]
//Output: false
//Explanation: There is no way to reorder the elements to obtain an arithmetic p
//rogression.
// 
//
// 
// Constraints: 
//
// 
// 2 <= arr.length <= 1000 
// -10^6 <= arr[i] <= 10^6 
// 
// Related Topics 排序 数组 
// 👍 4 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-24 19:37:51
 */
public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        Solution solution = new CanMakeArithmeticProgressionFromSequence().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length <= 2) {
            return true;
        }
        Arrays.sort(arr);
        int step = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != step) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}