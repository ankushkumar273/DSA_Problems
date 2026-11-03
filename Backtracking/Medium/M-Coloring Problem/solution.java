class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        boolean[][] graph = new boolean[v][v];
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int w = edges[i][1];
            graph[u][w] = true;
            graph[w][u] = true;
            
        }
        int [] color = new int[v];
        return solve(0,v,m,graph,color);
    }
    boolean isSafe(int node, int c, boolean[][] graph, int[] color){
        for(int i=0; i<graph.length; i++){
            if(graph[node][i] && color[i] == c){
                return false;
            }
        }
        return true;
    }
    boolean solve(int node, int v, int m, boolean[][] graph, int[] color){
        if(node == v){
            return true;
        }
        for(int c=1; c<=m; c++){
            if(isSafe(node, c, graph, color)){
                color[node] = c;
                if(solve(node + 1, v, m, graph, color)) {
                    return true;
                }
                color[node] = 0;
            }
        }
        return false;
    }
    
}
