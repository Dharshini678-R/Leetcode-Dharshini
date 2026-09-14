// Last updated: 9/14/2026, 8:16:48 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> findWinners(int[][] matches) {
5        HashMap<Integer, Integer> losses = new HashMap<>();
6
7        for (int[] match : matches) {
8            int winner = match[0];
9            int loser = match[1];
10
11            losses.putIfAbsent(winner, 0);
12            losses.put(loser, losses.getOrDefault(loser, 0) + 1);
13        }
14
15        List<Integer> zero = new ArrayList<>();
16        List<Integer> one = new ArrayList<>();
17
18        for (int player : losses.keySet()) {
19            if (losses.get(player) == 0) {
20                zero.add(player);
21            } 
22            else if (losses.get(player) == 1) {
23                one.add(player);
24            }
25        }
26
27        Collections.sort(zero);
28        Collections.sort(one);
29
30        List<List<Integer>> ans = new ArrayList<>();
31        ans.add(zero);
32        ans.add(one);
33
34        return ans;
35    }
36}