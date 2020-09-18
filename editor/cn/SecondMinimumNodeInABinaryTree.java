package leetcode.editor.cn;

//Given a non-empty special binary tree consisting of nodes with the non-negativ
//e value, where each node in this tree has exactly two or zero sub-node. If the n
//ode has two sub-nodes, then this node's value is the smaller value among its two
// sub-nodes. More formally, the property root.val = min(root.left.val, root.right
//.val) always holds. 
//
// Given such a binary tree, you need to output the second minimum value in the 
//set made of all the nodes' value in the whole tree. 
//
// If no such second minimum value exists, output -1 instead. 
//
// Example 1: 
//
// 
//Input: 
//    2
//   / \
//  2   5
//     / \
//    5   7
//
//Output: 5
//Explanation: The smallest value is 2, the second smallest value is 5.
// 
//
// 
//
// Example 2: 
//
// 
//Input: 
//    2
//   / \
//  2   2
//
//Output: -1
//Explanation: The smallest value is 2, but there isn't any second smallest valu
//e.
// 
//
// 
// Related Topics 树 
// 👍 103 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-18 11:04:03
 */
public class SecondMinimumNodeInABinaryTree {
    public static void main(String[] args) {
        Solution solution = new SecondMinimumNodeInABinaryTree().new Solution();
        
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
    public int findSecondMinimumValue(TreeNode root) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}