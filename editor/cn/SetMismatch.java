package leetcode.editor.cn;

//
//The set S originally contains numbers from 1 to n. But unfortunately, due to t
//he data error, one of the numbers in the set got duplicated to another number in
// the set, which results in repetition of one number and loss of another number. 
//
// 
//
// 
//Given an array nums representing the data status of this set after the error. 
//Your task is to firstly find the number occurs twice and then find the number th
//at is missing. Return them in the form of an array.
// 
//
//
// Example 1: 
// 
//Input: nums = [1,2,2,4]
//Output: [2,3]
// 
// 
//
// Note: 
// 
// The given array size will in the range [2, 10000]. 
// The given array's numbers won't have any order. 
// 
// Related Topics 哈希表 数学 
// 👍 117 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-04 10:58:33
 */
public class SetMismatch {
    public static void main(String[] args) {
        Solution solution = new SetMismatch().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] counts = new int[nums.length];
        for (int num : nums) {
            counts[num - 1]++;
        }
        int duplicateNum = -1;
        int missingNum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (counts[i] == 2) {
                duplicateNum = i + 1;
            } else if (counts[i] == 0) {
                missingNum = i + 1;
            }
        }
        return new int[]{duplicateNum, missingNum};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}