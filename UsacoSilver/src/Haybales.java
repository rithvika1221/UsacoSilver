import java.io.*;
import java.util.*;

public class Haybales {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		        PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");		
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int baleNum = Integer.parseInt(st.nextToken());
		int queryNum = Integer.parseInt(st.nextToken());
		int[] bales = new int[baleNum];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < baleNum; i++) {
			bales[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(bales);
		for (int i = 0; i < queryNum; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			// Get the left-est bale that's still in the interval
			int bi = Arrays.binarySearch(bales, start);
			if (bi < 0) { bi = Math.abs(bi + 1); }

			// And also get the right-est bale that's still in the interval
			int ti = Arrays.binarySearch(bales, end);
			if (ti < 0) { ti = Math.abs(ti + 2); }
			pw.println(ti - bi + 1);
		}
		pw.close();
	}
}

