package leetcode.editor.cn;

//Implement a MyCalendar class to store your events. A new event can be added if
// adding the event will not cause a double booking. 
//
// Your class will have the method, book(int start, int end). Formally, this rep
//resents a booking on the half open interval [start, end), the range of real numb
//ers x such that start <= x < end. 
//
// A double booking happens when two events have some non-empty intersection (ie
//., there is some time that is common to both events.) 
//
// For each call to the method MyCalendar.book, return true if the event can be 
//added to the calendar successfully without causing a double booking. Otherwise, 
//return false and do not add the event to the calendar. 
//Your class will be called like this: MyCalendar cal = new MyCalendar(); MyCale
//ndar.book(start, end)
//
// Example 1: 
//
// 
//MyCalendar();
//MyCalendar.book(10, 20); // returns true
//MyCalendar.book(15, 25); // returns false
//MyCalendar.book(20, 30); // returns true
//Explanation: 
//The first event can be booked.  The second can't because time 15 is already bo
//oked by another event.
//The third event can be booked, as the first event takes every time less than 2
//0, but not including 20.
// 
//
// 
//
// Note: 
//
// 
// The number of calls to MyCalendar.book per test case will be at most 1000. 
// In calls to MyCalendar.book(start, end), start and end are integers in the ra
//nge [0, 10^9]. 
// 
//
// 
// Related Topics 数组 
// 👍 56 👎 0


import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author zoro-learner
 * @create 2020-10-30 08:44:33
 */
public class MyCalendarI {
    public static void main(String[] args) {

    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class MyCalendar {

    private SortedSet<Event> events;

    public MyCalendar() {
        events = new TreeSet<>();
    }
    
    public boolean book(int start, int end) {
        Event e = new Event(start, end);
        if (contains(e)) {
            return false;
        }
        events.add(e);
        return true;
    }

    public boolean contains(Event event) {
        for (Event e : events) {
            if (e.getStart() >= event.getEnd()) {
                return false;
            }
            if (e.getEnd() > event.getStart()) {
                return true;
            }
        }
        return false;
    }

    class Event implements Comparable<Event> {
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public Event(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Event o) {
            return this.start - o.start;
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
//leetcode submit region end(Prohibit modification and deletion)

    
}