package program;

public class local 
{
public void Age()
{
	int age=9;
	age=age+14;
	System.out.println("My age is " + age);
}
public void vennaAge()
{
	int age=12;
	age=age+23;
	System.out.println("venna age is " + age);
}
public static void main(String[] agrs)
{
	local l=new local();
	l.Age();
	l.vennaAge();
}
}
