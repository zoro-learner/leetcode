package leetcode.editor.cn;

//You have N gardens, labelled 1 to N. In each garden, you want to plant one of 
//4 types of flowers. 
//
// paths[i] = [x, y] describes the existence of a bidirectional path from garden
// x to garden y. 
//
// Also, there is no garden that has more than 3 paths coming into or leaving it
//. 
//
// Your task is to choose a flower type for each garden such that, for any two g
//ardens connected by a path, they have different types of flowers. 
//
// Return any such a choice as an array answer, where answer[i] is the type of f
//lower planted in the (i+1)-th garden. The flower types are denoted 1, 2, 3, or 4
//. It is guaranteed an answer exists. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: N = 3, paths = [[1,2],[2,3],[3,1]]
//Output: [1,2,3]
// 
//
// 
// Example 2: 
//
// 
//Input: N = 4, paths = [[1,2],[3,4]]
//Output: [1,2,1,2]
// 
//
// 
// Example 3: 
//
// 
//Input: N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
//Output: [1,2,3,4]
// 
//
// 
//
// Note: 
//
// 
// 1 <= N <= 10000 
// 0 <= paths.size <= 20000 
// No garden has 4 or more paths coming into or leaving it. 
// It is guaranteed an answer exists. 
// 
// 
// 
// 
// Related Topics 图 
// 👍 75 👎 0


import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zoro-learner
 * @create 2020-10-06 10:47:17
 */
public class FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {
        Solution solution = new FlowerPlantingWithNoAdjacent().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] flowers = new int[N];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] path : paths) {
            map.computeIfAbsent(path[0], HashSet::new).add(path[1]);
            map.computeIfAbsent(path[1], HashSet::new).add(path[0]);
        }

        List<Integer> sortedKeys = map.keySet().stream().sorted(Comparator.comparing(k -> map.get(k).size()).reversed()).collect(Collectors.toList());

        Queue<Integer> queue = new ArrayDeque<>();

        for (int key : sortedKeys) {
            queue.add(key);

        }

        for (int key : sortedKeys) {
            for (int i = 1; i <= 4; i++) {
                boolean isValid = true;
                for (int other : map.get(key)) {
                    if (flowers[other - 1] == i) {
                        isValid = false;
                        break;
                    }
                }

            }
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}