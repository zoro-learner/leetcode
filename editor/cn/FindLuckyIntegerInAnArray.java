package leetcode.editor.cn;

//Given an array of integers arr, a lucky integer is an integer which has a freq
//uency in the array equal to its value. 
//
// Return a lucky integer in the array. If there are multiple lucky integers ret
//urn the largest of them. If there is no lucky integer return -1. 
//
// 
// Example 1: 
//
// 
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2
//.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
// 
//
// Example 3: 
//
// 
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.
// 
//
// Example 4: 
//
// 
//Input: arr = [5]
//Output: -1
// 
//
// Example 5: 
//
// 
//Input: arr = [7,7,7,7,7,7,7]
//Output: 7
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 500 
// 1 <= arr[i] <= 500 
// Related Topics 数组 
// 👍 14 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-08-24 10:59:46
 */
public class FindLuckyIntegerInAnArray {
    public static void main(String[] args) {
        Solution solution = new FindLuckyIntegerInAnArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int res = -1;
        for (int num : map.keySet()) {
            if (map.get(num) == num) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}