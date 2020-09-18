package leetcode.editor.cn;

//Given a string date representing a Gregorian calendar date formatted as YYYY-M
//M-DD, return the day number of the year. 
//
// 
// Example 1: 
//
// 
//Input: date = "2019-01-09"
//Output: 9
//Explanation: Given date is the 9th day of the year in 2019.
// 
//
// Example 2: 
//
// 
//Input: date = "2019-02-10"
//Output: 41
// 
//
// Example 3: 
//
// 
//Input: date = "2003-03-01"
//Output: 60
// 
//
// Example 4: 
//
// 
//Input: date = "2004-03-01"
//Output: 61
// 
//
// 
// Constraints: 
//
// 
// date.length == 10 
// date[4] == date[7] == '-', and all other date[i]'s are digits 
// date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019. 
// Related Topics 数学 
// 👍 26 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-15 10:28:28
 */
public class DayOfTheYear {
    public static void main(String[] args) {
        Solution solution = new DayOfTheYear().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    final int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int dayOfYear(String date) {
        String[] strs = date.split("-");
        int year = Integer.parseInt(strs[0]);
        int month = Integer.parseInt(strs[1]);
        int day = Integer.parseInt(strs[2]);
        int days = day;
        for (int i = 0; i < month - 1; i++) {
            days += daysOfMonth[i];
        }
        if (isLeapYear(year) && month > 2) {
            days++;
        }
        return days;

    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}