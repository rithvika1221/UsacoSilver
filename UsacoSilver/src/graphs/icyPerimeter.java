package graphs;

import java.io.*;
import java.util.*;

public class icyPerimeter {

	int v = 0;
	static char[][] arr;
	static boolean[][] visited;
	static int[] area = new int[1000000];
	static int[] peremiter = new int[1000000];
	static int tempPeri = 0;
	static int temparea = 0;
	static int temp = 0;

	public static void ff(char[][] arr, int rows, int columns, int sr, int sc) {
		if (sr < 0 || sr >= rows || sc < 0 || sc >= columns) {

			tempPeri++;
			return;
		}
		if (visited[sr][sc]) {
			return;
		}

		if (sr >= 0 && sr < rows && sc >= 0 && sc < columns && arr[sr][sc] == '.') {
			tempPeri++;
			return;
		}

		visited[sr][sc] = true;
		temparea++;

		ff(arr, rows, columns, sr + 1, sc);
		ff(arr, rows, columns, sr - 1, sc);
		ff(arr, rows, columns, sr, sc - 1);
		ff(arr, rows, columns, sr, sc + 1);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());

		arr = new char[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(r.readLine());
			arr[i] = st.nextToken().toCharArray();

		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				tempPeri = 0;
				temparea = 0;

				if (visited[i][j] != true && arr[i][j] == '#') {
					ff(arr, n, n, i, j);
				}
				area[temp] = temparea;
				peremiter[temp] = tempPeri;
				temp++;
			}
		}
		int tempArea=0;
		int maxArea =0;
		int maxPerm = 0;
		for (int i = 0; i < 1000000; i++) 
		{
			tempArea=area[i];
			if(tempArea>maxArea)
			{
				maxArea = tempArea;
				maxPerm = peremiter[i];
			}
			if(maxArea == tempArea)
			{
				if(peremiter[i]>maxPerm)
				{
					maxPerm = peremiter[i];
				}
			}
			
		}
		
		pw.println(maxArea + " " + maxPerm);
		pw.close();
	}

}
