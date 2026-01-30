package inheritance1;

public class ride {
void dis()
{
	System.out.println("my name is madhu");
}
void play()
{
	System.out.println("Iam working in TCS");
}
}
class ride1 extends ride
{
	void dis()
	{
		System.out.println("Iam so gorgeous");
	}
}
class override
{
	public static void main(String[] args)
	{
		ride1 one=new ride1();
		one.dis();
		one.play();
	}
}
