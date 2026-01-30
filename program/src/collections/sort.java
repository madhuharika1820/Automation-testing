package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
public static void main(String[] args)
{
	List<Integer> m=new ArrayList<Integer>();
	//String s[]=new String[66];
	List<String> m1=new ArrayList<String>();
     m1.add("madhu");
     m1.add("harika");
     m1.add("yerroju");
     Collections.sort(m1);
 	 System.out.println("sort numbers: "+m1);
     Collections.sort(m1,Collections.reverseOrder());
     System.out.println("sort numbers of reverseOrder: "+m1);
    //List m=new ArrayList();
	m.add(10);
	m.add(23);
	m.add(9);
	m.add(100);
	Collections.sort(m);
	System.out.println("sort numbers: "+m);
    Collections.sort(m,Collections.reverseOrder());
    System.out.println("sort numbers of reverseOrder: "+m);
}
}
