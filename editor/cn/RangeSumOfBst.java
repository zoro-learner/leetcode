package leetcode.editor.cn;

//Given the root node of a binary search tree, return the sum of values of all n
//odes with value between L and R (inclusive). 
//
// The binary search tree is guaranteed to have unique values. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
//Output: 32
// 
//
// 
// Example 2: 
//
// 
//Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
//Output: 23
// 
//
// 
//
// Note: 
//
// 
// The number of nodes in the tree is at most 10000. 
// The final answer is guaranteed to be less than 2^31. 
// 
// 
// Related Topics 树 递归 
// 👍 134 👎 0


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zoro-learner
 * @create 2020-09-21 19:44:22
 */
public class RangeSumOfBst {
    public static void main(String[] args) {
        Solution solution = new RangeSumOfBst().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        } else {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val) {
        this.val = val;
    }
}
    
}