package leetcode.editor.cn;

//You need to construct a string consists of parenthesis and integers from a bin
//ary tree with the preorder traversing way. 
//
// The null node needs to be represented by empty parenthesis pair "()". And you
// need to omit all the empty parenthesis pairs that don't affect the one-to-one m
//apping relationship between the string and the original binary tree. 
//
// Example 1: 
// 
//Input: Binary tree: [1,2,3,4]
//       1
//     /   \
//    2     3
//   /    
//  4     
//
//Output: "1(2(4))(3)"
// Explanation: Originallay it needs to be "1(2(4)())(3()())", but you need to o
//mit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)".
// 
// 
//
// Example 2: 
// 
//Input: Binary tree: [1,2,3,null,4]
//       1
//     /   \
//    2     3
//     \  
//      4 
//
//Output: "1(2()(4))(3)"
// Explanation: Almost the same as the first example, except we can't omit the f
//irst parenthesis pair to break the one-to-one mapping relationship between the i
//nput and the output.
// 
// Related Topics 树 字符串 
// 👍 142 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-28 09:10:04
 */
public class ConstructStringFromBinaryTree {
    public static void main(String[] args) {
        Solution solution = new ConstructStringFromBinaryTree().new Solution();
        
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
    public String tree2str(TreeNode t) {

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}