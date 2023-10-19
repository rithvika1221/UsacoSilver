import java.io.*;
import java.util.*;


public class restaurents {
	
	
	public static void main(String[] args) throws IOException
	{
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		BufferedReader r = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		        PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		 st = new StringTokenizer(r.readLine());
		 for(int i=0; i<n; i++)
		 {
			 int j = Integer.parseInt(st.nextToken());
			 set.add(j);
		 }
		 
		 st = new StringTokenizer(r.readLine());
		 for(int i=0; i<m; i++)
		 {
			 int j = Integer.parseInt(st.nextToken());
			 int s;
			 try
			 {
				  s = set.floor(j);
			 }
			 catch(Exception e)
			 {
				 s=-1;
			 }
			
			 if (s>-1)
			 {
				pw.print(s);
				set.remove(s);
			 }
			 else 
			 {
				 pw.print(-1);
			 }
			 
			 
		 }
		 pw.close();
		
	}

}
