// Last updated: 8/11/2026, 4:04:21 PM
class Solution {
    public int minimumPushes(String word) {
        int pushes = 0;

        for (int i = 0; i < word.length(); i++) {
            pushes += (i / 8) + 1;
        }

        return pushes;
    }
}