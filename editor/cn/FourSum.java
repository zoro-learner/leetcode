package leetcode.editor.cn;

//Given an array nums of n integers and an integer target, are there elements a,
// b, c, and d in nums such that a + b + c + d = target? Find all unique quadruple
//ts in the array which gives the sum of target. 
//
// Note: 
//
// The solution set must not contain duplicate quadruplets. 
//
// Example: 
//
// 
//Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
//
//A solution set is:
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针 
// 👍 553 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-02 08:16:24
 */
public class FourSum {
    public static void main(String[] args) {
        Solution solution = new FourSum().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for (int first = 0; first + 3 < len; first++) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            for (int second = first + 1; second + 2 < len; second++) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                int fourth = len - 1;
                for (int third = second + 1; third + 1 < len; third++) {
                    if (third > second + 1 && nums[third] == nums[third - 1]) {
                        continue;
                    }
                    while (third < fourth) {
                        int sum = nums[first] + nums[second] + nums[third] + nums[fourth];
                        if (sum == target) {
                            res.add(List.of(nums[first], nums[second], nums[third], nums[fourth]));
                            break;
                        } else if (sum > target) {
                            fourth--;
                        } else {
                            break;
                        }
                    }
                }

            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}