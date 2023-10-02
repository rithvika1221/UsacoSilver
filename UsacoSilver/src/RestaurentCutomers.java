import java.io.*;
import java.util.*;

public class RestaurentCutomers {
	public static void main(String[] args) throws IOException
	{
		BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\anildev\\eclipse-workspace\\UsacoSilver\\bin\\input.in"));
		PrintWriter pw = new PrintWriter("C:\\Users\\anildev\\eclipse-workspace\\UsacoSilver\\src\\output.out");

		StringTokenizer st = new StringTokenizer(r.readLine());
		int n = Integer.parseInt(st.nextToken());
		List<Pair> pairList = new ArrayList<Pair>();
		
		for(int i =0; i<n; i++)
		{
			st = new StringTokenizer(r.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b=  Integer.parseInt(st.nextToken());
			
			
			Pair pa = new Pair(a,1);
			Pair pb = new Pair(b,-1);
			
			pairList.add(pa);
			pairList.add(pb);
		}
		
		Collections.sort(pairList);
		

		
		int maxNum=0; 
		int num = 0;
		
		for(Pair pair: pairList)
		{
			if (pair.second == 1)			{
				num += 1;
				if(num>maxNum)
				{
					maxNum = num;
				}
			}
			if (pair.second == -1)			{
				num -= 1;
			}
		}
		
		pw.println(maxNum);
		pw.close();
	}
}

