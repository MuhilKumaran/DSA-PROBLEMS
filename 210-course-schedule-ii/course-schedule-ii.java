class Solution {
    public int[] findOrder(int num, int[][] pre) {
        ArrayList<ArrayList<Integer>>  adj=new ArrayList<>();
        int[] res = new int[num];
        int indegree[]=new int[num];

        int ind=num-1;;
        int i;
        for(i=0;i<num;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(i=0;i<pre.length;i++)
        {
            int u=pre[i][0];
            int v=pre[i][1];
            indegree[v]++;
            adj.get(u).add(v);
        }

        for(i=0;i<indegree.length;i++)
            System.out.println(i+" "+indegree[i]);
        Queue<Integer> que = new LinkedList<>();        
        for(i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
                que.add(i);
        }
        while(!que.isEmpty())
        {
            int val=que.remove();
            res[ind--]=val;
            for(i=0;i<adj.get(val).size();i++)
            {                
                int t=adj.get(val).get(i);                
                indegree[t]-=1;
                if(indegree[t]==0)
                    que.add(t);
            }
        }
        if(ind==-1)
            return res;
        int arr[] = new int[0];
        return arr;

    }
}