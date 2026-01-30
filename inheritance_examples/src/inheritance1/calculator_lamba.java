package inheritance1;

interface IntegerMath
{
	int operation(int a,int b);
}
public class calculator_lamba
{
	public int operateBinary(int a,int b,IntegerMath op)
	{
		return op.operation(a, b);
	}
	public static void main(String[] args)
	{
		calculator_lamba myapp=new calculator_lamba ();
		IntegerMath addition =(a,b)->a+b;
		IntegerMath subtraction =(a,b)->a-b;
		System.out.println("34+2= "+ myapp.operateBinary(34,2,addition));
		System.out.println("34-10= "+ myapp.operateBinary(34,2,subtraction));

	}
}
