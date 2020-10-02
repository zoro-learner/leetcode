package leetcode.editor.cn;

//Given an integer array nums, find the sum of the elements between indices i an
//d j (i ≤ j), inclusive. 
//
// Example: 
//
// 
//Given nums = [-2, 0, 3, -5, 2, -1]
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
// 
//
// 
// Constraints: 
//
// 
// You may assume that the array does not change. 
// There are many calls to sumRange function. 
// 0 <= nums.length <= 10^4 
// -10^5 <= nums[i] <= 10^5 
// 0 <= i <= j < nums.length 
// 
// Related Topics 动态规划 
// 👍 190 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-22 19:10:13
 */
public class RangeSumQueryImmutable {
    public static void main(String[] args) {
        Solution solution = new RangeSumQueryImmutable().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class NumArray {

    private int[] sumArray;

    public NumArray(int[] nums) {
        sumArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumArray[i] = sum;
        }
    }
    
    public int sumRange(int i, int j) {
        if (i < 0 || j >= sumArray.length) {
            throw new IllegalArgumentException("Not valid params");
        }
        if (i == 0) {
            return sumArray[j];
        }
        return sumArray[j] - sumArray[i - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//leetcode submit region end(Prohibit modification and deletion)

    
}