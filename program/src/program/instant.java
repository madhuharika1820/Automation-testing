package program;
public class instant 
{
	int id;
	String name;
	final void Display()
	{
		System.out.println("My roll number is" +id);
		System.out.println("My name is" + name);
	}
	public static void main(String[] args)
	{
	instant m=new instant();
	m.id=66;
	m.name="Madhu";
	m.Display();
	}

}

