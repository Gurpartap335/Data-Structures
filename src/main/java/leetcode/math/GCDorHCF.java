package leetcode.math;

// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
// https://www.geeksforgeeks.org/program-to-find-lcm-of-two-numbers/

import java.util.Collections;

public class GCDorHCF {

    public static void main(String[] args) {

    }

    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans = new Long[2];
        ans[0] = lcm(A, B);
        ans[1] = hcf(A, B);
        return ans;
    }

    static Long lcm(Long a, Long b) {
        return (a * b) / hcf(a, b);
    }

    static Long hcf(Long a, Long b) {
        if (a == 0) {
            return b;
        }
        return hcf(b % a, a);
    }

}

// Time Complexity
// O(log(min(A, B))
