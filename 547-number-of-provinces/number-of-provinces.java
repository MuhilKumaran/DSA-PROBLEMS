class Solution {
    public int findCircleNum(int[][] mat) {
        int ans=0,n=mat.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(i,visited,mat);
            }
        }
        return ans;
    }
    public void dfs(int val,boolean[] visited,int[][] mat){
        visited[val]=true;
        for(int i=0;i<mat.length;i++){
            if(!visited[i]) 
                if(mat[val][i]==1) 
                dfs(i,visited,mat);
        }
    }
}