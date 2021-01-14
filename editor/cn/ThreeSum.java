package leetcode.editor.cn;

//Given an array nums of n integers, are there elements a, b, c in nums such tha
//t a + b + c = 0? Find all unique triplets in the array which gives the sum of ze
//ro. 
//
// Note: 
//
// The solution set must not contain duplicate triplets. 
//
// Example: 
//
// 
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2534 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-31 16:51:41
 */
public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i + 2 < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                List<int[]> otherTwo = twoSum(nums, i + 1, -nums[i]);
                for (int[] two : otherTwo) {
                    res.add(List.of(nums[i], two[0], two[1]));
                }
            }
            return res;
        }

        private List<int[]> twoSum(int[] nums, int startIdx, int target) {
            List<int[]> res = new ArrayList<>();
            Set<Integer> seen = new HashSet<>();
            int left = startIdx;
            int right = nums.length - 1;
            while (left < right) {
                int total = nums[left] + nums[right];
                if (total < target) {
                    left++;
                } else if (total > target) {
                    right--;
                } else if (!seen.contains(nums[left])) {
                    res.add(new int[]{nums[left], nums[right]});
                    seen.add(nums[left]);
                    left++;
                    right--;
                } else {
                    left++;
                    right--;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}