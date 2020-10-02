package leetcode.editor.cn;

//Write a program that outputs the string representation of numbers from 1 to n.
// 
//
// But for multiples of three it should output “Fizz” instead of the number and 
//for the multiples of five output “Buzz”. For numbers which are multiples of both
// three and five output “FizzBuzz”. 
//
// Example:
// 
//n = 15,
//
//Return:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
// 👍 72 👎 0


import java.util.ArrayList;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-09-23 20:16:10
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new FizzBuzz().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String str = "";
            if (i % 15 == 0) {
                str = "FizzBuzz";
            } else if (i % 5 == 0) {
                str = "Buzz";
            } else if (i % 3 == 0) {
                str = "Fizz";
            } else {
                str += i;
            }
            res.add(str);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}