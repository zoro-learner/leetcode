package leetcode.editor.cn;

//Given n pairs of parentheses, write a function to generate all combinations of
// well-formed parentheses. 
//
// 
// Example 1: 
// Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2: 
// Input: n = 1
//Output: ["()"]
// 
// 
// Constraints: 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 回溯算法 
// 👍 1365 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-10-12 19:32:22
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<String> res = new ArrayList<>();

    StringBuilder sb = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        dfs(2 * n, 0, 0);
        return res;
    }

    private void dfs(int n, int left, int right) {
        if (left + right == n && left == right) {
            res.add(sb.toString());
            return ;
        }
        if (right > left || left > n / 2 || left + right >= n) {
            return ;
        }

        sb.append("(");
        dfs(n, left + 1, right);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(")");
        dfs(n, left, right + 1);
        sb.deleteCharAt(sb.length() - 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}