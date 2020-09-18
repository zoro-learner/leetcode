package leetcode.editor.cn;

//Given a binary search tree (BST) with duplicates, find all the mode(s) (the mo
//st frequently occurred element) in the given BST. 
//
// Assume a BST is defined as follows: 
//
// 
// The left subtree of a node contains only nodes with keys less than or equal t
//o the node's key. 
// The right subtree of a node contains only nodes with keys greater than or equ
//al to the node's key. 
// Both the left and right subtrees must also be binary search trees. 
// 
//
// 
//
// For example: 
//Given BST [1,null,2,2], 
//
// 
//   1
//    \
//     2
//    /
//   2
// 
//
// 
//
// return [2]. 
//
// Note: If a tree has more than one mode, you can return them in any order. 
//
// Follow up: Could you do that without using any extra space? (Assume that the 
//implicit stack space incurred due to recursion does not count). 
// Related Topics 树 
// 👍 146 👎 0


import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * @author zoro-learner
 * @create 2020-09-17 11:24:29
 */
public class FindModeInBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new FindModeInBinarySearchTree().new Solution();
        
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
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        TreeNode head = convertToLinkedList(root);

        return null;
    }

    private TreeNode convertToLinkedList(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftHead = root;
        if (root.left != null) {
            leftHead = convertToLinkedList(root.left);
            TreeNode p = leftHead;
            while (p.right != null) {
                p = p.right;
            }
            p.right = root;
            root.left = p;
        }
        if (root.right != null) {
            TreeNode rightHead = convertToLinkedList(root.right);
            root.right = rightHead;
            rightHead.left = root;
        }
        return leftHead;
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