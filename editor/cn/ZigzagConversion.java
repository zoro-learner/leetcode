package leetcode.editor.cn;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number o
//f rows like this: (you may want to display this pattern in a fixed font for bett
//er legibility) 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R
// 
//
// And then read line by line: "PAHNAPLSIIGYIR" 
//
// Write the code that will take a string and make this conversion given a numbe
//r of rows: 
//
// 
//string convert(string s, int numRows);
// 
//
// 
// Example 1: 
//
// 
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
// 
//
// Example 2: 
//
// 
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// Example 3: 
//
// 
//Input: s = "A", numRows = 1
//Output: "A"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consists of English letters (lower-case and upper-case), ',' and '.'. 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 
// 👍 868 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-12 18:27:55
 */
public class ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new ZigzagConversion().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] grid = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            grid[i] = new StringBuilder();
        }

        boolean isDown = true;
        int step = 1;
        int curr = 0;
        for (char ch : s.toCharArray()) {
            grid[curr].append(ch);
            if (step > 0) {
                if (curr == numRows - 1) {
                    step = -step;
                }
            } else {
                if (curr == 0) {
                    step = -step;
                }
            }

            curr += step;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(grid[i]);
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}