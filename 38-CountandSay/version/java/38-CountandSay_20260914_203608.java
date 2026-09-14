// Last updated: 9/14/2026, 8:36:08 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        boolean[][] row = new boolean[9][9];
5        boolean[][] col = new boolean[9][9];
6        boolean[][] box = new boolean[9][9];
7
8        for (int i = 0; i < 9; i++) {
9
10            for (int j = 0; j < 9; j++) {
11
12                if (board[i][j] == '.') {
13                    continue;
14                }
15
16                int num = board[i][j] - '1';
17                int boxIndex = (i / 3) * 3 + (j / 3);
18
19                if (row[i][num] ||
20                    col[j][num] ||
21                    box[boxIndex][num]) {
22
23                    return false;
24                }
25
26                row[i][num] = true;
27                col[j][num] = true;
28                box[boxIndex][num] = true;
29            }
30        }
31
32        return true;
33    }
34}