package program;

public class recursion_sample 
{
static int factorial(int n)
{
	if (n>1)
	{
		return n*factorial(n-1);	
	}
		else
		{
		return 1;
        }
}
public static void main(String[] args)
{
	System.out.println("factorail of 7 is :"+factorial(7));
}}