package leetcode.editor.cn;

//You have an array of logs. Each log is a space delimited string of words. 
//
// For each log, the first word in each log is an alphanumeric identifier. Then,
// either: 
//
// 
// Each word after the identifier will consist only of lowercase letters, or; 
// Each word after the identifier will consist only of digits. 
// 
//
// We will call these two varieties of logs letter-logs and digit-logs. It is gu
//aranteed that each log has at least one word after its identifier. 
//
// Reorder the logs so that all of the letter-logs come before any digit-log. Th
//e letter-logs are ordered lexicographically ignoring identifier, with the identi
//fier used in case of ties. The digit-logs should be put in their original order.
// 
//
// Return the final order of the logs. 
//
// 
// Example 1: 
// Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","l
//et3 art zero"]
//Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig
//2 3 6"]
// 
// 
// Constraints: 
//
// 
// 0 <= logs.length <= 100 
// 3 <= logs[i].length <= 100 
// logs[i] is guaranteed to have an identifier, and a word after the identifier.
// 
// 
// Related Topics 字符串 
// 👍 43 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-08-29 10:32:20
 */
public class ReorderDataInLogFiles {
    public static void main(String[] args) {
        Solution solution = new ReorderDataInLogFiles().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String[]> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        for (String log : logs) {
            String[] strs = log.split(" ", 2);
//            System.out.println(Arrays.toString(strs));
            if (Character.isLetter(strs[1].charAt(0))) {
                letters.add(strs);
            } else {
                digits.add(log);
            }
        }
        List<String> sortedLetters = letters.stream().sorted(Comparator.comparing((String[] o) -> o[1]).thenComparing(o -> o[0])).map(t -> t[0] + " " + t[1]).collect(Collectors.toList());

        List<String> sortedLogs = new ArrayList<>();
        sortedLogs.addAll(sortedLetters);
        sortedLogs.addAll(digits);
        return sortedLogs.toArray(new String[0]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}