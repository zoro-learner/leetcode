package leetcode.editor.cn;

//Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements ap
//pear twice and others appear once. 
//
// Find all the elements that appear twice in this array. 
//
// Could you do it without extra space and in O(n) runtime? 
// 
// Example: 
// 
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[2,3]
// Related Topics 数组 
// 👍 289 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-26 19:42:28
 */
public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        Solution solution = new FindAllDuplicatesInAnArray().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = -nums[i];
        }
//        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            nums[idx] = -nums[idx];
        }
//        System.out.println(Arrays.toString(nums));
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}