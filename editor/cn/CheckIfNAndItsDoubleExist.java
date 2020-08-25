package leetcode.editor.cn;

//Given an array arr of integers, check if there exists two integers N and M suc
//h that N is the double of M ( i.e. N = 2 * M). 
//
// More formally check if there exists two indices i and j such that : 
//
// 
// i != j 
// 0 <= i, j < arr.length 
// arr[i] == 2 * arr[j] 
// 
//
// 
// Example 1: 
//
// 
//Input: arr = [10,2,5,3]
//Output: true
//Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
// 
//
// Example 2: 
//
// 
//Input: arr = [7,1,14,11]
//Output: true
//Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
// 
//
// Example 3: 
//
// 
//Input: arr = [3,1,7,11]
//Output: false
//Explanation: In this case does not exist N and M, such that N = 2 * M.
// 
//
// 
// Constraints: 
//
// 
// 2 <= arr.length <= 500 
// -10^3 <= arr[i] <= 10^3 
// 
// Related Topics 数组 
// 👍 23 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-22 15:44:08
 */
public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        Solution solution = new CheckIfNAndItsDoubleExist().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (num == 0 && map.get(num) > 1) {
                return true;
            } else if (num != 0 && map.containsKey(num * 2)){
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}