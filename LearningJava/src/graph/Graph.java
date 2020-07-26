package graph;
import java.util.*;

public class Graph {
	private int V;
	private ArrayList<ArrayList<Integer>> adj;
	
	public Graph(int v) {
		
		V = v;
		adj = new ArrayList<ArrayList<Integer>>(V);
		
		for(int i=0; i<V; i++) {
			adj.add(i, new ArrayList<>());
		}
	}
	
	public void addEdge(int v, int e) {
		adj.get(v).add(e);
	}
	
	public void BFS(int s) {
		boolean visited[] = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(s);
		visited[s] = true;
		
		while(!q.isEmpty()) {
			s = q.remove();
			System.out.print(s+" ");
			
			Iterator<Integer> i = adj.get(s).listIterator();
			
			while(i.hasNext()) {
				int n = i.next();
				
				if(!visited[n]) {
					q.add(n);
					visited[n] = true;
				}
			}
		}
	}
	
	public void DFSvisit(int s) { // reachable vertices
		boolean visited[] = new boolean[V];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(s);
		DFSu(q,visited);
	}
	
	public void DFSu(Queue<Integer> q,boolean [] visited) {
		if(visited[q.peek()]) return;
		
		visited[q.peek()] = true;
		System.out.print(q.peek()+" ");
		
		Iterator<Integer> i = adj.get(q.peek()).listIterator();
		
		while(i.hasNext()) {
			q.add(i.next());
		}
		DFSu(q,visited);
	}
	
}