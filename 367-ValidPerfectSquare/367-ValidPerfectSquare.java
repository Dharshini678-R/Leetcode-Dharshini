// Last updated: 8/11/2026, 4:12:52 PM
// 367. Valid Perfect Square
class Solution {
    public boolean isPerfectSquare(int num) {
        long l = 1, r = num;
        while (l <= r) {
            long m = l + (r - l) / 2;
            if (m * m == num) return true;
            if (m * m < num) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}