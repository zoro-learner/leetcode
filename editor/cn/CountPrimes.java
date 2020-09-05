package leetcode.editor.cn;

//Count the number of prime numbers less than a non-negative number, n. 
//
// Example: 
//
// 
//Input: 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// 
// Related Topics 哈希表 数学 
// 👍 425 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-02 11:19:56
 */
public class CountPrimes {
    public static void main(String[] args) {
        Solution solution = new CountPrimes().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimes(int n) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
//                System.out.println(i);
                cnt++;
            }
        }
        return cnt;
    }

    private boolean isPrime(int n) {
        if (n < 2 || (n > 2 && n % 2 == 0)) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}