// Last updated: 9/14/2026, 8:16:22 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3        int up = 1;
4        int down = 1;
5        int ans = 1;
6
7        for (int i = 1; i < arr.length; i++) {
8
9            if (arr[i] > arr[i - 1]) {
10                up = down + 1;
11                down = 1;
12            } 
13            else if (arr[i] < arr[i - 1]) {
14                down = up + 1;
15                up = 1;
16            } 
17            else {
18                up = 1;
19                down = 1;
20            }
21
22            ans = Math.max(ans, Math.max(up, down));
23        }
24
25        return ans;
26    }
27}