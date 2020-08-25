package leetcode.editor.cn;

//Given an array arr of positive integers sorted in a strictly increasing order,
// and an integer k. 
//
// Find the kth positive integer that is missing from this array. 
//
// 
// Example 1: 
//
// 
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5
//th missing positive integer is 9.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing po
//sitive integer is 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// 1 <= arr[i] <= 1000 
// 1 <= k <= 1000 
// arr[i] < arr[j] for 1 <= i < j <= arr.length 
// Related Topics 数组 哈希表 
// 👍 6 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-25 08:52:32
 */
public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        Solution solution = new KthMissingPositiveNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        final int RANGE = 2007;
        int[] dict = new int[RANGE];
        for (int num : arr) {
            dict[num] = 1;
        }
        int idx = 1;
        while (idx < RANGE && k > 0) {
            if (dict[idx] == 0) {
                k--;
            }
            idx++;
        }
        return idx - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}