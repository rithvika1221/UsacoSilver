package graphs;

import java.io.*;
import java.util.*;

public class floodFill
{
	
	
	public  void ff(int[][] im, int rows, int columns, 
			int newColor, int source, int sr, int sc)
	{
		if (sr<0 || sr>=rows || sc<0 || sc>=columns || im[sr][sc] != source )
		{
			return;
		}
		im[sr][sc] = newColor;
		
		ff(im,rows,columns,newColor,source,sr--,sc);
		ff(im,rows,columns,newColor,source,sr++,sc);
		ff(im,rows,columns,newColor,source,sr,sc--);
		ff(im,rows,columns,newColor,source,sr,sc++);
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader r = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		        PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");

		StringTokenizer st = new StringTokenizer(r.readLine());
		int sr = Integer.parseInt(st.nextToken());
		int sc = Integer.parseInt(st.nextToken());
		int newColor = Integer.parseInt(st.nextToken());
		int source = Integer.parseInt(st.nextToken());
		int[][] im = new int[3][3];
		
		
		 for(int i=0; i<3; i++)
		 {
			 st = new StringTokenizer(r.readLine());

			 for(int j=0; j<3; j++)
			 {
				 im[i][j] = Integer.parseInt(st.nextToken());
				 
			 }
		 }
		 
		 floodFill f = new floodFill();
		 f.ff(im, 3, 3, newColor, source, sr, sc);
		 
		 for(int i=0; i<3; i++)
		 {
			 for(int j=0; j<3; j++)
			 {
				 pw.print(im[i][j] + " ,");
				 
				 
			 }
			 pw.println();
		 }
		 
		pw.close();
	}

}