package leetcode.editor.cn;

//Given a string S of lowercase letters, a duplicate removal consists of choosin
//g two adjacent and equal letters, and removing them. 
//
// We repeatedly make duplicate removals on S until we no longer can. 
//
// Return the final string after all such duplicate removals have been made. It 
//is guaranteed the answer is unique. 
//
// 
//
// Example 1: 
//
// 
//Input: "abbaca"
//Output: "ca"
//Explanation: 
//For example, in "abbaca" we could remove "bb" since the letters are adjacent a
//nd equal, and this is the only possible move.  The result of this move is that t
//he string is "aaca", of which only "aa" is possible, so the final string is "ca"
//.
// 
//
// 
//
// Note: 
//
// 
// 1 <= S.length <= 20000 
// S consists only of English lowercase letters. 
// Related Topics 栈 
// 👍 89 👎 0



import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-10-04 16:01:31
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        Solution solution = new RemoveAllAdjacentDuplicatesInString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char ch : S.toCharArray()) {
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}