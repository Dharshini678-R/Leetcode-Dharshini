// Last updated: 8/11/2026, 4:11:17 PM
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
}