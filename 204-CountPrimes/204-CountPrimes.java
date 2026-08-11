// Last updated: 8/11/2026, 4:14:13 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int cnt=0;
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2;i < n; i++) {
            if (prime[i]) {
                cnt++;
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return cnt;
    }
}