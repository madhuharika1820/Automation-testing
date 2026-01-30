package inheritance1;

abstract class abs_sample 
{
	abstract void display() ;
}
class two extends abs_sample 
{
	void display()
	{
		System.out.println("Iam madhu");
	}
}
class abstract_sample extends two
{
	void plan()
	{
		System.out.println("Iam planned");
	}
public static void main(String[] args)
{
	abstract_sample obj=new abstract_sample();
	obj.plan();
	obj.display();
	
}
}