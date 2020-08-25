package leetcode.editor.cn;

//Given an array of integers arr, replace each element with its rank. 
//
// The rank represents how large the element is. The rank has the following rule
//s: 
//
// 
// Rank is an integer starting from 1. 
// The larger the element, the larger the rank. If two elements are equal, their
// rank must be the same. 
// Rank should be as small as possible. 
// 
//
// 
// Example 1: 
//
// 
//Input: arr = [40,10,20,30]
//Output: [4,1,2,3]
//Explanation: 40 is the largest element. 10 is the smallest. 20 is the second s
//mallest. 30 is the third smallest. 
//
// Example 2: 
//
// 
//Input: arr = [100,100,100]
//Output: [1,1,1]
//Explanation: Same elements share the same rank.
// 
//
// Example 3: 
//
// 
//Input: arr = [37,12,28,9,100,56,80,5,12]
//Output: [5,3,4,2,8,6,7,1,3]
// 
//
// 
// Constraints: 
//
// 
// 0 <= arr.length <= 105 
// -109 <= arr[i] <= 109 
// Related Topics 数组 
// 👍 30 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-19 19:43:02
 */
public class RankTransformOfAnArray {
    public static void main(String[] args) {
        Solution solution = new RankTransformOfAnArray().new Solution();
        int[] arr = new int[]{2, 1, 3};
        System.out.println(Arrays.toString(solution.arrayRankTransform(arr)));
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}