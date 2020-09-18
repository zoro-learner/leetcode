package leetcode.editor.cn;

//You have a total of n coins that you want to form in a staircase shape, where 
//every k-th row must have exactly k coins. 
// 
// Given n, find the total number of full staircase rows that can be formed. 
//
// n is a non-negative integer and fits within the range of a 32-bit signed inte
//ger. 
//
// Example 1:
// 
//n = 5
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤
//
//Because the 3rd row is incomplete, we return 2.
// 
// 
//
// Example 2:
// 
//n = 8
//
//The coins can form the following rows:
//¤
//¤ ¤
//¤ ¤ ¤
//¤ ¤
//
//Because the 4th row is incomplete, we return 3.
// 
// Related Topics 数学 二分查找 
// 👍 73 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-09 08:21:40
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        Solution solution = new ArrangingCoins().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrangeCoins(int n) {
        int k = 1;
        while (n >= k) {
            n -= k;
            k++;
        }
        return k - 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}