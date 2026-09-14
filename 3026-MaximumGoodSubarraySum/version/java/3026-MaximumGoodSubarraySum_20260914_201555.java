// Last updated: 9/14/2026, 8:15:55 PM
1import java.util.*;
2
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        HashSet<Integer> set1 = new HashSet<>();
6        HashSet<Integer> set2 = new HashSet<>();
7
8        for (int x : nums1) {
9            set1.add(x);
10        }
11
12        for (int x : nums2) {
13            set2.add(x);
14        }
15
16        int common = 0;
17
18        for (int x : set1) {
19            if (set2.contains(x)) {
20                common++;
21            }
22        }
23
24        int unique1 = set1.size() - common;
25        int unique2 = set2.size() - common;
26
27        int n = nums1.length / 2;
28
29        int take1 = Math.min(unique1, n);
30        int take2 = Math.min(unique2, n);
31
32        int remaining = 2 * n - take1 - take2;
33
34        int commonTake = Math.min(common, remaining);
35
36        return take1 + take2 + commonTake;
37    }
38}