// Last updated: 9/14/2026, 8:15:17 PM
1import java.util.*;
2
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        HashMap<Integer, Long> map = new HashMap<>();
6
7        long prefix = 0;
8        long ans = Long.MIN_VALUE;
9
10        for (int x : nums) {
11            if (map.containsKey(x - k)) {
12                ans = Math.max(ans, prefix + x - map.get(x - k));
13            }
14
15            if (map.containsKey(x + k)) {
16                ans = Math.max(ans, prefix + x - map.get(x + k));
17            }
18
19            map.put(x, Math.min(map.getOrDefault(x, Long.MAX_VALUE), prefix));
20
21            prefix += x;
22        }
23
24        return ans == Long.MIN_VALUE ? 0 : ans;
25    }
26}