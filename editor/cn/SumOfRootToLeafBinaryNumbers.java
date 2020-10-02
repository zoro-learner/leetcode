package leetcode.editor.cn;

//You are given the root of a binary tree where each node has a value 0 or 1. Ea
//ch root-to-leaf path represents a binary number starting with the most significa
//nt bit. For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could repre
//sent 01101 in binary, which is 13. 
//
// For all leaves in the tree, consider the numbers represented by the path from
// the root to that leaf. 
//
// Return the sum of these numbers. The answer is guaranteed to fit in a 32-bits
// integer. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,0,1,0,1,0,1]
//Output: 22
//Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
// 
//
// Example 2: 
//
// 
//Input: root = [0]
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: 1
// 
//
// Example 4: 
//
// 
//Input: root = [1,1]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 1000]. 
// Node.val is 0 or 1. 
// 
// Related Topics 树 
// 👍 69 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-21 15:41:42
 */
public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {
        Solution solution = new SumOfRootToLeafBinaryNumbers().new Solution();
        
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
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<String> paths = new ArrayList<>();
        dfs(root, new StringBuilder(), paths);
        int sum = 0;
        for (String path : paths) {
            sum += Integer.parseInt(path, 2);
        }
        return sum;
    }

    private boolean isLeave(TreeNode root) {
        return root != null && root.left == null && root.right == null;
    }

    private void dfs(TreeNode root, StringBuilder path, List<String> paths) {
//        System.out.println(paths);
        if (root == null) {
            return ;
        }
        path.append(root.val);
        if (isLeave(root)) {
            paths.add(path.toString());
        } else {
            dfs(root.left, path, paths);
            dfs(root.right, path, paths);
        }
        path.deleteCharAt(path.length() - 1);
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