package leetcode.editor.cn;

//Given a binary search tree (BST), find the lowest common ancestor (LCA) of two
// given nodes in the BST. 
//
// According to the definition of LCA on Wikipedia: “The lowest common ancestor 
//is defined between two nodes p and q as the lowest node in T that has both p and
// q as descendants (where we allow a node to be a descendant of itself).” 
//
// Given binary search tree: root = [6,2,8,0,4,7,9,null,null,3,5] 
//
// 
//
// Example 1: 
//
// 
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//Output: 6
//Explanation: The LCA of nodes 2 and 8 is 6.
// 
//
// Example 2: 
//
// 
//Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//Output: 2
//Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant o
//f itself according to the LCA definition.
// 
//
// 
// Constraints: 
//
// 
// All of the nodes' values will be unique. 
// p and q are different and both values will exist in the BST. 
// 
// Related Topics 树 
// 👍 382 👎 0


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-09-16 17:25:36
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new LowestCommonAncestorOfABinarySearchTree().new Solution();
        
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathOfP = findPath(root, p);
        List<TreeNode> pathOfQ = findPath(root, q);
        if (pathOfP.isEmpty() || pathOfQ.isEmpty()) {
            return null;
        }
        int i = 0;
        for (i = 0; i < pathOfP.size() && i < pathOfQ.size(); i++) {
            if (pathOfP.get(i).val != pathOfQ.get(i).val) {
                break;
            }
        }
        return pathOfP.get(i - 1);
    }

    private List<TreeNode> findPath(TreeNode root, TreeNode node) {
        List<TreeNode> path = new ArrayList<>();
        if (root == null || node == null) {
            return path;
        }
        path.add(root);
        if (root.val == node.val) {
            return path;
        } else if (root.val < node.val) {
            path.addAll(findPath(root.right, node));
        } else {
            path.addAll(findPath(root.left, node));
        }
        return path;
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

    @Override
    public String toString() {
        return val + "->";
    }
}
}