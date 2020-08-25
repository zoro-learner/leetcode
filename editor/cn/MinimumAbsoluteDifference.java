package leetcode.editor.cn;

//Given an array of distinct integers arr, find all pairs of elements with the m
//inimum absolute difference of any two elements. 
//
// Return a list of pairs in ascending order(with respect to pairs), each pair [
//a, b] follows 
//
// 
// a, b are from arr 
// a < b 
// b - a equals to the minimum absolute difference of any two elements in arr 
// 
//
// 
// Example 1: 
//
// 
//Input: arr = [4,2,1,3]
//Output: [[1,2],[2,3],[3,4]]
//Explanation: The minimum absolute difference is 1. List all pairs with differe
//nce equal to 1 in ascending order. 
//
// Example 2: 
//
// 
//Input: arr = [1,3,6,10,15]
//Output: [[1,3]]
// 
//
// Example 3: 
//
// 
//Input: arr = [3,8,-10,23,19,-4,-14,27]
//Output: [[-14,-10],[19,23],[23,27]]
// 
//
// 
// Constraints: 
//
// 
// 2 <= arr.length <= 10^5 
// -10^6 <= arr[i] <= 10^6 
// 
// Related Topics 数组 
// 👍 32 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-21 09:50:25
 */
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        Solution solution = new MinimumAbsoluteDifference().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff <= minDiff) {
                minDiff = diff;
                List<List<Integer>> list = map.getOrDefault(diff, new ArrayList<>());
                list.add(Arrays.asList(arr[i], arr[i + 1]));
                map.put(diff, list);
//                if (map.containsKey(diff)) {
//                    map.get(diff).add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
//                } else {
//                    List<List<Integer>> list = new ArrayList<>();
//                    list.add(new ArrayList<>(Arrays.asList(arr[i], arr[i + 1])));
//                    map.put(diff, list);
//                }
            }
        }
        return map.get(minDiff);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}