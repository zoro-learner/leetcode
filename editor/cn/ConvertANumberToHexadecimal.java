package leetcode.editor.cn;

//
//Given an integer, write an algorithm to convert it to hexadecimal. For negativ
//e integer, two’s complement method is used.
// 
//
// Note:
// 
// All letters in hexadecimal (a-f) must be in lowercase. 
// The hexadecimal string must not contain extra leading 0s. If the number is ze
//ro, it is represented by a single zero character '0'; otherwise, the first chara
//cter in the hexadecimal string will not be the zero character. 
// The given number is guaranteed to fit within the range of a 32-bit signed int
//eger. 
// You must not use any method provided by the library which converts/formats th
//e number to hex directly. 
// 
// 
//
// Example 1:
// 
//Input:
//26
//
//Output:
//"1a"
// 
// 
//
// Example 2:
// 
//Input:
//-1
//
//Output:
//"ffffffff"
// 
// Related Topics 位运算 
// 👍 95 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-07 10:41:27
 */
public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        Solution solution = new ConvertANumberToHexadecimal().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        if (num == Integer.MIN_VALUE) {
            return "80000000";
        }

        StringBuilder sb = new StringBuilder();
        int copy = Math.abs(num);
        while (copy != 0) {
            sb.append(digitToHex(copy % 16));
            copy /= 16;
        }
        if (num < 0) {
            while (sb.length() < 8) {
                sb.append('0');
            }
            for (int i = 0; i < sb.length(); i++) {
                sb.setCharAt(i, digitToHex(digitComplement(sb.charAt(i))));
            }
            int carry = 1;
            int idx = 0;
            while (carry != 0 && idx < sb.length()) {
                char ch = sb.charAt(idx);
                if (ch == 'f') {
                    sb.setCharAt(idx, '0');
                    idx++;
                    carry = 1;
                } else if (ch == '9') {
                    sb.setCharAt(idx, 'a');
                    carry = 0;
                } else {
                    sb.setCharAt(idx, (char) (sb.charAt(idx) + 1));
                    carry = 0;
                }
            }
        }
        return sb.reverse().toString();

    }

    private int digitComplement(char ch) {
        int res;
        if (ch >= '0' && ch <= '9') {
            res = 15 - (ch - '0');
        } else {
            res = 5 - (ch - 'a');
        }
        return res;
    }

    private char digitToHex(int num) {
        assert num >= 0 && num < 16;
        char res;
        if (num < 10) {
            res = (char)('0' + num);
        } else {
            res = (char) ('a' + (num - 10));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}