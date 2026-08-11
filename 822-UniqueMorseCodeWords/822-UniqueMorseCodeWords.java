// Last updated: 8/11/2026, 4:08:05 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}