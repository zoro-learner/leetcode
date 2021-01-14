package leetcode.editor.cn;

//Given an array nums of n integers and an integer target, find three integers i
//n nums such that the sum is closest to target. Return the sum of the three integ
//ers. You may assume that each input would have exactly one solution. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// 
//
// 
// Constraints: 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 双指针 
// 👍 591 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-10-08 18:16:28
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        assert nums != null && nums.length >= 3;
        Arrays.sort(nums);
        int minDistance = Integer.MAX_VALUE;
        int n = nums.length;
        int res = 0;
        for (int first = 0; first + 2 < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = n - 1;
            for (int second = first + 1; second + 1 < n; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third) {
                    int sum = nums[first] + nums[second] + nums[third];
//                    System.out.println(first + " " + second + " " + third + " " + sum);
                    if (sum == target) {
                        return target;
                    }

                    if (Math.abs(sum - target) < minDistance) {
                        res = sum;
                        minDistance = Math.abs(sum - target);
                    }

                    if (sum > target) {
                        third--;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}