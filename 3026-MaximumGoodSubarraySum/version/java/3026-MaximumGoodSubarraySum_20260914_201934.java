// Last updated: 9/14/2026, 8:19:34 PM
1import java.util.*;
2
3class Solution {
4    public int subarraySum(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        map.put(0, 1);
9
10        int sum = 0;
11        int count = 0;
12
13        for (int x : nums) {
14
15            sum += x;
16
17            if (map.containsKey(sum - k)) {
18                count += map.get(sum - k);
19            }
20
21            map.put(sum, map.getOrDefault(sum, 0) + 1);
22        }
23
24        return count;
25    }
26}