package leetcode.editor.cn;

//In a binary tree, the root node is at depth 0, and children of each depth k no
//de are at depth k+1. 
//
// Two nodes of a binary tree are cousins if they have the same depth, but have 
//different parents. 
//
// We are given the root of a binary tree with unique values, and the values x a
//nd y of two different nodes in the tree. 
//
// Return true if and only if the nodes corresponding to the values x and y are 
//cousins. 
//
// 
//
// Example 1: 
// 
//
// 
//Input: root = [1,2,3,4], x = 4, y = 3
//Output: false
// 
//
// 
// Example 2: 
// 
//
// 
//Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
//Output: true
// 
//
// 
// Example 3: 
//
// 
//
// 
//Input: root = [1,2,3,null,4], x = 2, y = 3
//Output: false
// 
// 
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree will be between 2 and 100. 
// Each node has a unique integer value from 1 to 100. 
// 
// Related Topics 树 广度优先搜索 
// 👍 92 👎 0


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author zoro-learner
 * @create 2020-09-21 11:14:22
 */
public class CousinsInBinaryTree {
    public static void main(String[] args) {
        Solution solution = new CousinsInBinaryTree().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode parentOfX = getParent(root, x);
        TreeNode parentOfY = getParent(root, y);
        int depthOfX = getDepth(root, x);
        int depthOfY = getDepth(root, y);
        return depthOfX != - 1 && depthOfX == depthOfY && parentOfX != parentOfY;
    }

    private TreeNode getParent(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return null;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.left != null) {
                if (tmp.left.val == val) {
                    return tmp;
                }
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                if (tmp.right.val == val) {
                    return tmp;
                }
                queue.add(tmp.right);
            }
        }
        return null;
    }

    private int getDepth(TreeNode root, int val) {
        if (root == null) {
            return -1;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int k = queue.size();
            while (k-- > 0) {
                TreeNode tmp = queue.poll();
                if (tmp.val == val) {
                    return depth;
                }
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
            depth++;
        }
        return -1;
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

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

}