// Last updated: 9/14/2026, 8:17:11 PM
1class Solution {
2    public int minMovesToCaptureTheQueen(
3        int a, int b, int c, int d, int e, int f) {
4
5        // Rook can capture queen
6        if (a == e) {
7            if (!(c == a && d > Math.min(b, f) && d < Math.max(b, f))) {
8                return 1;
9            }
10        }
11
12        if (b == f) {
13            if (!(d == b && c > Math.min(a, e) && c < Math.max(a, e))) {
14                return 1;
15            }
16        }
17
18        // Bishop can capture queen
19        if (c - d == e - f) {
20            if (!(a - b == c - d &&
21                  a > Math.min(c, e) && a < Math.max(c, e))) {
22                return 1;
23            }
24        }
25
26        if (c + d == e + f) {
27            if (!(a + b == c + d &&
28                  a > Math.min(c, e) && a < Math.max(c, e))) {
29                return 1;
30            }
31        }
32
33        return 2;
34    }
35}