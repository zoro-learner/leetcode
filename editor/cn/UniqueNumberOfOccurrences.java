package leetcode.editor.cn;

//Given an array of integers arr, write a function that returns true if and only
// if the number of occurrences of each value in the array is unique. 
//
// 
// Example 1: 
//
// 
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values
// have the same number of occurrences. 
//
// Example 2: 
//
// 
//Input: arr = [1,2]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// -1000 <= arr[i] <= 1000 
// 
// Related Topics 哈希表 
// 👍 44 👎 0


import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-09-04 20:10:29
 */
public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Solution solution = new UniqueNumberOfOccurrences().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(t -> 1)));
        Set<Integer> set = new HashSet<>();
        for (Integer count : counts.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}