package leetcode.editor.cn;

//Given a column title as appear in an Excel sheet, return its corresponding col
//umn number. 
//
// For example: 
//
// 
//    A -> 1
//    B -> 2
//    C -> 3
//    ...
//    Z -> 26
//    AA -> 27
//    AB -> 28 
//    ...
// 
//
// Example 1: 
//
// 
//Input: "A"
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: "AB"
//Output: 28
// 
//
// Example 3: 
//
// 
//Input: "ZY"
//Output: 701
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 7 
// s consists only of uppercase English letters. 
// s is between "A" and "FXSHRXW". 
// 
// Related Topics 数学 
// 👍 171 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-08 15:10:49
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution solution = new ExcelSheetColumnNumber().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (char ch : s.toCharArray()) {
            int digit = 1 + ch - 'A';
            num = num * 26 + digit;
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}