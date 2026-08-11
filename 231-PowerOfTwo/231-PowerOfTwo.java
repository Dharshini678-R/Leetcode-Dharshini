// Last updated: 8/11/2026, 4:13:51 PM

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}