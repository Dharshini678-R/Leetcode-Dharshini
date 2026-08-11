// Last updated: 8/11/2026, 4:08:49 PM

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = 0, prev1 = 0;

        for (int i = 2; i <= cost.length; i++) {
            int current = Math.min(prev1 + cost[i - 1], prev2 + cost[i - 2]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}