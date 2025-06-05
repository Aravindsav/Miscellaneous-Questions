//Total Paths from src to dest usign dp approach . Very Important to revise


class Solution {
    
    int count =0;
  
    public int helper(ArrayList<Integer> graph[],int src,int dest,int dp[]){
        
        if(src==dest){
          return 1;
        }
        if(dp[src]!=-1){
            return dp[src];
        }
        int totalPaths =0;
        for(int i =0 ;i<graph[src].size();i++){
            int d = graph[src].get(i);
            totalPaths+=helper(graph,d,dest,dp);
            
        }
        return dp[src]= totalPaths;
       
    }
    
    
    public int countPaths(int[][] edges, int V, int src, int dest) {
        // Code here
        int dp[] = new int[V];
        ArrayList<Integer> graph[] =new ArrayList[V];
       for(int i =0;i<V;i++){
           graph[i] = new ArrayList<>();
       }
       for(int i =0;i<edges.length;i++){
           int s = edges[i][0];
           int d = edges[i][1];
           graph[s].add(d);
       }
       Arrays.fill(dp,-1);
       helper(graph,src,dest,dp);
       
       return dp[src];
    }
}
