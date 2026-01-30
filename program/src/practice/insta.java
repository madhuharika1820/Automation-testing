package practice;

abstract class madhu
{
	abstract void dis();

void man()
{
	System.out.println("iam in class man");
}}
class insta extends madhu
{
	void dis()
	{
		System.out.println("iam in class insta");
	}
	public static void main(String[] args)
	{
		insta i=new insta();
		i.man();
		i.dis();
	}
}