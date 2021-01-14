package leetcode.editor.cn;

//We are given an array A of N lowercase letter strings, all of the same length.
// 
//
// Now, we may choose any set of deletion indices, and for each string, we delet
//e all the characters in those indices. 
//
// For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices
// {0, 2, 3}, then the final array after deletions is ["bef", "vyz"], and the rema
//ining columns of A are ["b","v"], ["e","y"], and ["f","z"]. (Formally, the c-th 
//column is [A[0][c], A[1][c], ..., A[A.length-1][c]]). 
//
// Suppose we chose a set of deletion indices D such that after deletions, each 
//remaining column in A is in non-decreasing sorted order. 
//
// Return the minimum possible value of D.length. 
//
// 
// Example 1: 
//
// 
//Input: A = ["cba","daf","ghi"]
//Output: 1
//Explanation: 
//After choosing D = {1}, each column ["c","d","g"] and ["a","f","i"] are in non
//-decreasing sorted order.
//If we chose D = {}, then a column ["b","a","h"] would not be in non-decreasing
// sorted order.
// 
//
// Example 2: 
//
// 
//Input: A = ["a","b"]
//Output: 0
//Explanation: D = {}
// 
//
// Example 3: 
//
// 
//Input: A = ["zyx","wvu","tsr"]
//Output: 3
//Explanation: D = {0, 1, 2}
// 
//
// 
// Constraints: 
//
// 
// 1 <= A.length <= 100 
// 1 <= A[i].length <= 1000 
// 
// Related Topics 贪心算法 
// 👍 37 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-06 16:50:49
 */
public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        Solution solution = new DeleteColumnsToMakeSorted().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minDeletionSize(String[] A) {
        if (A == null || A.length == 0 || A[0].isEmpty()) {
            return 0;
        }
        int res = 0;
        int r = A.length;
        int c = A[0].length();
        for (int i = 0; i < c; i++) {
            boolean isAscending = true;
            for (int j = 0; j < r - 1; j++) {
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    isAscending = false;
                    break;
                }
            }
            if (!isAscending) {
                res++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}