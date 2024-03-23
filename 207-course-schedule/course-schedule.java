class Solution {
    static ArrayList<ArrayList<Integer>> adj;
    static int indegree[];
    static  List<Integer> topo;
    static void getTopo(int num)
    {
        int i;
        Queue<Integer> que = new LinkedList<>();
        for(i=0;i<num;i++)
        {
            if(indegree[i]==0)
                que.add(i);
        }
        while(!que.isEmpty())
        {
            int val=que.remove();
            topo.add(val);
            for(i=0;i<adj.get(val).size();i++)
            {
                int t=adj.get(val).get(i);
                
                indegree[t]-=1;
                if(indegree[t]==0)
                    que.add(t);
            }
        }
    }
    public boolean canFinish(int num, int[][] pre) {
        adj=new ArrayList<>();
        indegree = new int[num];
        topo=new ArrayList<>();

        int i,j;
        for(i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(i=0;i<pre.length;i++)
        {
            int u=pre[i][0];
            int v=pre[i][1];
            indegree[v]+=1;
            adj.get(u).add(v);
        }
        getTopo(num);
        if(topo.size()==num)
            return true;
        return false;
    }
}