package leetcode.editor.cn;

//
//Given two integers n and k, you need to construct a list which contains n diff
//erent positive integers ranging from 1 to n and obeys the following requirement:
// 
//
//Suppose this list is [a1, a2, a3, ... , an], then the list [|a1 - a2|, |a2 - a
//3|, |a3 - a4|, ... , |an-1 - an|] has exactly k distinct integers.
// 
//
// 
//If there are multiple answers, print any of them.
// 
//
// Example 1: 
// 
//Input: n = 3, k = 1
//Output: [1, 2, 3]
//Explanation: The [1, 2, 3] has three different positive integers ranging from 
//1 to 3, and the [1, 1] has exactly 1 distinct integer: 1.
// 
// 
//
// Example 2: 
// 
//Input: n = 3, k = 2
//Output: [1, 3, 2]
//Explanation: The [1, 3, 2] has three different positive integers ranging from 
//1 to 3, and the [2, 1] has exactly 2 distinct integers: 1 and 2.
// 
// 
//
// Note: 
// 
// The n and k are in the range 1 <= k < n <= 104. 
// 
// Related Topics 数组 
// 👍 69 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-28 15:23:35
 */
public class BeautifulArrangementIi {
    public static void main(String[] args) {
        Solution solution = new BeautifulArrangementIi().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int head = 1;
        int tail = k + 1;
        int idx = 0;
        while (head < tail) {
            arr[idx++] = head++;
            arr[idx++] = tail--;
        }
        if (head == tail) {
            arr[idx++] = head;
        }
        tail = k + 2;
        while (idx < n) {
            arr[idx++] = tail++;
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}