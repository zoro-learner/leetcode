package leetcode.editor.cn;

//We distribute some number of candies, to a row of n = num_people people in the
// following way: 
//
// We then give 1 candy to the first person, 2 candies to the second person, and
// so on until we give n candies to the last person. 
//
// Then, we go back to the start of the row, giving n + 1 candies to the first p
//erson, n + 2 candies to the second person, and so on until we give 2 * n candies
// to the last person. 
//
// This process repeats (with us giving one more candy each time, and moving to 
//the start of the row after we reach the end) until we run out of candies. The la
//st person will receive all of our remaining candies (not necessarily one more th
//an the previous gift). 
//
// Return an array (of length num_people and sum candies) that represents the fi
//nal distribution of candies. 
//
// 
// Example 1: 
//
// 
//Input: candies = 7, num_people = 4
//Output: [1,2,3,1]
//Explanation:
//On the first turn, ans[0] += 1, and the array is [1,0,0,0].
//On the second turn, ans[1] += 2, and the array is [1,2,0,0].
//On the third turn, ans[2] += 3, and the array is [1,2,3,0].
//On the fourth turn, ans[3] += 1 (because there is only one candy left), and th
//e final array is [1,2,3,1].
// 
//
// Example 2: 
//
// 
//Input: candies = 10, num_people = 3
//Output: [5,2,3]
//Explanation: 
//On the first turn, ans[0] += 1, and the array is [1,0,0].
//On the second turn, ans[1] += 2, and the array is [1,2,0].
//On the third turn, ans[2] += 3, and the array is [1,2,3].
//On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
// 
//
// 
// Constraints: 
//
// 
// 1 <= candies <= 10^9 
// 1 <= num_people <= 1000 
// 
// Related Topics 数学 
// 👍 77 👎 0


import java.util.Arrays;

/**
 * @author zoro-learner
 * @create 2020-09-11 09:02:11
 */
public class DistributeCandiesToPeople {
    public static void main(String[] args) {
        Solution solution = new DistributeCandiesToPeople().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int row = 0;
        int sum = num_people * (num_people + 1) / 2;
        int sumStep = num_people * num_people;
        while (candies > sum) {
            candies -= sum;
            row++;
            sum += sumStep;
        }

        int[] res = new int[num_people];
        for (int i = 0; i < num_people; i++) {
            res[i] = (i + 1) * row + num_people * row * (row - 1) / 2;
        }

//        System.out.println(Arrays.toString(res));

        int start = row * num_people + 1;
        int startIdx = 0;
        while (candies >= start) {
            res[startIdx] += start;
            candies -= start;
            start++;
            startIdx++;
        }
        if (candies > 0) {
            res[startIdx] += candies;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}