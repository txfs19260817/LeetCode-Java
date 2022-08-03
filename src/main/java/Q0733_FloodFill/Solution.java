package Q0733_FloodFill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        if (color != target) dfs(image, sr, sc, color, target);
        return image;
    }

    void dfs(int[][] image, int r, int c, int color, int target) {
        if (image[r][c] != target) {
            return;
        }
        image[r][c] = color;
        if (r + 1 < image.length) dfs(image, r + 1, c, color, target);
        if (r >= 1) dfs(image, r - 1, c, color, target);
        if (c + 1 < image[0].length) dfs(image, r, c + 1, color, target);
        if (c >= 1) dfs(image, r, c - 1, color, target);
    }
}