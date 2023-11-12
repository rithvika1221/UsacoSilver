package graphs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CCSki {

	static int[][] elevations = new int[500][500];
	static int[][] wayPoints = new int[500][500];
	static boolean[][] visited = new boolean[500][500];
	static int m, n;

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(
				new FileReader("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/input.txt"));
		PrintWriter pw = new PrintWriter("/Users/anilkumardevisetti/git/UsacoSilver/UsacoSilver/src/output.txt");

		StringTokenizer st = new StringTokenizer(r.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(r.readLine());
			for (int j = 0; j < n; j++) {

				elevations[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(r.readLine());
			for (int j = 0; j < n; j++) {

				wayPoints[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int min = 0;
		int max = 1000000000;
		int mid = 0;

		while (min <= max) {
			mid = min + (max - min) / 2;

			if (canReachWayPoints(mid,m,n))
			{
				max = mid - 1;
			}
			else
			{
				min = mid + 1; 
			}
		}
		
		pw.println(mid);
		pw.close();

	}

	public static boolean canReachWayPoints(int mid, int m, int n) {
		visited = new boolean[500][500];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (wayPoints[i][j] == 1) {
					dfs(i, j, mid);

					for (int x = 0; x < m; x++) {
						for (int y = 0; y < n; y++) {
							if (wayPoints[x][y] == 1 && !visited[x][y])
								return false;
						}
					}

					return true;
				}

			}
		}
		return false;
	}

	public static void dfs(int i, int j, int mid) {

		if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] == true) {
			return;
		}

		visited[i][j] = true;

		if ( i-1>=0 && Math.abs(elevations[i][j] - elevations[i - 1][j]) <= mid) {
			dfs(i - 1, j, mid);
		}
		if (i+1 <m && Math.abs(elevations[i][j] - elevations[i + 1][j]) <= mid) {
			dfs(i + 1, j, mid);
		}
		if (j-1>=0 && Math.abs(elevations[i][j] - elevations[i][j - 1]) <= mid) {
			dfs(i, j - 1, mid);
		}
		if (j+1< n &&Math.abs(elevations[i][j] - elevations[i][j + 1]) <= mid) {
			dfs(i, j + 1, mid);
		}

	}

}
