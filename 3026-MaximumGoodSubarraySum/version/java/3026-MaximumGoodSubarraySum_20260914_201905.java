// Last updated: 9/14/2026, 8:19:05 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3
4        int total = 0;
5
6        int maxSum = nums[0];
7        int currentMax = 0;
8
9        int minSum = nums[0];
10        int currentMin = 0;
11
12        for (int x : nums) {
13
14            currentMax = Math.max(x, currentMax + x);
15            maxSum = Math.max(maxSum, currentMax);
16
17            currentMin = Math.min(x, currentMin + x);
18            minSum = Math.min(minSum, currentMin);
19
20            total += x;
21        }
22
23        if (maxSum < 0) {
24            return maxSum;
25        }
26
27        return Math.max(maxSum, total - minSum);
28    }
29}