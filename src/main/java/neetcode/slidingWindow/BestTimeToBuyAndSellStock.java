package neetcode.slidingWindow;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1,2,1,2};
        System.out.println(maxProfit(arr));
    }

    // sliding window
    // T : O(n) S : O(1)
    // buy low sell high
    static int maxProfit(int[] prices) {
        int l = 0; // left-buy
        int r = 1; // right-sell
        int maxProfit = 0;
        int profit = 0;

        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r; // if selling stock is less than buying stock then update buy pointer
                // we have to buy when stocks are in the lowest.
            }
            r += 1;
        }
        return maxProfit;
    }
}

/**
 * There's two types of sliding windows. Fixed sized and dynamic. Fixed sized windows have a set window size.
 * Dynamic usually has two pointers that move in the same direction as this problem and
 * Longest Substring Without Repeating Characters.
 * The window expands and shrinks depending on the subset you're looking at in the array.
 * Two pointers are essentially a subset of sliding window and are more generalized as they can move different directions
 * that cause them to cross or can be on different arrays. They still have a window per se think as the pointers move
 * towards each other the window is the left and right boundaries but is constantly shrinking.
 *
 * If all of that is confusing just think a window can have a fixed sized or have two pointers that move in different
 * directions and/or speed that grows and shrinks the window to capture a specific part of the problem.
 */