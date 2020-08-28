package leetcode.editor.cn;

//Write a function that takes a string as input and reverse only the vowels of a
// string. 
//
// Example 1: 
//
// 
//Input: "hello"
//Output: "holle"
// 
//
// 
// Example 2: 
//
// 
//Input: "leetcode"
//Output: "leotcede" 
// 
//
// Note: 
//The vowels does not include the letter "y". 
//
// 
// Related Topics 双指针 字符串 
// 👍 112 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 16:30:18
 */
public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new ReverseVowelsOfAString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int head = 0;
        int tail = sb.length() - 1;
        while (head < tail) {
            while (head < tail && !isVowel(sb.charAt(head))) {
                head++;
            }
            while (head < tail && !isVowel(sb.charAt(tail))) {
                tail--;
            }
            if (head < tail) {
                char tmp = sb.charAt(head);
                sb.setCharAt(head, sb.charAt(tail));
                sb.setCharAt(tail, tmp);
            }
            head++;
            tail--;
        }
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}