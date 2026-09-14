// Last updated: 9/14/2026, 8:21:15 PM
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5
6        HashMap<String, List<String>> map = new HashMap<>();
7
8        for (String s : strs) {
9
10            char[] chars = s.toCharArray();
11            Arrays.sort(chars);
12
13            String key = new String(chars);
14
15            map.putIfAbsent(key, new ArrayList<>());
16            map.get(key).add(s);
17        }
18
19        return new ArrayList<>(map.values());
20    }
21}