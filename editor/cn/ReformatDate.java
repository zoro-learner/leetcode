package leetcode.editor.cn;

//Given a date string in the form Day Month Year, where: 
//
// 
// Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}. 
// Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", 
//"Sep", "Oct", "Nov", "Dec"}. 
// Year is in the range [1900, 2100]. 
// 
//
// Convert the date string to the format YYYY-MM-DD, where: 
//
// 
// YYYY denotes the 4 digit year. 
// MM denotes the 2 digit month. 
// DD denotes the 2 digit day. 
// 
//
// 
// Example 1: 
//
// 
//Input: date = "20th Oct 2052"
//Output: "2052-10-20"
// 
//
// Example 2: 
//
// 
//Input: date = "6th Jun 1933"
//Output: "1933-06-06"
// 
//
// Example 3: 
//
// 
//Input: date = "26th May 1960"
//Output: "1960-05-26"
// 
//
// 
// Constraints: 
//
// 
// The given dates are guaranteed to be valid, so no error handling is necessary
//. 
// 
// Related Topics 字符串 
// 👍 2 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-29 14:29:00
 */
public class ReformatDate {
    public static void main(String[] args) {
        Solution solution = new ReformatDate().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reformatDate(String date) {
        String[] strs = date.split(" ");
        String day = reformatDay(strs[0]);
        String month = reformatMonth(strs[1]);
        String year = strs[2];
        return year + "-" + month + "-" + day;
    }

    private String reformatMonth(String s) {
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(s)) {
                return String.format("%02d", i + 1);
            }
        }
        return "??";
    }

    private String reformatDay(String s) {
        StringBuilder day = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                day.append(ch);
            } else {
                break;
            }
        }
        if (day.length() == 1) {
            day.insert(0, '0');
        }
        return day.toString();
    }

    final private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
}
//leetcode submit region end(Prohibit modification and deletion)

    
}