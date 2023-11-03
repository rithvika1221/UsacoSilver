package graphs;

import java.io.*;
import java.util.*;
import java.util.ArrayList;


public class firstGraph {

	public static void main(String[] args) throws IOException {
		graph g= new graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		
		g.print();
		
	}

}

