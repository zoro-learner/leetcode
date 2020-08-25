package leetcode.editor.cn;

//Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all ele
//ments in arr2 are also in arr1. 
//
// Sort the elements of arr1 such that the relative ordering of items in arr1 ar
//e the same as in arr2. Elements that don't appear in arr2 should be placed at th
//e end of arr1 in ascending order. 
//
// 
// Example 1: 
// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//Output: [2,2,2,1,4,3,3,9,6,7,19]
// 
// 
// Constraints: 
//
// 
// arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// Each arr2[i] is distinct. 
// Each arr2[i] is in arr1. 
// 
// Related Topics 排序 数组 
// 👍 75 👎 0


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-19 16:42:13
 */
public class RelativeSortArray {
    public static void main(String[] args) {
        Solution solution = new RelativeSortArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, 1 + map.getOrDefault(num, 0));
        }
        int[] res = new int[arr1.length];
        int idx = 0;
        for (int num : arr2) {
            for (int i = 0; i < map.getOrDefault(num, 0); i++) {
                res[idx++] = num;
            }
            map.put(num, 0);
        }
        List<Integer> restNums = map.keySet().stream().filter(t -> map.get(t) > 0).sorted().collect(Collectors.toList());
        for (int num : restNums) {
            for (int i = 0; i < map.getOrDefault(num, 0); i++) {
                res[idx++] = num;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}