package leetcode.arrayAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/unique-email-addresses/
public class UniqueEmailAddress {
    public static void main(String[] args) {
        String[] email = {
                "test.email+alex@leetco2222de.com",
                "test.e.mail+bob.cath@le322etcode.com",
                "test...email+divid@leetc3ode.com"
        };
        System.out.println(count2(email));
    }

    /**
     * using inbuilt functions to count number of different emails in string array.
     * @param emails
     * @return number of different emails
     */
    public static int count(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] local= email.split("@");
            local[0] = local[0].replace(".","");
            String[] localAfterPlus = local[0].split("\\+");
            set.add(localAfterPlus[0] + "@" + local[1]);
        }
        return set.size();
    }
    /**
     * https://leetcode.com/problems/unique-email-addresses/solutions/186798/java-python-3-7-and-6-liners-with-comment-and-analysis/?orderBy=most_votes
     * Time and Space : O(n)
     * Let n be the total characters in the input array emails.
     * The HashSet set and the for loop both cost O(n), in terms of space
     * and time, respectively.
     */


    // without using inbuilt functions
    public static int count2(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            StringBuilder sb = new StringBuilder();

            int i = 0;
            while (i < email.length()) {
                char ch = email.charAt(i);

                if (ch == '+' || ch  == '@') {
                    break;
                }
                if (ch != '.') {
                    sb.append(ch);
                }
                i++;
            }

            while (i < email.length()) {
                char ch = email.charAt(i);
                if (ch == '@') {
                    sb.append(email.substring(i));
                    break;
                }
                i++;
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
// Google Adobe Amazon Adobe
