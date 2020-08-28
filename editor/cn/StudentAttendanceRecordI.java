package leetcode.editor.cn;

//You are given a string representing an attendance record for a student. The re
//cord only contains the following three characters:
//
// 
// 
// 'A' : Absent. 
// 'L' : Late. 
// 'P' : Present. 
// 
// 
//
// 
//A student could be rewarded if his attendance record doesn't contain more than
// one 'A' (absent) or more than two continuous 'L' (late). 
//
// You need to return whether the student could be rewarded according to his att
//endance record. 
//
// Example 1: 
// 
//Input: "PPALLP"
//Output: True
// 
// 
//
// Example 2: 
// 
//Input: "PPALLL"
//Output: False
// 
// 
//
//
// Related Topics 字符串 
// 👍 49 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-27 14:02:04
 */
public class StudentAttendanceRecordI {
    public static void main(String[] args) {
        Solution solution = new StudentAttendanceRecordI().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absent++;
            }
        }
        return absent <= 1 && !s.contains("LLL");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}