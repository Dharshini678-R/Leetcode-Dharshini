// Last updated: 8/11/2026, 4:08:15 PM
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(
                (double) arr[a[0]] / arr[a[1]],
                (double) arr[b[0]] / arr[b[1]]
            )
        );

        int n = arr.length;

        
        for (int j = 1; j < n; j++) {
            pq.offer(new int[]{0, j});
        }

        
        for (int i = 0; i < k - 1; i++) {
            int[] cur = pq.poll();
            int numIndex = cur[0];
            int denIndex = cur[1];

            
            if (numIndex + 1 < denIndex) {
                pq.offer(new int[]{numIndex + 1, denIndex});
            }
        }

        int[] result = pq.poll();
        return new int[]{arr[result[0]], arr[result[1]]};
    }
}