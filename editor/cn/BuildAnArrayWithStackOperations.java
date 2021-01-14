package leetcode.editor.cn;

//Given an array target and an integer n. In each iteration, you will read a num
//ber from list = {1,2,3..., n}. 
//
// Build the target array using the following operations: 
//
// 
// Push: Read a new element from the beginning list, and push it in the array. 
// Pop: delete the last element of the array. 
// If the target array is already built, stop reading more elements. 
// 
//
// You are guaranteed that the target array is strictly increasing, only contain
//ing numbers between 1 to n inclusive. 
//
// Return the operations to build the target array. 
//
// You are guaranteed that the answer is unique. 
//
// 
// Example 1: 
//
// 
//Input: target = [1,3], n = 3
//Output: ["Push","Push","Pop","Push"]
//Explanation: 
//Read number 1 and automatically push in the array -> [1]
//Read number 2 and automatically push in the array then Pop it -> [1]
//Read number 3 and automatically push in the array -> [1,3]
// 
//
// Example 2: 
//
// 
//Input: target = [1,2,3], n = 3
//Output: ["Push","Push","Push"]
// 
//
// Example 3: 
//
// 
//Input: target = [1,2], n = 4
//Output: ["Push","Push"]
//Explanation: You only need to read the first 2 numbers and stop.
// 
//
// Example 4: 
//
// 
//Input: target = [2,3,4], n = 4
//Output: ["Push","Pop","Push","Push","Push"]
// 
//
// 
// Constraints: 
//
// 
// 1 <= target.length <= 100 
// 1 <= target[i] <= 100 
// 1 <= n <= 100 
// target is strictly increasing. 
// 
// Related Topics 栈 
// 👍 11 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-03 17:22:53
 */
public class BuildAnArrayWithStackOperations {
    public static void main(String[] args) {
        Solution solution = new BuildAnArrayWithStackOperations().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int pos = 0;
        for (int i = 1; i <= n && pos < target.length; i++) {
            res.add("Push");
            if (target[pos] != i) {
                res.add("Pop");
            } else {
                pos++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}