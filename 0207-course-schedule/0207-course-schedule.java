class Solution {
    public boolean canFinish(int numCourses, int[][] mat) {
    ArrayList<ArrayList<Integer>> adj_list = new ArrayList<>();
    for(int i =0; i< numCourses ; i++){
        adj_list.add(new ArrayList<>());
    }
    int[] indegree = new int[numCourses];
    for(int i =0; i< mat.length ;i++){
        int[] temp = mat[i];
        int u = temp[0];
        int v = temp[1];
        adj_list.get(v).add(u);
        indegree[u]++;
    }
    // System.out.println(Arrays.toString(indegree));
    int cnt =0;
    Queue<Integer> q = new LinkedList<>();
    for(int i =0; i< numCourses ;i++){
        if(indegree[i]==0) q.offer(i);
    }
    while(!q.isEmpty()){
        int cur = q.poll();
        cnt++;
        for(int neigh : adj_list.get(cur)){
            if(--indegree[neigh]==0) q.offer(neigh);
        }
    }
    // System.out.println(cnt);
     return numCourses==cnt;
    }

}
//     boolean iscycle( ArrayList<ArrayList<Integer>> mat ,int src, int n){
//         Queue<Pair> q = new LinkedList<>();
//         boolean[] vis = new boolean[n];
//         q.offer(new Pair(src,-1));
//         vis[src]=true;
//         while(!q.isEmpty()){
//              Pair cur =  q.poll();
//              for(int neigh : mat.get(cur.node)){
//                 if(!vis[neigh]){
//                     vis[neigh] = true;
//                     q.offer(new Pair( neigh , cur.node));
//                 }
//                 else if(neigh!=cur.parent){
//                     return false;
//                 }
//              }
//         }
//         return true;
//     }
// }
// class Pair{
//     int node;
//     int parent;
//     Pair(int n , int p){
//         node = n;
//         parent =p;
//     }
// }