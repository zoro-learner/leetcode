package leetcode.editor.cn;

//Your are given an array of positive integers nums. 
// Count and print the number of (contiguous) subarrays where the product of all
// the elements in the subarray is less than k. 
//
// Example 1: 
// 
//Input: nums = [10, 5, 2, 6], k = 100
//Output: 8
//Explanation: The 8 subarrays that have product less than 100 are: [10], [5], [
//2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
//Note that [10, 5, 2] is not included as the product of 100 is not strictly les
//s than k.
// 
// 
//
// Note:
// 0 < nums.length <= 50000. 
// 0 < nums[i] < 1000. 
// 0 <= k < 10^6. 
// Related Topics 数组 双指针 
// 👍 185 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author zoro-learner
 * @create 2020-10-28 16:21:32
 */
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        Solution solution = new SubarrayProductLessThanK().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            List<int[]> intervals = getIntervals(nums, k);
            if (intervals.isEmpty()) {
                return 0;
            }
            int count = getNum(intervals.get(0));
            for (int i = 1; i < intervals.size(); i++) {
                count += getNum(intervals.get(i));
                count -= getNum(new int[]{intervals.get(i)[0], intervals.get(i - 1)[1]});
            }
            return count;
        }

        private int getNum(int[] intervals) {
            int n = intervals[1] - intervals[0] + 1;
            if (n <= 0) {
                return 0;
            }
            int res = (n & 1) == 0 ? n / 2 * (n + 1) : (n + 1) / 2 * n;
//            System.out.println(res);
            return res;
        }

        private List<int[]> getIntervals(int[] nums, int k) {
            List<int[]> intervals = new ArrayList<>();
            int head = 0;
            int tail = 0;
            int prod = 1;
            while (tail < nums.length) {
                prod *= nums[tail];
                if (prod >= k) {
                    if (head < tail && prod / nums[tail] < k) {
                        intervals.add(new int[]{head, tail - 1});
                    }
                    while (prod >= k && head < tail) {
                        prod /= nums[head++];
                    }
                }
                tail++;
            }
            if (head < tail && prod < k) {
                intervals.add(new int[]{head, tail - 1});
            }
//        intervals.forEach(t -> System.out.println(Arrays.toString(t)));
            return intervals;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}