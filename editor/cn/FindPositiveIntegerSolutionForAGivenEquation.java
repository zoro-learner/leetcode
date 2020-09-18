package leetcode.editor.cn;

//Given a function f(x, y) and a value z, return all positive integer pairs x an
//d y where f(x,y) == z. 
//
// The function is constantly increasing, i.e.: 
//
// 
// f(x, y) < f(x + 1, y) 
// f(x, y) < f(x, y + 1) 
// 
//
// The function interface is defined like this: 
//
// 
//interface CustomFunction {
//public:
//  // Returns positive integer f(x, y) for any given positive integer x and y.
//  int f(int x, int y);
//};
// 
//
// For custom testing purposes you're given an integer function_id and a target 
//z as input, where function_id represent one function from an secret internal lis
//t, on the examples you'll know only two functions from the list. 
//
// You may return the solutions in any order. 
//
// 
// Example 1: 
//
// 
//Input: function_id = 1, z = 5
//Output: [[1,4],[2,3],[3,2],[4,1]]
//Explanation: function_id = 1 means that f(x, y) = x + y 
//
// Example 2: 
//
// 
//Input: function_id = 2, z = 5
//Output: [[1,5],[5,1]]
//Explanation: function_id = 2 means that f(x, y) = x * y
// 
//
// 
// Constraints: 
//
// 
// 1 <= function_id <= 9 
// 1 <= z <= 100 
// It's guaranteed that the solutions of f(x, y) == z will be on the range 1 <= 
//x, y <= 1000 
// It's also guaranteed that f(x, y) will fit in 32 bit signed integer if 1 <= x
//, y <= 1000 
// 
// Related Topics 数学 二分查找 
// 👍 32 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-10 08:32:48
 */
public class FindPositiveIntegerSolutionForAGivenEquation {
    public static void main(String[] args) {
        Solution solution = new FindPositiveIntegerSolutionForAGivenEquation().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> res = new ArrayList<>();

        int head = 1;
        int tail = 1000;
        for (int x = 1; x <= 1000; x++) {
            while (head < tail) {
                int y = (head + tail) / 2;
                if (customfunction.f(x, y) == z) {
                    res.add(Arrays.asList(x, y));
                    break;
                } else if (customfunction.f(x, y) < z) {
                    head++;
                } else {
                    tail--;
                }
            }
            head = 1;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}