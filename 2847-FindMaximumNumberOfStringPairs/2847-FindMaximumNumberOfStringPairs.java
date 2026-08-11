// Last updated: 8/11/2026, 4:04:46 PM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int count = 0;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();

            if (set.contains(reversed)) {
                count++;
            } else {
                set.add(word);
            }
        }

        return count;
    }
}