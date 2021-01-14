package leetcode.editor.cn;

//Implement next permutation, which rearranges numbers into the lexicographicall
//y next greater permutation of numbers. 
//
// If such an arrangement is not possible, it must rearrange it as the lowest po
//ssible order (i.e., sorted in ascending order). 
//
// The replacement must be in place and use only constant extra memory. 
//
// 
// Example 1: 
// Input: nums = [1,2,3]
//Output: [1,3,2]
// Example 2: 
// Input: nums = [3,2,1]
//Output: [1,2,3]
// Example 3: 
// Input: nums = [1,1,5]
//Output: [1,5,1]
// Example 4: 
// Input: nums = [1]
//Output: [1]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 100 
// 
// Related Topics 数组 
// 👍 684 👎 0



/**
 * @author zoro-learner
 * @create 2020-10-09 11:23:48
 */
public class NextPermutation {
    public static void main(String[] args) {
        Solution solution = new NextPermutation().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // 12345 --> 12354 --> 12435 --> 12453 -->
    // 12534 --> 12543 --> 13245 --> 13254 -->
    // 13425 --> 13452 --> 13542 -->
    public void nextPermutation(int[] nums) {
        int tail = nums.length - 1;
        while (tail > 0 && nums[tail - 1] >= nums[tail]) {
            tail--;
        }

        if (tail == 0) {
            reverse(nums, 0, nums.length);
            return ;
        }

        int head = tail - 1;
        int maxIdx = nums.length - 1;
        while (maxIdx > head && nums[maxIdx] <= nums[head]) {
            maxIdx--;
        }
        swap(nums, head, maxIdx);
        reverse(nums, head + 1, nums.length);
    }

    private void reverse(int[] nums, int fromIdx, int toIdx) {
        if (fromIdx < 0 || toIdx > nums.length) {
            throw new IllegalArgumentException("No sol");
        }
        int left = fromIdx;
        int right = toIdx - 1;
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    private void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}