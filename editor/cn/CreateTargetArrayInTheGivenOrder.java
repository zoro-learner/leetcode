package leetcode.editor.cn;

//Given two arrays of integers nums and index. Your task is to create target arr
//ay under the following rules: 
//
// 
// Initially target array is empty. 
// From left to right read nums[i] and index[i], insert at index index[i] the va
//lue nums[i] in target array. 
// Repeat the previous step until there are no elements to read in nums and inde
//x. 
// 
//
// Return the target array. 
//
// It is guaranteed that the insertion operations will be valid. 
//
// 
// Example 1: 
//
// 
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
//Output: [0,1,2,3,4]
//Explanation:
//nums       index     target
//1            0        [1]
//2            1        [1,2]
//3            2        [1,2,3]
//4            3        [1,2,3,4]
//0            0        [0,1,2,3,4]
// 
//
// Example 3: 
//
// 
//Input: nums = [1], index = [0]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length, index.length <= 100 
// nums.length == index.length 
// 0 <= nums[i] <= 100 
// 0 <= index[i] <= i 
// 
// Related Topics 数组 
// 👍 16 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-24 11:06:28
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        Solution solution = new CreateTargetArrayInTheGivenOrder().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            res.add(index[i], nums[i]);
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}