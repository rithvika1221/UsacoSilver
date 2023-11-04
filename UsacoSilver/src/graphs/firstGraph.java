package graphs;

import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class firstGraph {

	public static void main(String[] args) throws IOException {
		graph g= new graph(7);
		g.addEdge(1, 2);
        g.addEdge(1, 3 );
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 6);
       
		
		g.dfs(1);
		
		
	}

}

