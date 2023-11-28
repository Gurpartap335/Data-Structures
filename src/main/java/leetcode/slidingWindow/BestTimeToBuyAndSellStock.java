package leetcode.slidingWindow;

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
        int buy = 0;
        int sell = 1;
        int maxProfit = 0;
        int profit;

        while (sell < prices.length) {
            if (prices[buy] < prices[sell]) {
                profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = sell;
                // if we find new value which less current buy we update our
                // buy value. Buy at low sell at high.
            }
            sell++;
        }
        return maxProfit;
    }
}

/**
 * There's two types of sliding windows.
 * Fixed sized and dynamic.
 * Fixed sized windows have a set window size.
 * Dynamic usually has two pointers that move in the same direction as this problem and
 * Longest Substring Without Repeating Characters.
 *
 * The window expands and shrinks depending on the subset you're looking at in the array.
 * Two pointers are essentially a subset of sliding window and are more generalized as
 * they can move different directions that cause them to cross or can be on different arrays.
 * They still have a window per se think as the pointers move towards each other the window
 * is the left and right boundaries but is constantly shrinking.
 *
 * If all of that is confusing just think a window can have a fixed sized or have two pointers
 * that move in different directions and/or speed that grows and shrinks the window to capture
 * a specific part of the problem.
 */