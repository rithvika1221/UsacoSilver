
public class Pair implements Comparable<Pair>
{
	int first;
	int second;
	
	Pair(int first, int second)
	{
		this.first = first;
		this.second = second;
		//Hello
	}
	
	@Override
	public int compareTo(Pair o)
	{
		if(this.first == o.first)
		{
			return Integer.compare(this.second, o.second);
		}
		
		return Integer.compare(this.first, o.first);
	}
	
	
}