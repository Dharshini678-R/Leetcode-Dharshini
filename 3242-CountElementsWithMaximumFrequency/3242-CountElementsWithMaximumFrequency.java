// Last updated: 8/11/2026, 4:04:33 PM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        // Calculate total count of elements with maximum frequency
        int ans = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                ans += freq;
            }
        }

        return ans;
    }
}