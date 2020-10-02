package leetcode.editor.cn;

//Given a Binary Search Tree (BST) with the root node root, return the minimum d
//ifference between the values of any two different nodes in the tree. 
//
// Example : 
//
// 
//Input: root = [4,2,6,1,3,null,null]
//Output: 1
//Explanation:
//Note that root is a TreeNode object, not an array.
//
//The given tree [4,2,6,1,3,null,null] is represented by the following diagram:
//
//          4
//        /   \
//      2      6
//     / \    
//    1   3  
//
//while the minimum difference in this tree is 1, it occurs between node 1 and n
//ode 2, also between node 3 and node 2.
// 
//
// Note: 
//
// 
// The size of the BST will be between 2 and 100. 
// The BST is always valid, each node's value is an integer, and each node's val
//ue is different. 
// This question is the same as 530: https://leetcode.com/problems/minimum-absol
//ute-difference-in-bst/ 
// 
// Related Topics 树 递归 
// 👍 79 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-21 19:44:35
 */
public class MinimumDistanceBetweenBstNodes {
    public static void main(String[] args) {
        Solution solution = new MinimumDistanceBetweenBstNodes().new Solution();
        
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
    public int minDiffInBST(TreeNode root) {
        int res = Integer.MAX_VALUE;
        if (root == null || isLeave(root)) {
//            throw new IllegalArgumentException("No solution");
            return res;
        }
        if (root.left != null) {
            TreeNode p = root.left;
            while (p.right != null) {
                p = p.right;
            }
            res = Math.min(res, root.val - p.val);
            res = Math.min(res, minDiffInBST(root.left));
        }
        if (root.right != null) {
            TreeNode p = root.right;
            while (p.left != null) {
                p = p.left;
            }
            res = Math.min(res, p.val - root.val);
            res = Math.min(res, minDiffInBST(root.right));
        }
        return res;
    }

    private boolean isLeave(TreeNode root) {
        return root != null && root.left == null && root.right == null;
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