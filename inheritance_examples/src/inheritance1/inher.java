package inheritance1;

class inher 
{
void parent() 
{
	System.out.println("I am madhu");
}}
class inher1 extends inher
{
	void child()
	{
		System.out.println("she is beautiful");
	}
}
	class test
	{
		public static void main(String[] args)
		{
		inher1 one= new inher1();
		one.parent();
		one.child();
			
		}
	}




