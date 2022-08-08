package Q0542_01Matrix;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    public int[][] updateMatrix(int[][] mat) {
        final int m = mat.length, n = mat[0].length;
        final int MAX = m * n + 1;
        int[][] out = new int[m][n];
        Set<Pair> q = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    q.add(new Pair(i, j));
                    out[i][j] = 0;
                } else {
                    out[i][j] = MAX;
                }
            }
        }

        for (int level = 0; !q.isEmpty(); level++) {
            Set<Pair> p = new HashSet<>();
            for (Pair pair : q) {
                int i = pair.first, j = pair.second;
                if (out[i][j] == MAX) out[i][j] = level; // avoid (i, j) get pushed into set in both last and cur level
                if (i + 1 < m && out[i + 1][j] == MAX) p.add(new Pair(i + 1, j));
                if (j + 1 < n && out[i][j + 1] == MAX) p.add(new Pair(i, j + 1));
                if (i >= 1 && out[i - 1][j] == MAX) p.add(new Pair(i - 1, j));
                if (j >= 1 && out[i][j - 1] == MAX) p.add(new Pair(i, j - 1));
            }
            q = p;
        }

        return out;
    }
}