// Last updated: 9/14/2026, 8:18:39 PM
1import java.util.*;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5
6        HashSet<Integer> set = new HashSet<>();
7
8        for (int x : nums) {
9            set.add(x);
10        }
11
12        int ans = 0;
13
14        for (int x : set) {
15
16            if (!set.contains(x - 1)) {
17
18                int current = x;
19                int count = 1;
20
21                while (set.contains(current + 1)) {
22                    current++;
23                    count++;
24                }
25
26                ans = Math.max(ans, count);
27            }
28        }
29
30        return ans;
31    }
32}