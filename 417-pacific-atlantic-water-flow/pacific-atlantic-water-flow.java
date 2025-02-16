class Solution {

    private int[][] heights;
    private int m, n;
    private boolean[][] pacificReach, atlanticReach;
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        if (heights == null || heights.length == 0) return new ArrayList<>();
        this.m = heights.length;
        this.n = heights[0].length;
        this.heights = heights;

        pacificReach = new boolean[m][n];
        atlanticReach = new boolean[m][n];

        // Start DFS from the Pacific (left & top) and Atlantic (right & bottom)
        for (int r = 0; r < m; r++) {
            dfs(r, 0, pacificReach);   // Left edge 
            dfs(r, n - 1, atlanticReach); // Right edge 
        }
        for (int c = 0; c < n; c++) {
            dfs(0, c, pacificReach);   // Top edge 
            dfs(m - 1, c, atlanticReach); // Bottom edge 
        }

        // Collect all cells that can reach both oceans
        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (pacificReach[r][c] && atlanticReach[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }
        return result;
    }

    private void dfs(int r, int c, boolean[][] reach) {
        reach[r][c] = true; 

        for (int[] d : directions) {
            int nr = r + d[0], nc = c + d[1];

            // Check if the new cell is within bounds and not visited
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && !reach[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, reach);
            }
        }
    }
}