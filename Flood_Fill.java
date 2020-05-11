class Solution {
    public static int d [] = {0,1,0,-1,0};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int m = image.length, n = image[0].length;
        if(newColor == image[sr][sc]) return image; // only need to check if there is a change
        dfs(image, sr, sc, m, n, image[sr][sc], newColor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int m, int n, int oldColor, int newColor){
        if(sr < 0 || sr >= m || sc < 0 || sc >= n || image[sr][sc] != oldColor) return;
        image[sr][sc] = newColor;
        for(int i = 0; i < 4; i++){
            int x = sr + d[i], y = sc + d[i + 1];
            dfs(image,x,y,m,n,oldColor, newColor);
        }
    }
}
