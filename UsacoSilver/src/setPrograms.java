     





import java.util.*;
import java.io.*;

public class setPrograms {

	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(100);
		set.add(56);
		
//		Iterator it = set.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(9);
		set2.add(5);
		set2.add(3);
		set2.add(4);
		
//		Iterator it2 = set2.iterator();
//		while(it2.hasNext())
//		{
//			System.out.println(it2.next());
//		}
//		
//		System.out.println(set2.ceiling(5));
//		System.out.println(set2.first());
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(1,100);
		map.put(2,500);
		map.put(9, 800);
		map.put(5, 300);
		map.put(3, 2300);
		map.put(4, 6034);
		
	
		System.out.println(map.higherKey(5));
		System.out.println(map.firstEntry());
	}
}

