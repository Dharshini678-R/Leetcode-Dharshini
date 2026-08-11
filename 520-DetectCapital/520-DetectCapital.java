// Last updated: 8/11/2026, 4:11:39 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
               word.equals(word.toLowerCase()) ||
               (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase()));
    }
}