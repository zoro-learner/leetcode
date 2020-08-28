package leetcode.editor.cn;

//Count the number of segments in a string, where a segment is defined to be a c
//ontiguous sequence of non-space characters. 
//
// Please note that the string does not contain any non-printable characters. 
//
// Example: 
// 
//Input: "Hello, my name is John"
//Output: 5
// 
// Related Topics 字符串 
// 👍 56 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-26 18:53:37
 */
public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        Solution solution = new NumberOfSegmentsInAString().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countSegments(String s) {
        int res = 0;
        int idx = 0;
        while (idx < s.length()) {
            while (idx < s.length() && s.charAt(idx) == ' ') {
                idx++;
            }
            if (idx < s.length()) {
                res++;
            }
            while (idx < s.length() && s.charAt(idx) != ' ') {
                idx++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}