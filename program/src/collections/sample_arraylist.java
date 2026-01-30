package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class sample_arraylist {
public static void main(String[] args)
{
	String s[]=new String[66];
	List m=new ArrayList();
	m.add("madhu");
	m.add(56);
	List<Integer> m1=new ArrayList<Integer>();
	m1.add(45);
	m1.add(54);
	System.out.println(m.get(0));
	System.out.println(m1.get(1));
	for (int i=0;i<m1.size();i++)
	{
		System.out.println(m1.get(i));
	}
	for(Integer n:m1)
	{
		System.out.println(n);
	}
	List m2 =new ArrayList();
	m2.add("Yerroju");
	m2.add("harika");
	m2.add("apple");
	m2.add("zebra");
	m2.add("ball");
	for(int j=0;j<m2.size();j++)
	{
		System.out.println(m2.get(j));
	}
		Collections.sort(m2);
		Collections.sort(m2,Collections.reverseOrder());

		System.out.println("sort numbers: "+m2);
		System.out.println("sort numbers of reverseOrder: "+m2);

}
}
