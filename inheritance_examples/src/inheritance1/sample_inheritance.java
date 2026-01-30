package inheritance1;

public class sample_inheritance {
	
	float salary=10000;
	}
	class example2 extends sample_inheritance
	{
		int ot=5000;
		public static void main(String[] args)
		{
			example2 ex=new example2();
			System.out.println("my salary is: "+ex.salary);
			System.out.println("my ot money is " +ex.ot);
		}
	}

