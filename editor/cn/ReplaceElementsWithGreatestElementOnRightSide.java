package leetcode.editor.cn;

//Given an array arr, replace every element in that array with the greatest elem
//ent among the elements to its right, and replace the last element with -1. 
//
// After doing so, return the array. 
//
// 
// Example 1: 
// Input: arr = [17,18,5,4,6,1]
//Output: [18,6,6,6,1,-1]
// 
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 10^4 
// 1 <= arr[i] <= 10^5 
// Related Topics 数组 
// 👍 41 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-19 19:27:14
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Solution solution = new ReplaceElementsWithGreatestElementOnRightSide().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        res[len - 1] = -1;
        int maxNum = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            res[i] = maxNum;
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}