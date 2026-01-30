package program;

public class constructor_sample
{
	constructor_sample()
	{
		System.out.println("default");
	}
	constructor_sample(int a, int b)
	{
		System.out.println("a+b= " +(a+b));
	
	}


public static void main(String[] args) {
 constructor_sample c1 =new constructor_sample();
 constructor_sample c2 =new constructor_sample(2,6);
}}
