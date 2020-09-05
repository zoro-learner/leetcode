package leetcode.editor.cn;

//Given n points in the plane that are all pairwise distinct, a "boomerang" is a
// tuple of points (i, j, k) such that the distance between i and j equals the dis
//tance between i and k (the order of the tuple matters). 
//
// Find the number of boomerangs. You may assume that n will be at most 500 and 
//coordinates of points are all in the range [-10000, 10000] (inclusive). 
//
// Example: 
//
// 
//Input:
//[[0,0],[1,0],[2,0]]
//
//Output:
//2
//
//Explanation:
//The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
// 
//
// 
// Related Topics 哈希表 
// 👍 103 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zoro-learner
 * @create 2020-09-03 08:57:29
 */
public class NumberOfBoomerangs {
    public static void main(String[] args) {
        Solution solution = new NumberOfBoomerangs().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int dist = getDistance(points[i], points[j]);
                updateMap(map, getHash(points[i]), dist);
                updateMap(map, getHash(points[j]), dist);
            }
        }
        int res = 0;
        for (Integer hash : map.keySet()) {
            Map<Integer, Integer> innerMap = map.get(hash);
            res += getCount(innerMap);
        }
        return res;
    }

    private int getHash(int[] p) {
        assert p.length == 2;
        return 20007 * p[0] + p[1];
    }

    private int getDistance(int[] p1, int[] p2) {
        assert p1.length == 2 && p2.length == 2;
        return square(p1[0] - p2[0]) + square(p1[1] - p2[1]);
    }

    private int square(int x) {
        return x * x;
    }

    private int getCount(Map<Integer, Integer> map) {
        int res = 0;
        for (int count : map.values()) {
            if (count > 1) {
                res += count * (count - 1);
            }
        }
        return res;
    }

    private void updateMap(Map<Integer, Map<Integer, Integer>> map, int hash, int dist) {
        Map<Integer, Integer> innerMap;
        if (!map.containsKey(hash)) {
            innerMap = new HashMap<>();
            map.put(hash, innerMap);
        }
        innerMap = map.get(hash);
        innerMap.put(dist, innerMap.getOrDefault(dist, 0) + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}