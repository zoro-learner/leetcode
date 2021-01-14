package leetcode.editor.cn;

//A robot on an infinite grid starts at point (0, 0) and faces north. The robot 
//can receive one of three possible types of commands: 
//
// 
// -2: turn left 90 degrees 
// -1: turn right 90 degrees 
// 1 <= x <= 9: move forward x units 
// 
//
// Some of the grid squares are obstacles. 
//
// The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1]) 
//
// If the robot would try to move onto them, the robot stays on the previous gri
//d square instead (but still continues following the rest of the route.) 
//
// Return the square of the maximum Euclidean distance that the robot will be fr
//om the origin. 
//
// 
//
// Example 1: 
//
// 
//Input: commands = [4,-1,3], obstacles = []
//Output: 25
//Explanation: robot will go to (3, 4)
// 
//
// 
// Example 2: 
//
// 
//Input: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
//Output: 65
//Explanation: robot will be stuck at (1, 4) before turning left and going to (1
//, 8)
// 
// 
//
// 
//
// Note: 
//
// 
// 0 <= commands.length <= 10000 
// 0 <= obstacles.length <= 10000 
// -30000 <= obstacle[i][0] <= 30000 
// -30000 <= obstacle[i][1] <= 30000 
// The answer is guaranteed to be less than 2 ^ 31. 
// 
// Related Topics 贪心算法 
// 👍 110 👎 0


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-10-04 16:19:30
 */
public class WalkingRobotSimulation {
    public static void main(String[] args) {
        Solution solution = new WalkingRobotSimulation().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Map<Integer, Set<Integer>> xMap = new HashMap<>();
        Map<Integer, Set<Integer>> yMap = new HashMap<>();
        for (int[] point : obstacles) {
            xMap.computeIfAbsent(point[0], k -> new HashSet<>()).add(point[1]);
            yMap.computeIfAbsent(point[1], k -> new HashSet<>()).add(point[0]);
        }

        int x = 0;
        int y = 0;
        int face = 0;
        int res = 0;
        for (int command : commands) {
            if (command == -1) {
                face = (face + 1) % 4;
            } else if (command == -2) {
                face = (face + 3) % 4; // '%' in java could get negative value
//                System.out.println(face);
            } else {
                switch (face) {
                    case 0:
                        for (int i = 0; i < command; i++) {
                            if (xMap.containsKey(x) && xMap.get(x).contains(y + 1)) {
                                break;
                            }
                            y++;
                        }
                        break;
                    case 1:
                        for (int i = 0; i < command; i++) {
                            if (yMap.containsKey(y) && yMap.get(y).contains(x + 1)) {
                                break;
                            }
                            x++;
                        }
                        break;
                    case 2:
                        for (int i = 0; i < command; i++) {
                            if (xMap.containsKey(x) && xMap.get(x).contains(y - 1)) {
                                break;
                            }
                            y--;
                        }
                        break;
                    case 3:
                        for (int i = 0; i < command; i++) {
                            if (yMap.containsKey(y) && yMap.get(y).contains(x - 1)) {
                                break;
                            }
                            x--;
                        }
                        break;
                }
//                System.out.println(x + " " + y);
                int dist = x * x + y * y;
                res = Math.max(res, dist);
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}