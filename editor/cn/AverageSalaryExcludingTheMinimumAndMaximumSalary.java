package leetcode.editor.cn;

//Given an array of unique integers salary where salary[i] is the salary of the 
//employee i. 
//
// Return the average salary of employees excluding the minimum and maximum sala
//ry. 
//
// 
// Example 1: 
//
// 
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
// 
//
// Example 2: 
//
// 
//Input: salary = [1000,2000,3000]
//Output: 2000.00000
//Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000)/1= 2000
// 
//
// Example 3: 
//
// 
//Input: salary = [6000,5000,4000,3000,2000,1000]
//Output: 3500.00000
// 
//
// Example 4: 
//
// 
//Input: salary = [8000,9000,2000,3000,6000,1000]
//Output: 4750.00000
// 
//
// 
// Constraints: 
//
// 
// 3 <= salary.length <= 100 
// 10^3 <= salary[i] <= 10^6 
// salary[i] is unique. 
// Answers within 10^-5 of the actual value will be accepted as correct. 
// Related Topics 排序 数组 
// 👍 11 👎 0


/**
 * @author zoro-learner
 * @create 2020-08-24 17:03:43
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        Solution solution = new AverageSalaryExcludingTheMinimumAndMaximumSalary().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double average(int[] salary) {
        assert salary.length >= 3;
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for (int num : salary) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}