package leetcode.editor.cn;

//Given an array where elements are sorted in ascending order, convert it to a h
//eight balanced BST. 
//
// For this problem, a height-balanced binary tree is defined as a binary tree i
//n which the depth of the two subtrees of every node never differ by more than 1.
// 
//
// Example: 
//
// 
//Given the sorted array: [-10,-3,0,5,9],
//
//One possible answer is: [0,-3,9,-10,null,5], which represents the following he
//ight balanced BST:
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics 树 深度优先搜索 
// 👍 578 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-15 16:13:20
 */
public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedArrayToBinarySearchTree().new Solution();
        
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return helper(nums, 0, nums.length);
    }

    private TreeNode helper(int[] nums, int from, int to) {
        if (from < 0 || to > nums.length) {
            throw new IllegalArgumentException("No solution");
        }
        if (to - from <= 0) {
            return null;
        }
        if (to - from == 1) {
            return new TreeNode(nums[from]);
        }
        int mid = from + (to - from) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, from, mid);
        root.right = helper(nums, mid + 1, to);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
}