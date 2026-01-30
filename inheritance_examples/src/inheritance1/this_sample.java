package inheritance1;

public class this_sample {
int x,y;
this_sample(int x,int y)
{
	this.x=x;
	this.y=y;
	System.out.println("The value of x: " +x);
	System.out.println("The value of y: "+y);
}
void dis()
{
	int x=2;
	int y=6;
	System.out.println("the local var of x :"+x);
	System.out.println("the local var of y : "+y);
}
public static void main(String[] args)
{
	this_sample s=new this_sample(3,5);
	s.dis();
}
}
