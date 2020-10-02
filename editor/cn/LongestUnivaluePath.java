package leetcode.editor.cn;

//Given a binary tree, find the length of the longest path where each node in th
//e path has the same value. This path may or may not pass through the root. 
//
// The length of path between two nodes is represented by the number of edges be
//tween them. 
//
// 
//
// Example 1: 
//
// Input: 
//
// 
//              5
//             / \
//            4   5
//           / \   \
//          1   1   5
// 
//
// Output: 2 
//
// 
//
// Example 2: 
//
// Input: 
//
// 
//              1
//             / \
//            4   5
//           / \   \
//          4   4   5
// 
//
// Output: 2 
//
// 
//
// Note: The given binary tree has not more than 10000 nodes. The height of the 
//tree is not more than 1000. 
// Related Topics 树 递归 
// 👍 354 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-18 15:36:06
 */
public class LongestUnivaluePath {
    public static void main(String[] args) {
        Solution solution = new LongestUnivaluePath().new Solution();
        
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
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lengthOfLeft = helper(root.left, root.val);
        int lengthOfRight = helper(root.right, root.val);
        int longestWithRoot = lengthOfLeft + lengthOfRight;
        int longestOfLeft = longestUnivaluePath(root.left);
        int longestOfRight = longestUnivaluePath(root.right);
        return Math.max(longestWithRoot, Math.max(longestOfLeft, longestOfRight));
    }

    private int helper(TreeNode root, int val) {
        if (root == null || root.val != val) {
            return 0;
        }
        return 1 + Math.max(helper(root.left, val), helper(root.right, val));
    }
}
//leetcode submit region end(Prohibit modification and deletion)


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x) {
        val = x;
    }
}
}