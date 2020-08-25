package leetcode.editor.cn;

//Given an integer n, return any array containing n unique integers such that th
//ey add up to 0. 
//
// 
// Example 1: 
//
// 
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: [-1,0,1]
// 
//
// Example 3: 
//
// 
//Input: n = 1
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// Related Topics 数组 
// 👍 32 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-22 14:32:40
 */
public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        Solution solution = new FindNUniqueIntegersSumUpToZero().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n - 1; i++) {
            res[i] = i;
        }
        res[n - 1] = - (n - 2) * (n - 1) / 2;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}