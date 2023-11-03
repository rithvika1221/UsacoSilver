package graphs;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class graph {

	ArrayList<ArrayList<Integer>> graph ;
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
