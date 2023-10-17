import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class sumNums {

	public static void main(String[] args) throws IOException {
		
		//java
		/*BufferedReader r = new BufferedReader(
				new FileReader("C:\\Users\\anildev\\eclipse-workspace\\UsacoSilver\\bin\\input.in"));
		PrintWriter pw = new PrintWriter("C:\\Users\\anildev\\eclipse-workspace\\UsacoSilver\\src\\output.out");*/
		
		BufferedReader r = new BufferedReader(
		new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
        PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");
        
        pw.print("Hello Rithvika");
		

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(r.readLine());
		for (int i = 0; i < n; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
	    Arrays.sort(arr);
		
		int i = 0;
		int j = n-1;
		
		
		while (i<j)
		{
			if (arr[i] + arr[j] == m)
			{
				pw.print(arr[i]);
				pw.print(" ");
				pw.print(arr[j]);
				break;
			}
			if (arr[i] + arr[j] < m)
			{
				i++;
				
			}
			if (arr[i] + arr[j] > m)
			{
				j--;
			}
		}
		
		
		pw.close();
	}


}
