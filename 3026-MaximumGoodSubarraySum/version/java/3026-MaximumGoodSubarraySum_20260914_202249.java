// Last updated: 9/14/2026, 8:22:49 PM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5
6        StringBuilder ans = new StringBuilder();
7
8        for (int i = words.length - 1; i >= 0; i--) {
9
10            ans.append(words[i]);
11
12            if (i != 0) {
13                ans.append(" ");
14            }
15        }
16
17        return ans.toString();
18    }
19}