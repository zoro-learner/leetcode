package leetcode.editor.cn;

//Given a binary tree, return the tilt of the whole tree. 
//
// The tilt of a tree node is defined as the absolute difference between the sum
// of all left subtree node values and the sum of all right subtree node values. N
//ull node has tilt 0. 
//
// The tilt of the whole tree is defined as the sum of all nodes' tilt. 
//
// Example: 
// 
//Input: 
//         1
//       /   \
//      2     3
//Output: 1
//Explanation: 
//Tilt of node 2 : 0
//Tilt of node 3 : 0
//Tilt of node 1 : |2-3| = 1
//Tilt of binary tree : 0 + 0 + 1 = 1
// 
// 
//
// Note:
// 
// The sum of node values in any subtree won't exceed the range of 32-bit intege
//r. 
// All the tilt values won't exceed the range of 32-bit integer. 
// 
// Related Topics 树 
// 👍 86 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-17 20:12:53
 */
public class BinaryTreeTilt {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeTilt().new Solution();
        
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
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int diff = Math.abs(sumOfTree(root.left) - sumOfTree(root.right));
        return diff + findTilt(root.left) + findTilt(root.right);
    }

    private int sumOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sumOfTree(root.left) + sumOfTree(root.right);
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