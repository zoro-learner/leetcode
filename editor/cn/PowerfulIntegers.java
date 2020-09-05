package leetcode.editor.cn;

//Given two positive integers x and y, an integer is powerful if it is equal to 
//x^i + y^j for some integers i >= 0 and j >= 0. 
//
// Return a list of all powerful integers that have value less than or equal to 
//bound. 
//
// You may return the answer in any order. In your answer, each value should occ
//ur at most once. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: x = 2, y = 3, bound = 10
//Output: [2,3,4,5,7,9,10]
//Explanation: 
//2 = 2^0 + 3^0
//3 = 2^1 + 3^0
//4 = 2^0 + 3^1
//5 = 2^1 + 3^1
//7 = 2^2 + 3^1
//9 = 2^3 + 3^0
//10 = 2^0 + 3^2
// 
//
// 
// Example 2: 
//
// 
//Input: x = 3, y = 5, bound = 15
//Output: [2,4,6,8,10,14]
// 
// 
// 
//
// 
//
// Note: 
//
// 
// 1 <= x <= 100 
// 1 <= y <= 100 
// 0 <= bound <= 10^6 
// Related Topics 哈希表 数学 
// 👍 43 👎 0


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-09-04 20:10:39
 */
public class PowerfulIntegers {
    public static void main(String[] args) {
        Solution solution = new PowerfulIntegers().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> res = new HashSet<>();
        int powX = 1;
        for (int i = 0; ; i++) {
            if (i > 0) {
                powX *= x;
            }
            if (powX > bound) {
                break;
            }
            int powY = 1;
            for (int j = 0; ; j++) {
                if (j > 0) {
                    powY *= y;
                }
                int sum = powX + powY;
                if (sum > bound) {
                    break;
                }
                res.add(sum);
                if (y <= 1) {
                    break;
                }
            }
            if (x <= 1) {
                break;
            }
        }
        return new ArrayList<>(res);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}