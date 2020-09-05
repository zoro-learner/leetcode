package leetcode.editor.cn;

//Given an integer n, generate all structurally unique BST's (binary search tree
//s) that store values 1 ... n. 
//
// Example: 
//
// 
//Input: 3
//Output:
//[
//  [1,null,3,2],
//  [3,2,null,1],
//  [3,1,null,null,2],
//  [2,1,3],
//  [1,null,2,null,3]
//]
//Explanation:
//The above output corresponds to the 5 unique BST's shown below:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 8 
// 
// Related Topics 树 动态规划 
// 👍 620 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-02 08:15:16
 */
public class UniqueBinarySearchTreesIi {
    public static void main(String[] args) {
        Solution solution = new UniqueBinarySearchTreesIi().new Solution();
        
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
    public List<TreeNode> generateTrees(int n) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}