package leetcode.editor.cn;

//Your friend is typing his name into a keyboard. Sometimes, when typing a chara
//cter c, the key might get long pressed, and the character will be typed 1 or mor
//e times. 
//
// You examine the typed characters of the keyboard. Return True if it is possib
//le that it was your friends name, with some characters (possibly none) being lon
//g pressed. 
//
// 
// Example 1: 
//
// 
//Input: name = "alex", typed = "aaleex"
//Output: true
//Explanation: 'a' and 'e' in 'alex' were long pressed.
// 
//
// Example 2: 
//
// 
//Input: name = "saeed", typed = "ssaaedd"
//Output: false
//Explanation: 'e' must have been pressed twice, but it wasn't in the typed outp
//ut.
// 
//
// Example 3: 
//
// 
//Input: name = "leelee", typed = "lleeelee"
//Output: true
// 
//
// Example 4: 
//
// 
//Input: name = "laiden", typed = "laiden"
//Output: true
//Explanation: It's not necessary to long press any character.
// 
//
// 
// Constraints: 
//
// 
// 1 <= name.length <= 1000 
// 1 <= typed.length <= 1000 
// The characters of name and typed are lowercase letters. 
// 
// Related Topics 双指针 字符串 
// 👍 79 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 09:38:32
 */
public class LongPressedName {
    public static void main(String[] args) {
        Solution solution = new LongPressedName().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int p1 = 0;
        int p2 = 0;
        while (p1 <= name.length() && p2 < typed.length()) {
//            System.out.println("p1 " + p1 + " p2 " + p2);
            if (p1 < name.length() && name.charAt(p1) == typed.charAt(p2)) {
                p1++;
                p2++;
            } else if (p1 > 0 && name.charAt(p1 - 1) == typed.charAt(p2)) {
                p2++;
            } else {
                return false;
            }
        }
        return p1 == name.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}