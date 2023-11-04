package graphs;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class graph {

	ArrayList<ArrayList<Integer>> graph = new 	ArrayList<ArrayList<Integer>>();
	int V;

	public graph(int nodes) {
		V = nodes;

		for (int i = 0; i < nodes; i++) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			graph.add(a);
		}
	}

	public void addEdge(int v, int u) {
		graph.get(v).add(u);
		graph.get(u).add(v);

	}
	
	public void dfs(int i)
	{
		HashSet<Integer> visited = new HashSet();
		Stack<Integer> stack = new Stack();
		stack.push(i);
		
		
		while(!stack.isEmpty())
		{
			int v = stack.pop();
			if (!visited.contains(v))
			{
				visited.add(v);
				System.out.println(v);
			}
			
			for(int j: graph.get(v)){
				if(!visited.contains(j))
				{
					stack.push(j);
				}
				
			}
			
			
		}
		
		
	}
	
	
	public void bfs(int i)
	{
		HashSet<Integer> visited2 = new HashSet();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(i);
				
		while(!queue.isEmpty())
		{
			int vi = queue.poll();
			if (!visited2.contains(vi))
			{
				visited2.add(vi);
				System.out.println(vi);
			}
			
			for(int j: graph.get(vi))
			{
				queue.add(j);
				
			}
				
		}
		
	}

	public void print() {
		for(int i =0; i<V; i++) {   
			System.out.println("Node " + i);
			
		for (int x: graph.get(i))
		{
			System.out.println("->" + x);
		}
		System.out.println();
		}
	}
}
