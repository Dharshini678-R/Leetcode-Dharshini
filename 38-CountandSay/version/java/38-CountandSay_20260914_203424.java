// Last updated: 9/14/2026, 8:34:24 PM
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1 || numRows >= s.length()) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9
10        for (int i = 0; i < numRows; i++) {
11            rows[i] = new StringBuilder();
12        }
13
14        int row = 0;
15        int direction = 1;
16
17        for (char c : s.toCharArray()) {
18
19            rows[row].append(c);
20
21            if (row == 0) {
22                direction = 1;
23            } 
24            else if (row == numRows - 1) {
25                direction = -1;
26            }
27
28            row += direction;
29        }
30
31        StringBuilder ans = new StringBuilder();
32
33        for (StringBuilder r : rows) {
34            ans.append(r);
35        }
36
37        return ans.toString();
38    }
39}