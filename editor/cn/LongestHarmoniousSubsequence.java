package leetcode.editor.cn;

//We define a harmounious array as an array where the difference between its max
//imum value and its minimum value is exactly 1. 
//
// Now, given an integer array, you need to find the length of its longest harmo
//nious subsequence among all its possible subsequences. 
//
// Example 1: 
//
// 
//Input: [1,3,2,2,5,2,3,7]
//Output: 5
//Explanation: The longest harmonious subsequence is [3,2,2,2,3].
// 
//
// 
//
// Note: The length of the input array will not exceed 20,000. 
// Related Topics 哈希表 
// 👍 119 👎 0


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author zoro-learner
 * @create 2020-09-04 09:35:01
 */
public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        Solution solution = new LongestHarmoniousSubsequence().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(i -> 1)));
        int res = 0;
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                int len = map.get(num) + map.get(num + 1);
                res = Math.max(res, len);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}