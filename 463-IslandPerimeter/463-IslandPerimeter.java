// Last updated: 8/11/2026, 4:11:58 PM
// 463. Island Perimeter
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;
                    for (int[] d : dirs) {
                        int nr = r + d[0], nc = c + d[1];
                        if (nr >= 0 && nr < grid.length && nc >= 0
                                && nc < grid[0].length && grid[nr][nc] == 1) {
                            perimeter--;
                        }
                    }
                }
            }
        }
        return perimeter;
    }
}