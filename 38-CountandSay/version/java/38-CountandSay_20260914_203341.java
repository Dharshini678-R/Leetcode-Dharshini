// Last updated: 9/14/2026, 8:33:41 PM
1class Solution {
2    public String countAndSay(int n) {
3
4        String result = "1";
5
6        for (int i = 2; i <= n; i++) {
7
8            StringBuilder next = new StringBuilder();
9
10            int count = 1;
11
12            for (int j = 1; j < result.length(); j++) {
13
14                if (result.charAt(j) == result.charAt(j - 1)) {
15                    count++;
16                } 
17                else {
18                    next.append(count);
19                    next.append(result.charAt(j - 1));
20                    count = 1;
21                }
22            }
23
24            next.append(count);
25            next.append(result.charAt(result.length() - 1));
26
27            result = next.toString();
28        }
29
30        return result;
31    }
32}