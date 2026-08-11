// Last updated: 8/11/2026, 4:13:09 PM
// 342. Power of Four
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0
            && (n & (n - 1)) == 0
            && (n & 0x55555555) != 0;
    }
}