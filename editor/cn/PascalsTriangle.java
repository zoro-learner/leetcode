package leetcode.editor.cn;

//Given a non-negative integer numRows, generate the first numRows of Pascal's t
//riangle. 
//
// 
//In Pascal's triangle, each number is the sum of the two numbers directly above
// it. 
//
// Example: 
//
// 
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
// 
// Related Topics 数组 
// 👍 336 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zoro-learner
 * @create 2020-08-08 09:56:41
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new PascalsTriangle().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        if (numRows <= 0) {
            return rows;
        }
        List<Integer> row = Arrays.asList(1);
        for (int i = 0; i < numRows; i++) {
            rows.add(row);
            row = nextRow(row);
        }
        return rows;
    }

    private List<Integer> nextRow(List<Integer> row) {
        assert !row.isEmpty() : "Input List should not be empty.";
        List<Integer> res = new ArrayList<>(row.size() + 1);
        res.add(row.get(0));
        for (int i = 1; i < row.size(); i++) {
            res.add(row.get(i - 1) + row.get(i));
        }
        res.add(row.get(row.size() - 1));
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}