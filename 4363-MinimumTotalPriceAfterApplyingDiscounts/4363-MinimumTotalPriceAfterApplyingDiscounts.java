// Last updated: 8/11/2026, 4:04:07 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int n = prices.length;
        int m = discounts.length;
        double total = 0.0;
        int count = Math.min(n,m);
        for(int i=0;i<count;i++){
            int price = prices[n-1-i];
            int discount = discounts[m-1-i];
            total+=price*(100.0-discount)/100.0;
        }
        for(int i=0;i<n-count;i++){
            total+=prices[i];
        }
        return total;
    }
}