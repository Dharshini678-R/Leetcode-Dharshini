// Last updated: 9/14/2026, 8:23:18 PM
1class Solution {
2    public int minSteps(String s, String t) {
3
4        int[] count = new int[26];
5
6        for (char c : s.toCharArray()) {
7            count[c - 'a']++;
8        }
9
10        for (char c : t.toCharArray()) {
11            count[c - 'a']--;
12        }
13
14        int ans = 0;
15
16        for (int x : count) {
17            if (x > 0) {
18                ans += x;
19            }
20        }
21
22        return ans;
23    }
24}