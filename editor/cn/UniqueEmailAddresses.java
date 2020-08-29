package leetcode.editor.cn;

//Every email consists of a local name and a domain name, separated by the @ sig
//n. 
//
// For example, in alice@leetcode.com, alice is the local name, and leetcode.com
// is the domain name. 
//
// Besides lowercase letters, these emails may contain '.'s or '+'s. 
//
// If you add periods ('.') between some characters in the local name part of an
// email address, mail sent there will be forwarded to the same address without do
//ts in the local name. For example, "alice.z@leetcode.com" and "alicez@leetcode.c
//om" forward to the same email address. (Note that this rule does not apply for d
//omain names.) 
//
// If you add a plus ('+') in the local name, everything after the first plus si
//gn will be ignored. This allows certain emails to be filtered, for example m.y+n
//ame@email.com will be forwarded to my@email.com. (Again, this rule does not appl
//y for domain names.) 
//
// It is possible to use both of these rules at the same time. 
//
// Given a list of emails, we send one email to each address in the list. How ma
//ny different addresses actually receive mails? 
//
// 
//
// 
// Example 1: 
//
// 
//Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","t
//estemail+david@lee.tcode.com"]
//Output: 2
//Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually r
//eceive mails
// 
//
// 
//
// Note: 
//
// 
// 1 <= emails[i].length <= 100 
// 1 <= emails.length <= 100 
// Each emails[i] contains exactly one '@' character. 
// All local and domain names are non-empty. 
// Local names do not start with a '+' character. 
// 
// 
// Related Topics 字符串 
// 👍 127 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zoro-learner
 * @create 2020-08-29 10:25:27
 */
public class UniqueEmailAddresses {
    public static void main(String[] args) {
        Solution solution = new UniqueEmailAddresses().new Solution();
        
    }
    
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            set.add(realEmail(email));
        }
        return set.size();
    }

    private String realEmail(String email) {
        int atIdx = email.indexOf('@');
        int firstPlusIdx = email.indexOf('+');
        int localIdx = atIdx;
        if (firstPlusIdx != -1 && firstPlusIdx < atIdx) {
            localIdx = firstPlusIdx;
        }
        String local = email.substring(0, localIdx).replace(".", "");
        return local + email.substring(atIdx);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

    
}