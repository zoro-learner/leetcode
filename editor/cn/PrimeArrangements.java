package leetcode.editor.cn;

//Return the number of permutations of 1 to n so that prime numbers are at prime
// indices (1-indexed.) 
//
// (Recall that an integer is prime if and only if it is greater than 1, and can
//not be written as a product of two positive integers both smaller than it.) 
//
// Since the answer may be large, return the answer modulo 10^9 + 7. 
//
// 
// Example 1: 
//
// 
//Input: n = 5
//Output: 12
//Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] i
//s not because the prime number 5 is at index 1.
// 
//
// Example 2: 
//
// 
//Input: n = 100
//Output: 682289015
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 100 
// 
// Related Topics 数学 
// 👍 21 👎 0


/**
 * @author zoro-learner
 * @create 2020-09-10 15:09:09
 */
public class PrimeArrangements {
    public static void main(String[] args) {
        Solution solution = new PrimeArrangements().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numPrimeArrangements(int n) {
        final int LIMIT = 1000000007;
        int count = numOfPrimesWithinN(n);
        System.out.println(count);

        int smaller = Math.min(count, n - count);
        long factOfSmaller = getRemainOfFact(1, smaller, LIMIT);
        long factOfOther = getRemainOfFact(smaller + 1, n - smaller, LIMIT);
        long res = factOfSmaller * factOfSmaller % LIMIT * factOfOther % LIMIT;
        return (int) res;
    }

    private long getRemainOfFact(int fromNum, int toNum, int modNum) {
        long res = 1;
        for (int i = fromNum; i <= toNum; i++) {
            res = res * i % modNum;
        }
        return res;
    }

    private int numOfPrimesWithinN(int n) {
        int[] primes = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = 1;
                }
            }
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (primes[i] == 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    
}