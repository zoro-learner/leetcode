package leetcode.editor.cn;

//Given a positive integer, return its corresponding column title as appear in a
//n Excel sheet. 
//
// For example: 
//
// 
//    1 -> A
//    2 -> B
//    3 -> C
//    ...
//    26 -> Z
//    27 -> AA
//    28 -> AB 
//    ...
// 
//
// Example 1: 
//
// 
//Input: 1
//Output: "A"
// 
//
// Example 2: 
//
// 
//Input: 28
//Output: "AB"
// 
//
// Example 3: 
//
// 
//Input: 701
//Output: "ZY"
// Related Topics 数学 
// 👍 261 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-08 14:25:39
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnTitle().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToTitle(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("No definition");
        }
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int digit = (n - 1) % 26;
            char ch = (char) ('A' + digit);
            sb.append(ch);
            n = (n - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}