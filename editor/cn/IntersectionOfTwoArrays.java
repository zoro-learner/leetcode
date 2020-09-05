package leetcode.editor.cn;

//Given two arrays, write a function to compute their intersection. 
//
// Example 1: 
//
// 
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
// 
//
// 
// Example 2: 
//
// 
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4] 
// 
//
// Note: 
//
// 
// Each element in the result must be unique. 
// The result can be in any order. 
// 
//
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 224 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-31 16:52:00
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);


    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}