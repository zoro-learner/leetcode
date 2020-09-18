package leetcode.editor.cn;

//Given two non-empty binary trees s and t, check whether tree t has exactly the
// same structure and node values with a subtree of s. A subtree of s is a tree co
//nsists of a node in s and all of this node's descendants. The tree s could also 
//be considered as a subtree of itself. 
//
// Example 1: 
//Given tree s: 
//
// 
//     3
//    / \
//   4   5
//  / \
// 1   2
// 
//Given tree t:
//
// 
//   4 
//  / \
// 1   2
// 
//Return true, because t has the same structure and node values with a subtree o
//f s.
//
// 
//
// Example 2: 
//Given tree s: 
//
// 
//     3
//    / \
//   4   5
//  / \
// 1   2
//    /
//   0
// 
//Given tree t:
//
// 
//   4
//  / \
// 1   2
// 
//Return false.
//
// 
// Related Topics 树 
// 👍 353 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-17 18:34:19
 */
public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        Solution solution = new SubtreeOfAnotherTree().new Solution();
        
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == t;
        }
        return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == t;
        }
        return s.val == t.val && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
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