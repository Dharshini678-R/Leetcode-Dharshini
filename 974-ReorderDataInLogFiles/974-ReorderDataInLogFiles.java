// Last updated: 8/11/2026, 4:07:32 PM
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            int i = a.indexOf(' ');
            int j = b.indexOf(' ');

            String idA = a.substring(0, i);
            String idB = b.substring(0, j);

            String contentA = a.substring(i + 1);
            String contentB = b.substring(j + 1);

            boolean isDigitA = Character.isDigit(contentA.charAt(0));
            boolean isDigitB = Character.isDigit(contentB.charAt(0));

            if (!isDigitA && !isDigitB) {
                int cmp = contentA.compareTo(contentB);
                if (cmp != 0) {
                    return cmp;
                }
                return idA.compareTo(idB);
            }
            if (isDigitA && isDigitB) {
                return 0;
            }
            return isDigitA ? 1 : -1;
        });

        return logs;
    }
}