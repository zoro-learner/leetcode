package leetcode.editor.cn;

//Given a binary search tree with non-negative values, find the minimum absolute
// difference between values of any two nodes. 
//
// Example: 
//
// 
//Input:
//
//   1
//    \
//     3
//    /
//   2
//
//Output:
//1
//
//Explanation:
//The minimum absolute difference is 1, which is the difference between 2 and 1 
//(or between 2 and 3).
// 
//
// 
//
// Note: 
//
// 
// There are at least two nodes in this BST. 
// This question is the same as 783: https://leetcode.com/problems/minimum-dista
//nce-between-bst-nodes/ 
// 
// Related Topics 树 
// 👍 136 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-17 16:16:20
 */
public class MinimumAbsoluteDifferenceInBst {
    public static void main(String[] args) {
        Solution solution = new MinimumAbsoluteDifferenceInBst().new Solution();
        
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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> nums = getValueList(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size() - 1; i++) {
            minDiff = Math.min(minDiff, nums.get(i + 1) - nums.get(i));
        }
        return minDiff;
    }

    private List<Integer> getValueList(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        if (root.left != null) {
            res = getValueList(root.left);
        }
        res.add(root.val);
        if (root.right != null) {
            res.addAll(getValueList(root.right));
        }
        return res;
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