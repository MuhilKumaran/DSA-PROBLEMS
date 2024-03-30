class Pair
{
    int v;
    int w;
    Pair(int v,int w)
    {
        this.v=v;
        this.w=w;
    }
}

class Triplet
{
    int stop;
    int node;
    int weight;

    Triplet(int stop,int node,int weight)
    {
        this.stop=stop;
        this.node=node;
        this.weight=weight;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] fli, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        int dist[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            dist[i]=Integer.MAX_VALUE;
        }
        for(i=0;i<fli.length;i++)
        {
            adj.get(fli[i][0]).add(new Pair(fli[i][1],fli[i][2]));
        }
        dist[src]=0;
        Queue<Triplet> qu = new LinkedList<>();
        qu.add(new Triplet(0,src,0));
        while(!qu.isEmpty())
        {
            Triplet temp=qu.remove();
            int st=temp.stop;
            int no=temp.node;
            int we=temp.weight;
            if(st>k)
            {
                continue;
            }
            for(Pair pr : adj.get(no))
            {
                int v1=pr.v;
                int w1=pr.w;
                if(we+w1<dist[v1] && st<=k)
                {
                    dist[v1]=we+w1;
                    qu.add(new Triplet(st+1,v1,dist[v1]));
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE)
            return -1;
        return dist[dst];
    }
}