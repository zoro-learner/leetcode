package leetcode.editor.cn;

//
//Given an array of integers and an integer k, you need to find the number of un
//ique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair
// (i, j), where i and j are both numbers in the array and their absolute differen
//ce is k.
// 
//
//
// Example 1: 
// 
//Input: [3, 1, 4, 1, 5], k = 2
//Output: 2
//Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5). Altho
//ugh we have two 1s in the input, we should only return the number of unique pair
//s.
// 
// 
//
// Example 2: 
// 
//Input:[1, 2, 3, 4, 5], k = 1
//Output: 4
//Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) 
//and (4, 5).
// 
// 
//
// Example 3: 
// 
//Input: [1, 3, 1, 5, 4], k = 0
//Output: 1
//Explanation: There is one 0-diff pair in the array, (1, 1).
// 
// 
//
// Note: 
// 
// The pairs (i, j) and (j, i) count as the same pair. 
// The length of the array won't exceed 10,000. 
// All the integers in the given input belong to the range: [-1e7, 1e7]. 
// 
// Related Topics 数组 双指针 
// 👍 88 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-11 08:34:17
 */
public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        Solution solution = new KDiffPairsInAnArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int count = 0;
        if (k == 0) {
            for (int num : map.keySet()) {
                if (map.get(num) > 1) {
                    count++;
                }
            }
        } else {
            for (int num : map.keySet()) {
                int other = k + num;
                if (map.containsKey(other)) {
                    count++;
                }
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}