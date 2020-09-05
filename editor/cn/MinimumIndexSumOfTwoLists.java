package leetcode.editor.cn;

//
//Suppose Andy and Doris want to choose a restaurant for dinner, and they both h
//ave a list of favorite restaurants represented by strings. 
// 
// 
//You need to help them find out their common interest with the least list index
// sum. If there is a choice tie between answers, output all of them with no order
// requirement. You could assume there always exists an answer.
// 
//
//
// Example 1: 
// 
//Input:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
//Output: ["Shogun"]
//Explanation: The only restaurant they both like is "Shogun".
// 
// 
//
// Example 2: 
// 
//Input:
//["Shogun", "Tapioca Express", "Burger King", "KFC"]
//["KFC", "Shogun", "Burger King"]
//Output: ["Shogun"]
//Explanation: The restaurant they both like and have the least index sum is "Sh
//ogun" with index sum 1 (0+1).
// 
// 
//
//
// Note: 
// 
// The length of both lists will be in the range of [1, 1000]. 
// The length of strings in both lists will be in the range of [1, 30]. 
// The index is starting from 0 to the list length minus 1. 
// No duplicates in both lists. 
// 
// Related Topics 哈希表 
// 👍 82 👎 0


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author zoro-learner
 * @create 2020-09-04 10:13:22
 */
public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        Solution solution = new MinimumIndexSumOfTwoLists().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> indexOfList1 = IntStream.range(0, list1.length).boxed().collect(Collectors.toMap(i -> list1[i], Function.identity()));
        Map<Integer, List<String>> res = new HashMap<>();
        int min = list1.length + list2.length;
        for (int i = 0; i < list2.length; i++) {
            if (indexOfList1.containsKey(list2[i])) {
                int sum = i + indexOfList1.get(list2[i]);
                if (sum <= min) {
                    if (!res.containsKey(sum)) {
                        res.put(sum, new ArrayList<>());
                    }
                    res.get(sum).add(list2[i]);
                    min = sum;
                }
            }
        }
        return res.get(min).toArray(new String[0]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}