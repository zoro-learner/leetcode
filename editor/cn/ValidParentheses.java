package leetcode.editor.cn;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// Note that an empty string is also considered valid. 
//
// Example 1: 
//
// 
//Input: "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: "{[]}"
//Output: true
// 
// Related Topics 栈 字符串 
// 👍 1813 👎 0


import java.util.Stack;

/**
 * @author zoro-learner
 * @create 2020-08-26 10:33:06
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (isOpenBrackets(ch)) {
                stack.push(ch);
            } else if(isCloseBrackets(ch) && !stack.isEmpty()) {
                char open = stack.pop();
                if (!isMatched(open, ch)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }

    private boolean isCloseBrackets(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    private boolean isMatched(char open, char close) {
        switch (open) {
            case '(':
                return close == ')';
            case '[':
                return close == ']';
            case '{':
                return close == '}';
            default:
                return false;
        }
    }

    private boolean isOpenBrackets(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}