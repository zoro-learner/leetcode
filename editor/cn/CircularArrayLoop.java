package leetcode.editor.cn;

//You are given a circular array nums of positive and negative integers. If a nu
//mber k at an index is positive, then move forward k steps. Conversely, if it's n
//egative (-k), move backward k steps. Since the array is circular, you may assume
// that the last element's next element is the first element, and the first elemen
//t's previous element is the last element. 
//
// Determine if there is a loop (or a cycle) in nums. A cycle must start and end
// at the same index and the cycle's length > 1. Furthermore, movements in a cycle
// must all follow a single direction. In other words, a cycle must not consist of
// both forward and backward movements. 
//
// 
//
// Example 1: 
//
// 
//Input: [2,-1,1,2,2]
//Output: true
//Explanation: There is a cycle, from index 0 -> 2 -> 3 -> 0. The cycle's length
// is 3.
// 
//
// Example 2: 
//
// 
//Input: [-1,2]
//Output: false
//Explanation: The movement from index 1 -> 1 -> 1 ... is not a cycle, because t
//he cycle's length is 1. By definition the cycle's length must be greater than 1.
//
// 
//
// Example 3: 
//
// 
//Input: [-2,1,-1,-2,-2]
//Output: false
//Explanation: The movement from index 1 -> 2 -> 1 -> ... is not a cycle, becaus
//e movement from index 1 -> 2 is a forward movement, but movement from index 2 ->
// 1 is a backward movement. All movements in a cycle must follow a single directi
//on. 
//
// 
//
// Note: 
//
// 
// -1000 ≤ nums[i] ≤ 1000 
// nums[i] ≠ 0 
// 1 ≤ nums.length ≤ 5000 
// 
//
// 
//
// Follow up: 
//
// Could you solve it in O(n) time complexity and O(1) extra space complexity? R
//elated Topics 数组 双指针 
// 👍 63 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-10-27 10:58:07
 */
public class CircularArrayLoop {
    public static void main(String[] args) {
        Solution solution = new CircularArrayLoop().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int[] next = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            next[i] = getNextIndex(nums, i);
        }
        for (int i = 0; i < nums.length; i++) {
            int curr = i;
            boolean isPositive = nums[curr] > 0;
            Set<Integer> circle = new HashSet<>();
            while (!circle.contains(curr)) {
                if ((nums[curr] > 0 && !isPositive)
                    || (nums[curr] < 0 && isPositive)) {
                    break;
                }
                circle.add(curr);
                curr = next[curr];
            }
            if (circle.contains(curr) && curr != next[curr]) {
                return true;
            }
        }
        return false;
    }

    private int getNextIndex(int[] nums, int curr) {
        int n = nums.length;
        if (nums[curr] < 0) {
            curr = (curr + (nums[curr] % n) + n) % n;
        } else {
            curr = (curr + nums[curr]) % n;
        }
        return curr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}