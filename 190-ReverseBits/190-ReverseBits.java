// Last updated: 8/11/2026, 4:14:38 PM
// 190. Reverse Bits
public class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = (ans << 1) | (n & 1);
            n >>>= 1;
        }
        return ans;
    }
}