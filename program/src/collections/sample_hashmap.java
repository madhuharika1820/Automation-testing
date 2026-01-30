package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class sample_hashmap {
public static void main(String[] args)
{
	HashMap<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(0, "monday");
	m1.put(1, "tuesday");
	m1.put(2,"wednesday");
	System.out.println(m1.get(0));
	Set m2=m1.entrySet();
	Iterator it=m2.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("second traverse method");
	for(Entry<Integer, String> entry:m1.entrySet())
	{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
}
}
