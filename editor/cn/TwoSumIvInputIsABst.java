package leetcode.editor.cn;

//Given a Binary Search Tree and a target number, return true if there exist two
// elements in the BST such that their sum is equal to the given target. 
//
// Example 1: 
//
// 
//Input: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 9
//
//Output: True
// 
//
// 
//
// Example 2: 
//
// 
//Input: 
//    5
//   / \
//  3   6
// / \   \
//2   4   7
//
//Target = 28
//
//Output: False
// 
//
// 
// Related Topics 树 
// 👍 174 👎 0


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-09-18 11:03:42
 */
public class TwoSumIvInputIsABst {
    public static void main(String[] args) {
        Solution solution = new TwoSumIvInputIsABst().new Solution();
        
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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (set.contains(k - tmp.val)) {
                return true;
            }
            set.add(tmp.val);
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
        }
        return false;
    }

    private boolean findVal(TreeNode root, int val) {
        TreeNode t = root;
        while (t != null) {
            if (t.val == val) {
                return true;
            } else if (t.val > val) {
                t = t.left;
            } else {
                t = t.right;
            }
        }
        return false;
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