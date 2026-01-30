package collections;


import java.util.HashSet;
import java.util.Iterator;
public class example_hashtag 
{
public static void main(String[] args) 
{
HashSet<String>hs =new HashSet<String>();
hs.add("Madhu");
hs.add("Yerroju");
hs.add("Harika");
System.out.println(hs);
System.out.println(hs.remove("Yerroju"));
System.out.println(hs);
System.out.println(hs.isEmpty());
System.out.println(hs.size());

//traverse the elements by loop
for(String out:hs)
{
	System.out.println(out);
}
//traverse the elements by iterator
Iterator<String> m1=hs.iterator();
while(m1.hasNext())
	System.out.println(m1.next());
//lambda
hs.forEach(m->System.out.println(m));
}}
