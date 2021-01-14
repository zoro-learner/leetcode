package leetcode.editor.cn;

//Given an array consists of non-negative integers, your task is to count the nu
//mber of triplets chosen from the array that can make triangles if we take them a
//s side lengths of a triangle.
//
// Example 1: 
// 
//Input: [2,2,3,4]
//Output: 3
//Explanation:
//Valid combinations are: 
//2,3,4 (using the first 2)
//2,3,4 (using the second 2)
//2,2,3
// 
// 
//
// Note: 
// 
// The length of the given array won't exceed 1000. 
// The integers in the given array are in the range of [0, 1000]. 
// 
// 
// Related Topics 数组 
// 👍 129 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-27 16:53:17
 */
public class ValidTriangleNumber {
    public static void main(String[] args) {
        Solution solution = new ValidTriangleNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = nums[i];
                int b = nums[j];
                int k = j + 1;
                int idx = findMaxIdx(a + b, nums, k);
                res += idx - k;
            }
        }
        return res;
    }

    private int findMaxIdx(int target, int[] nums, int fromIdx) {
        int left = fromIdx;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}