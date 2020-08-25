package leetcode.editor.cn;

//In a given integer array nums, there is always exactly one largest element. 
//
// Find whether the largest element in the array is at least twice as much as ev
//ery other number in the array. 
//
// If it is, return the index of the largest element, otherwise return -1. 
//
// Example 1: 
//
// 
//Input: nums = [3, 6, 1, 0]
//Output: 1
//Explanation: 6 is the largest integer, and for every other number in the array
// x,
//6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
// 
//
// 
//
// Example 2: 
//
// 
//Input: nums = [1, 2, 3, 4]
//Output: -1
//Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
//
// 
//
// 
//
// Note: 
//
// 
// nums will have a length in the range [1, 50]. 
// Every nums[i] will be an integer in the range [0, 99]. 
// 
//
// 
// Related Topics 数组 
// 👍 62 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-13 14:11:47
 */
public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Solution solution = new LargestNumberAtLeastTwiceOfOthers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int dominantIndex(int[] nums) {
        assert nums != null && nums.length > 0 : "The length of nums must be larger than 0";
        if (nums.length == 1) {
            return 0;
        }
        final int DICT_LENGTH = 107;
        int[] dict = new int[DICT_LENGTH];
        Arrays.fill(dict, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] > DICT_LENGTH - 1) {
                throw new IllegalArgumentException("Every nums[i] will be an integer in the range [0, 99]. ");
            }
            dict[nums[i]] = i;
        }

        int first = DICT_LENGTH - 1;
        while (dict[first] == -1) {
            first--;
        }

        int second = first - 1;
        while (dict[second] == -1) {
            second--;
        }

        if (first >= second * 2) {
            return dict[first];
        } else {
            return -1;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}