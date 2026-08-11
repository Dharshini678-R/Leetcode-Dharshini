// Last updated: 8/11/2026, 4:08:57 PM
// 744. Find Smallest Letter Greater Than Target
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (letters[m] <= target) l = m + 1;
            else r = m - 1;
        }
        return letters[l % letters.length];
    }
}