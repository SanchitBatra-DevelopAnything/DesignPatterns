package DisjointSet;

import java.util.ArrayList;

public class DisjointSet {
    int[] rank;
    int[] parent;
    int[] size;

    public DisjointSet(int n)
    {

        //size n + 1 lelo for 1 based indexing
        rank = new int[n]; //n+1 would serve 0 based and 1 based indexing both.
        parent = new int[n];
        size = new int[n];

        for(int i=0;i<parent.length;i++) //<= to support 1 based indexing also.
        {
            parent[i] = i;
        }

        for(int i=0;i<size.length;i++)
        {
            size[i] = 1;
        }
    }

    public int findUltimateParent(int node)
    {
        if(node == parent[node])
        {
            return node;
        }

        parent[node] = findUltimateParent(parent[node]); //doing the path compression.
        return parent[node];
    }

    public void unionBySize(int u , int v)
    {
        int pu = findUltimateParent(u);
        int pv = findUltimateParent(v);
        if(pu == pv)
        {
            return;
        }
        if(size[pu] < size[pv])
        {
            parent[pu] = pv;
            size[pv]+=size[pu];
        }
        else
        {
            parent[pv] = pu;
            size[pu]+=size[pv];
        }
    }

    public void unionByRank(int u , int v)
    {
        int pu = findUltimateParent(u);
        int pv = findUltimateParent(v);

        if(pu == pv)
        {
            //they are already in same component , no need to merge
            return;
        }
        if(rank[pu] < rank[pv])
        {
            //pu gets attached to pv
            //rank still remains the same based on tree height (just to understand)
            parent[pu] = pv;
        }
        else if(rank[pv] < rank[pu])
        {
            parent[pv] = pu;
        }
        else
        {
            //rank baraabar
            parent[pv] = pu;
            //pv got attached to pu , increasing rank of pu
            rank[pu]++;
        }
    }
}
