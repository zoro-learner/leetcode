package leetcode.editor.cn;

//Write a program to count the number of days between two dates. 
//
// The two dates are given as strings, their format is YYYY-MM-DD as shown in th
//e examples. 
//
// 
// Example 1: 
// Input: date1 = "2019-06-29", date2 = "2019-06-30"
//Output: 1
// Example 2: 
// Input: date1 = "2020-01-15", date2 = "2019-12-31"
//Output: 15
// 
// 
// Constraints: 
//
// 
// The given dates are valid dates between the years 1971 and 2100. 
// 
// 👍 26 👎 0


/**
 * @author zoro-learner
 * @create 2020-10-03 17:22:26
 */
public class NumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        Solution solution = new NumberOfDaysBetweenTwoDates().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        SimpleDate simpleDate1 = new SimpleDate(date1);
        SimpleDate simpleDate2 = new SimpleDate(date2);
        return Math.abs(simpleDate1.compareTo(simpleDate2));
    }
}

class SimpleDate {

    public final int[] DAYS_OF_MONTH = new int[] {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    private int year;

    private int month;

    private int day;

    public SimpleDate(String date) {
        String[] tmp = date.split("-");
        year = Integer.parseInt(tmp[0]);
        month = Integer.parseInt(tmp[1]);
        day = Integer.parseInt(tmp[2]);
    }

    public int compareTo(SimpleDate other) {
        if (this.year >= other.year) {
            int days = 0;
            for (int i = other.year; i < this.year; i++) {
                days += daysOfYear(i);
            }
            days += this.daysSinceBeginning();
            days -= other.daysSinceBeginning();
            return days;
        }
        return -other.compareTo(this);
    }

    private int daysOfYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private int daysSinceBeginning() {
        int days = day;
        for (int i = 1; i < month; i++) {
            days += DAYS_OF_MONTH[i - 1];
        }
        if (month > 2 && isLeapYear(year)) {
            days++;
        }
        return days;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
    
}