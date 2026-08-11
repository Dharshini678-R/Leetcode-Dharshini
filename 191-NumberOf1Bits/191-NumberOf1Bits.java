// Last updated: 8/11/2026, 4:14:35 PM
// 191. Number of 1 Bits
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}