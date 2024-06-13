import java.util.LinkedList;
import java.util.ArrayList;

class Graphi
{
    int vertices;
    int[][] adj;
    LinkedList<Integer>[] adjList;
    Graphi(int vertices)
    {
        this.vertices=vertices;
        adj=new int[vertices][vertices];
        adjList=new LinkedList[vertices];
        for(int i=0;i<adjList.length;i++)
            adjList[i]=new LinkedList<Integer>();
    }
    void add(int src,int dest)
    {
        adjList[src].addFirst(dest);
    }
    void addEdge(int src,int dest)
    {
        adj[src][dest]=1;
        adj[dest][src]=1;
    }
    void print()
    {
        for(int i[]:adj)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
    void dfs(int start)
    {
        boolean visited[]=new boolean[vertices];
        dfsUtil2(start,visited);
    }
     void dfsUtil(int start, boolean[] visited) {
        visited[start]=true;
        System.out.print(start+" ");
        for(int i=0;i<vertices;i++)
            if(visited[i]==false && adj[start][i]==1)
                dfsUtil(i, visited);
    }
    void bfs(int start)
    {
        boolean visited[]=new boolean[vertices];
        LinkedList<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        while (!q.isEmpty()) {
            start=q.poll();
            System.out.print(start+" ");
            for(int i=0;i<vertices;i++)
            {
                if(!visited[i] && adj[start][i]==1)
                {
                    visited[i]=true;
                    q.add(i);
                }
            }
            
        }
    }
    void dfsUtil2(int start, boolean[] visited )
    {
        visited[start]=true;
        System.out.print(start+" ");
        for(int adj:adjList[start])
        {
            if(!visited[adj] )
                dfsUtil2(adj, visited);
        }
    }
    void bfs2(int start)
    {
        boolean visited[]=new boolean[vertices];
        LinkedList<Integer> q=new LinkedList<>();
        visited[start]=true;
        q.add(start);
        while (!q.isEmpty()) {
            start=q.poll();
            System.out.print(start+" ");
            for(int adj:adjList[start])
                if(!visited[adj])
                {
                    visited[adj]=true;
                    q.add(adj);
                }
        }
    }
    void paths(int start,int end)
    {
        boolean visited[]=new boolean[vertices];
        ArrayList<Integer> ar=new ArrayList<>();
        dfspath2(start,end,visited,ar); 
    }
    void dfspath(int start,int end,boolean[] visited)
    {
        if(start!=end)
        {
            visited[start]=true;
            System.out.print(start+"->");
            for(int adj:adjList[start])
            {
                if(!visited[adj] )
                  dfspath(adj, end, visited);
            }
        }
        else
            {
                System.out.println(end);
                System.out.println("|");
                System.out.println("v");
                System.out.print(" ");
            }
    }
    void dfspath2(int start,int end,boolean[] visited,ArrayList<Integer> ar)
    {
        if(start!=end)
        {
            visited[start]=true;
            ar.add(start);
            for(int adj:adjList[start])
            {
                if(!visited[adj] )
                  dfspath2(adj, end, visited,ar);
            }
        }
        else
        {
            ar.add(start);
            System.out.println(ar);
            for(int i=0;i<ar.size();i++)
                ar.remove(1);
        }
    }
    public void findAllPaths(int src,int des,boolean[] visited,ArrayList<Integer> paths){
        if(src==des){
            System.out.println(paths);
            return;
        }
        visited[src]=true;
        for(int AdjNode:adjList[src]){
            if(!visited[AdjNode]){
                paths.add(AdjNode);
                findAllPaths(AdjNode, des, visited, paths);
                paths.remove(paths.size()-1);
            }

        }
        visited[src]=false;

    }
    void findPaths(int src,int des){
        boolean visited[]=new boolean[vertices];
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(src);
        findAllPaths(src, des, visited, lis);
    }
   }
public class pathss{
    public static void main(String[] args) {
        Graphi g=new Graphi(5);
        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 3);
        g.add(2, 3);
        g.add(3, 0);
        g.add(3, 4);
        g.add(4, 1);
        g.add(0,3);
        g.add(0,4);
        g.add(4,3);
        // g.paths(0, 3);
        g.findPaths(0, 3);
        
    }
}
