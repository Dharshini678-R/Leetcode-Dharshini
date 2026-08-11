// Last updated: 8/11/2026, 4:05:11 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        // Count frequency of each character
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
        }

        int n = words.length;

        // Check divisibility
        for (int freq : count) {
            if (freq % n != 0) {
                return false;
            }
        }

        return true;
    }
}