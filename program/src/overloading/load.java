package overloading;

public class load {
void add()
{
	System.out.println("default");
}
void add(int a,int b)
{
	System.out.println("add (a+b): " +(a+b));
}
void add(int x,float y,double z)
{
	System.out.println("Multiply (x*y*z): " +(x*y*z));
}
class load1
{
	public static void main(String[] args)
	{
		load one=new load();
		one.add();
		one.add(2,54);
		one.add(2,3,4.5);
	}
}
}
