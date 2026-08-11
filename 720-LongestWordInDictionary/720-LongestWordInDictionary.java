// Last updated: 8/11/2026, 4:09:24 PM
class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);

        Set<String> valid = new HashSet<>();
        valid.add("");

        String ans = "";

        for (String word : words) {
            if (valid.contains(word.substring(0, word.length() - 1))) {
                valid.add(word);

                if (word.length() > ans.length()) {
                    ans = word;
                }
            }
        }

        return ans;
    }
}