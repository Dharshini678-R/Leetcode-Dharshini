// Last updated: 9/14/2026, 8:35:34 PM
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for (int x : nums) {
9            map.put(x, map.getOrDefault(x, 0) + 1);
10        }
11
12        PriorityQueue<Integer> pq =
13            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
14
15        for (int x : map.keySet()) {
16
17            pq.add(x);
18
19            if (pq.size() > k) {
20                pq.poll();
21            }
22        }
23
24        int[] ans = new int[k];
25
26        for (int i = k - 1; i >= 0; i--) {
27            ans[i] = pq.poll();
28        }
29
30        return ans;
31    }
32}