package leetcode.editor.cn;

//Given an array of positive integers nums, remove the smallest subarray (possib
//ly empty) such that the sum of the remaining elements is divisible by p. It is n
//ot allowed to remove the whole array. 
//
// Return the length of the smallest subarray that you need to remove, or -1 if 
//it's impossible. 
//
// A subarray is defined as a contiguous block of elements in the array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,1,4,2], p = 6
//Output: 1
//Explanation: The sum of the elements in nums is 10, which is not divisible by 
//6. We can remove the subarray [4], and the sum of the remaining elements is 6, w
//hich is divisible by 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [6,3,5,2], p = 9
//Output: 2
//Explanation: We cannot remove a single element to get a sum divisible by 9. Th
//e best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3], p = 3
//Output: 0
//Explanation: Here the sum is 6. which is already divisible by 3. Thus we do no
//t need to remove anything.
// 
//
// Example 4: 
//
// 
//Input: nums = [1,2,3], p = 7
//Output: -1
//Explanation: There is no way to remove a subarray in order to get a sum divisi
//ble by 7.
// 
//
// Example 5: 
//
// 
//Input: nums = [1000000000,1000000000,1000000000], p = 3
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 105 
// 1 <= nums[i] <= 109 
// 1 <= p <= 109 
// Related Topics 数组 哈希表 数学 二分查找 
// 👍 15 👎 0


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-11-08 16:22:32
 */
public class MakeSumDivisibleByP {
    public static void main(String[] args) {
        Solution solution = new MakeSumDivisibleByP().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // (sum - remove) % p == 0
    // sum = p * k + remove
    // remove = sum - p * k
    // [6, 3, 5, 2] -> 7
    public int minSubarray(int[] nums, int p) {
        int[] mods = Arrays.stream(nums)
            .map(t -> t % p)
            .toArray();

        int total = Arrays.stream(mods).sum();
        int target = total % p;
        if (target == 0) {
            return 0;
        }
        int[] sums = getSumsArray(mods);
        for (int n = 1; n < mods.length; n++) {
            for (int k = 0; k + n <= mods.length; k++) {
                int sum = sums[n + k] - sums[k];
                if (sum % p == target) {
                    return n;
                }
            }
        }
        return -1;
    }

    private int[] getSumsArray(int[] nums) {
        int[] sums = new int[nums.length + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i + 1] = sum;
        }
        return sums;
    }

    private Set<Long> getRemoveSumSet(int[] nums, int n) {
        Set<Long> set = new HashSet<>();
        long sum = 0;
        for (int k = 0; k < n; k++) {
            sum += nums[k];
        }
        set.add(sum);
        for (int k = 0; k + n < nums.length; k++) {
            sum += nums[n + k] - nums[k];
            set.add(sum);
        }
        return set;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}