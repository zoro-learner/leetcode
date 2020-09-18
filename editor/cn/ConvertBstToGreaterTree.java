package leetcode.editor.cn;

//Given a Binary Search Tree (BST), convert it to a Greater Tree such that every
// key of the original BST is changed to the original key plus sum of all keys gre
//ater than the original key in BST. 
//
// Example: 
//
// 
//Input: The root of a Binary Search Tree like this:
//              5
//            /   \
//           2     13
//
//Output: The root of a Greater Tree like this:
//             18
//            /   \
//          20     13
// 
//
// Note: This question is the same as 1038: https://leetcode.com/problems/binary
//-search-tree-to-greater-sum-tree/ 
// Related Topics 树 
// 👍 327 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-17 16:28:11
 */
public class ConvertBstToGreaterTree {
    public static void main(String[] args) {
        Solution solution = new ConvertBstToGreaterTree().new Solution();
        
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
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right != null) {
            root.val += sumOfTree(root.right);
            convertBST(root.right);
        }
        if (root.left != null) {
            TreeNode leftBranch = convertBST(root.left);
            addValue(leftBranch, root.val);
        }
        return root;
    }

    private int sumOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumOfTree(root.left) + sumOfTree(root.right);
    }

    private void addValue(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        root.val += val;
        addValue(root.left, val);
        addValue(root.right, val);
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