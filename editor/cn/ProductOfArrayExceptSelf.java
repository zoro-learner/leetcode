package leetcode.editor.cn;

//Given an array nums of n integers where n > 1, return an array output such tha
//t output[i] is equal to the product of all the elements of nums except nums[i]. 
//
//
// Example: 
//
// 
//Input:  [1,2,3,4]
//Output: [24,12,8,6]
// 
//
// Constraint: It's guaranteed that the product of the elements of any prefix or
// suffix of the array (including the whole array) fits in a 32 bit integer. 
//
// Note: Please solve it without division and in O(n). 
//
// Follow up: 
//Could you solve it with constant space complexity? (The output array does not 
//count as extra space for the purpose of space complexity analysis.) 
// Related Topics 数组 
// 👍 624 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-26 18:41:28
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new ProductOfArrayExceptSelf().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                prod *= num;
            }
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                res[i] = 0;
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    res[i] = prod;
                } else {
                    res[i] = 0;
                }
            } else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}