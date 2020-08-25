package leetcode.editor.cn;

//For a non-negative integer X, the array-form of X is an array of its digits in
// left to right order. For example, if X = 1231, then the array form is [1,2,3,1]
//. 
//
// Given the array-form A of a non-negative integer X, return the array-form of 
//the integer X+K. 
//
// 
//
// 
// 
//
// 
// Example 1: 
//
// 
//Input: A = [1,2,0,0], K = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
// 
//
// 
// Example 2: 
//
// 
//Input: A = [2,7,4], K = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
// 
//
// 
// Example 3: 
//
// 
//Input: A = [2,1,5], K = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021
// 
//
// 
// Example 4: 
//
// 
//Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
//Output: [1,0,0,0,0,0,0,0,0,0,0]
//Explanation: 9999999999 + 1 = 10000000000
// 
//
// 
//
// Note： 
//
// 
// 1 <= A.length <= 10000 
// 0 <= A[i] <= 9 
// 0 <= K <= 10000 
// If A.length > 1, then A[0] != 0 
// 
// 
// 
// 
// Related Topics 数组 
// 👍 68 👎 0


import java.util.*;

/**
 * @author zoro-learner
 * @create 2020-08-18 16:05:25
 */
public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        Solution solution = new AddToArrayFormOfInteger().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int[] B = numToArray(K);
        int aIdx = A.length - 1;
        int bIdx = B.length - 1;
        int carry = 0;
        List<Integer> res = new LinkedList<>();
        while (aIdx >= 0 || bIdx >= 0) {
            int a = aIdx >= 0 ? A[aIdx--] : 0;
            int b = bIdx >= 0 ? B[bIdx--] : 0;
            int sum = a + b + carry;
            res.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            res.add(carry);
        }
        Collections.reverse(res);
        return res;
    }

    private int[] numToArray(int num) {
        int cnt = 0;
        int tmp = num;
        while (tmp > 0) {
            tmp /= 10;
            cnt++;
        }
        if (num == 0) {
            cnt = 1;
        }

        int[] res = new int[cnt];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = num % 10;
            num /= 10;
        }
        return res;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

    
}