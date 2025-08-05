class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
         List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]); 
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n]; 
        q.offer(src);
        vis[src] = true;
        while(!q.isEmpty()){
            int cur = q.poll();
            if (cur == dest) return true;
            for(int ele : graph.get(cur)){
                if(!vis[ele]){
                    vis[ele] = true;
                    q.offer(ele);
                }
            }
        }
        return false;
        
    }
}