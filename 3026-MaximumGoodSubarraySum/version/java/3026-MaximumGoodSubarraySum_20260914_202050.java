// Last updated: 9/14/2026, 8:20:50 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5
6        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
7
8        List<int[]> list = new ArrayList<>();
9
10        int start = intervals[0][0];
11        int end = intervals[0][1];
12
13        for (int i = 1; i < intervals.length; i++) {
14
15            if (intervals[i][0] <= end) {
16                end = Math.max(end, intervals[i][1]);
17            } 
18            else {
19                list.add(new int[]{start, end});
20
21                start = intervals[i][0];
22                end = intervals[i][1];
23            }
24        }
25
26        list.add(new int[]{start, end});
27
28        return list.toArray(new int[list.size()][]);
29    }
30}