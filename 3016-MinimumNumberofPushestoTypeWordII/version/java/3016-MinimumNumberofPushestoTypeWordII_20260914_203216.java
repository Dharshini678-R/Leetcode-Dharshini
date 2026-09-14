// Last updated: 9/14/2026, 8:32:16 PM
1import java.util.*;
2
3class Solution {
4    public int minimumPushes(String word) {
5        int[] freq = new int[26];
6
7        for (char c : word.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        Arrays.sort(freq);
12
13        int ans = 0;
14        int push = 1;
15        int count = 0;
16
17        for (int i = 25; i >= 0; i--) {
18            if (freq[i] == 0) break;
19
20            ans += freq[i] * push;
21            count++;
22
23            if (count == 8) {
24                count = 0;
25                push++;
26            }
27        }
28
29        return ans;
30    }
31}