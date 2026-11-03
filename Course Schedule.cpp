class Solution {
    public boolean toposort(HashMap<Integer,ArrayList<Integer>> adj, int n , int[] indgree){
     Queue<Integer> que = new LinkedList<>();
     int count = 0;

     for(int i = 0 ; i < n ; i++){
        if(indgree[i] == 0){
            count++;
            que.add(i);
        }
     }
     while(!que.isEmpty()){
        int u = que.poll();
        for(int v : adj.getOrDefault(u, new ArrayList<>())){
            indgree[v]--;
            if(indgree[v] == 0){
                count++;
                que.add(v);
            }
        }
     }
     return count == n;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
        int[] indgree = new int [numCourses];
        for(int[] vec : prerequisites){
            int a = vec[0];
            int b = vec[1];

            adj.computeIfAbsent(b,k -> new ArrayList<>()).add(a);
            indgree[a]++;
        }
        return toposort(adj,numCourses,indgree);
    }
}
