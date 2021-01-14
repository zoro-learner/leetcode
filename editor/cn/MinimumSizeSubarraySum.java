package leetcode.editor.cn;

//Given an array of n positive integers and a positive integer s, find the minim
//al length of a contiguous subarray of which the sum ≥ s. If there isn't one, ret
//urn 0 instead. 
//
// Example: 
//
// 
//Input: s = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: the subarray [4,3] has the minimal length under the problem const
//raint. 
//
// Follow up: 
//
// If you have figured out the O(n) solution, try coding another solution of whi
//ch the time complexity is O(n log n). 
// Related Topics 数组 双指针 二分查找 
// 👍 476 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-24 10:00:56
 */
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution solution = new MinimumSizeSubarraySum().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int[] sums;

    public int minSubArrayLen(int s, int[] nums) {
        sums = sumInit(nums);
        int res = nums.length + 1;
        for (int fromIdx = 0; fromIdx < nums.length; fromIdx++) {
            int minIdx = findMinIdx(s, fromIdx, nums.length);
            if (getSum(fromIdx, minIdx) >= s) {
                res = Math.min(res, minIdx - fromIdx);
            }
        }
        return res <= nums.length ? res : 0;
    }

    private int findMinIdx(int s, int fromIdx, int toIdx) {
        int left = fromIdx;
        int right = toIdx;
//        System.out.println(fromIdx);
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = getSum(fromIdx, mid);
//            System.out.println(" | " + left + " " + right + " " + sum);
            if (sum >= s) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
//        System.out.println("  | " + left);
        return left;
    }

    private int getSum(int fromIdx, int toIdx) {
        if (fromIdx < 0) {
            fromIdx = 0;
        }
        if (toIdx >= sums.length) {
            toIdx = sums.length - 1;
        }

        return sums[toIdx] - sums[fromIdx];
    }

    private int[] sumInit(int[] nums) {
        sums = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i + 1] = sum;
        }
        return sums;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

    
}