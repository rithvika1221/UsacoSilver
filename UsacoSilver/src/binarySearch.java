import java.io.*;
import java.util.*;

public class binarySearch {

	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		        PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = -1;
	    int l = 0;
		int r = n - 1;
		while(l<= r)
			
		{
			int m = l + (r-l)/2;
			if (arr[m] == a)
			{
				result = m;
			}
			if (arr[m] > a)
			{
				r = m-1;
			}
			else 
			{
				l = m +1;
			}
			
			
		}
		
		pw.print("Location is:" + result);
		pw.close();
		
	}
}
