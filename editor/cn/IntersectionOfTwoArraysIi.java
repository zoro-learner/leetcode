package leetcode.editor.cn;

//Given two arrays, write a function to compute their intersection. 
//
// Example 1: 
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
// 
//
// 
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [4,9] 
// 
//
// Note: 
//
// 
// Each element in the result should appear as many times as it shows in both ar
//rays. 
// The result can be in any order. 
// 
//
// Follow up: 
//
// 
// What if the given array is already sorted? How would you optimize your algori
//thm? 
// What if nums1's size is small compared to nums2's size? Which algorithm is be
//tter? 
// What if elements of nums2 are stored on disk, and the memory is limited such 
//that you cannot load all elements into the memory at once? 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 384 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-31 19:43:34
 */
public class IntersectionOfTwoArraysIi {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArraysIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = getMap(nums1);
        Map<Integer, Integer> map2 = getMap(nums2);
        List<Integer> res = new ArrayList<>();
        for (Integer num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int k = Math.min(map1.get(num), map2.get(num));
                while (k-- > 0) {
                    res.add(num);
                }
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private Map<Integer, Integer> getMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}