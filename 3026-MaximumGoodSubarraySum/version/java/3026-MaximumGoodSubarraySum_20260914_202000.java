// Last updated: 9/14/2026, 8:20:00 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max = nums[0];
5        int min = nums[0];
6        int ans = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            int x = nums[i];
11
12            if (x < 0) {
13                int temp = max;
14                max = min;
15                min = temp;
16            }
17
18            max = Math.max(x, max * x);
19            min = Math.min(x, min * x);
20
21            ans = Math.max(ans, max);
22        }
23
24        return ans;
25    }
26}