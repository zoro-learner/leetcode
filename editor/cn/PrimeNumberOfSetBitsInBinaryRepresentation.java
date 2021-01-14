package leetcode.editor.cn;

//
//Given two integers L and R, find the count of numbers in the range [L, R] (inc
//lusive) having a prime number of set bits in their binary representation.
// 
//(Recall that the number of set bits an integer has is the number of 1s present
// when written in binary. For example, 21 written in binary is 10101 which has 3 
//set bits. Also, 1 is not a prime.)
// 
//
// Example 1: 
//Input: L = 6, R = 10
//Output: 4
//Explanation:
//6 -> 110 (2 set bits, 2 is prime)
//7 -> 111 (3 set bits, 3 is prime)
//9 -> 1001 (2 set bits , 2 is prime)
//10->1010 (2 set bits , 2 is prime)
// 
//
// Example 2: 
//Input: L = 10, R = 15
//Output: 5
//Explanation:
//10 -> 1010 (2 set bits, 2 is prime)
//11 -> 1011 (3 set bits, 3 is prime)
//12 -> 1100 (2 set bits, 2 is prime)
//13 -> 1101 (3 set bits, 3 is prime)
//14 -> 1110 (3 set bits, 3 is prime)
//15 -> 1111 (4 set bits, 4 is not prime)
// 
//
// Note: 
// L, R will be integers L <= R in the range [1, 10^6]. 
// R - L will be at most 10000. 
// Related Topics 位运算 
// 👍 47 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-10-06 10:19:01
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    public static void main(String[] args) {
        Solution solution = new PrimeNumberOfSetBitsInBinaryRepresentation().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    private final Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for (int i = L; i <= R; i++) {
            if (isBitPrime(i)) {
                res++;
            }
        }
        return res;
    }

    private boolean isBitPrime(int n) {
        return isPrime(numOfOne(n));
    }

    private boolean isPrime(int n) {
        return primes.contains(n);
    }

    private int numOfOne(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}