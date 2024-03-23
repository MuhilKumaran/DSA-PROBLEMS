class Solution 
{
    static boolean visited[];
    static ArrayList<ArrayList<Integer>> adj;
    static void bfs(int s)
    {
        Queue<Integer> que = new LinkedList<>();
        visited[s]=true;
        que.add(s);
        while(!que.isEmpty())
        {
            int val=que.remove();
            for(int i=0;i<adj.get(val).size();i++)
            {
                if(!visited[adj.get(val).get(i)])
                {
                    visited[adj.get(val).get(i)]=true;
                    que.add(adj.get(val).get(i));
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int src, int dst) 
    {
        if(src==dst)
            return true;

        visited=new boolean[n];
        adj=new ArrayList<>();
        int i;
        for(i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        bfs(src);    
        return visited[src]&&visited[dst];
    }
}

