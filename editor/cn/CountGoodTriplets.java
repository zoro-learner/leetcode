package leetcode.editor.cn;

//Given an array of integers arr, and three integers a, b and c. You need to fin
//d the number of good triplets. 
//
// A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are tr
//ue: 
//
// 
// 0 <= i < j < k < arr.length 
// |arr[i] - arr[j]| <= a 
// |arr[j] - arr[k]| <= b 
// |arr[i] - arr[k]| <= c 
// 
//
// Where |x| denotes the absolute value of x. 
//
// Return the number of good triplets. 
//
// 
// Example 1: 
//
// 
//Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
//Output: 4
//Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
// 
//
// Example 2: 
//
// 
//Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
//Output: 0
//Explanation: No triplet satisfies all conditions.
// 
//
// 
// Constraints: 
//
// 
// 3 <= arr.length <= 100 
// 0 <= arr[i] <= 1000 
// 0 <= a, b, c <= 1000 
// Related Topics 数组 
// 👍 3 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-24 19:36:58
 */
public class CountGoodTriplets {
    public static void main(String[] args) {
        Solution solution = new CountGoodTriplets().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (isGood(arr, i, j, a) && isGood(arr, j, k, b) && isGood(arr, i, k, c)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private boolean isGood(int[] arr, int i, int j, int a) {
        return Math.abs(arr[i] - arr[j]) <= a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}