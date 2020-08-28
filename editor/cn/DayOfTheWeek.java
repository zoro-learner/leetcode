package leetcode.editor.cn;

//Given a date, return the corresponding day of the week for that date. 
//
// The input is given as three integers representing the day, month and year res
//pectively. 
//
// Return the answer as one of the following values {"Sunday", "Monday", "Tuesda
//y", "Wednesday", "Thursday", "Friday", "Saturday"}. 
//
// 
// Example 1: 
//
// 
//Input: day = 31, month = 8, year = 2019
//Output: "Saturday"
// 
//
// Example 2: 
//
// 
//Input: day = 18, month = 7, year = 1999
//Output: "Sunday"
// 
//
// Example 3: 
//
// 
//Input: day = 15, month = 8, year = 1993
//Output: "Sunday"
// 
//
// 
// Constraints: 
//
// 
// The given dates are valid dates between the years 1971 and 2100. 
// Related Topics 数组 
// 👍 29 👎 0


import java.util.Calendar;
import java.util.Date;

/**
 * @author zoro-learner
 * @create 2020-08-20 08:56:16
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        Solution solution = new DayOfTheWeek().new Solution();
        String day = solution.dayOfTheWeek(22, 8, 2020);
        System.out.println(day);
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        final String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int daysSince1971 = getDaysCount(day, month, year);
        return weekdays[(daysSince1971 + 5) % 7];
    }

    private int getDaysCount(int day, int month, int year) {
        final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final int YEAR_START = 1971;
        final int MONTH_START = 1;
        final int DAY_START = 1;
        int res = 0;
        for (int y = YEAR_START; y < year; y++) {
            res += getDaysInAYear(y);
//            System.out.println(y + " " + getDaysInAYear(y));
        }
        for (int m = MONTH_START; m < month; m++) {
            System.out.println(m + " " + months[m - 1]);
            res += months[m - 1];
        }
        res += day - 1;
        if (isLeapYear(year) && month > 2) {
            res++;
        }
//        System.out.println(res);
        return res;
    }

    private int getDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}