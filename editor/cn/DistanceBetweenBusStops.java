package leetcode.editor.cn;

//A bus has n stops numbered from 0 to n - 1 that form a circle. We know the dis
//tance between all pairs of neighboring stops where distance[i] is the distance b
//etween the stops number i and (i + 1) % n. 
//
// The bus goes along both directions i.e. clockwise and counterclockwise. 
//
// Return the shortest distance between the given start and destination stops. 
//
// 
// Example 1: 
//
// 
//
// 
//Input: distance = [1,2,3,4], start = 0, destination = 1
//Output: 1
//Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1. 
//
// 
//
// Example 2: 
//
// 
//
// 
//Input: distance = [1,2,3,4], start = 0, destination = 2
//Output: 3
//Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
// 
//
// 
//
// Example 3: 
//
// 
//
// 
//Input: distance = [1,2,3,4], start = 0, destination = 3
//Output: 4
//Explanation: Distance between 0 and 3 is 6 or 4, minimum is 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 10^4 
// distance.length == n 
// 0 <= start, destination < n 
// 0 <= distance[i] <= 10^4 
// Related Topics 数组 
// 👍 36 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-08-20 16:53:18
 */
public class DistanceBetweenBusStops {
    public static void main(String[] args) {
        Solution solution = new DistanceBetweenBusStops().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = Arrays.stream(distance).sum();
        int clockWiseSum = 0;
        if (start > destination) {
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        for (int i = start; i < destination; i++) {
            clockWiseSum += distance[i];
        }
        return Math.min(clockWiseSum, sum - clockWiseSum);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}