// Last updated: 8/11/2026, 4:12:01 PM

class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}