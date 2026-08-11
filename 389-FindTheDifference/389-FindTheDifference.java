// Last updated: 8/11/2026, 4:12:41 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray())
            result ^= c;

        for (char c : t.toCharArray())
            result ^= c;

        return result;
    }
}