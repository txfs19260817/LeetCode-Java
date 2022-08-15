package Q0994_RottingOranges;

import java.util.HashSet;
import java.util.Objects;

class Solution {
    private static class Pair {
        private final int first;
        private final int second;

        public Pair(int a, int b) {
            first = a;
            second = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    public int orangesRotting(int[][] grid) {
        int ans = -1, totalFresh = 0;
        HashSet<Pair> rotted = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    rotted.add(new Pair(i, j));
                    totalFresh++;
                } else if (grid[i][j] == 1) {
                    totalFresh++;
                }
            }
        }
        if (rotted.isEmpty()) return totalFresh == 0 ? 0 : -1; // all 0 : no 2
        while (!rotted.isEmpty()) {
            HashSet<Pair> next = new HashSet<>();
            totalFresh -= rotted.size();
            for (Pair pt : rotted) {
                grid[pt.first][pt.second] = 2; // set all grids in this level to 2 before BFS
            }
            for (Pair pt : rotted) {
                int i = pt.first, j = pt.second;
                if (i + 1 < grid.length && grid[i + 1][j] == 1) next.add(new Pair(i + 1, j));
                if (j + 1 < grid[0].length && grid[i][j + 1] == 1) next.add(new Pair(i, j + 1));
                if (i - 1 >= 0 && grid[i - 1][j] == 1) next.add(new Pair(i - 1, j));
                if (j - 1 >= 0 && grid[i][j - 1] == 1) next.add(new Pair(i, j - 1));
            }
            ans++;
            rotted = next;
        }
        return totalFresh == 0 ? ans : -1;
    }
}