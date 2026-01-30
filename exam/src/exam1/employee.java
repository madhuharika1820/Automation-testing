package exam1;

 class employee1 {
String employee_name1="madhu";
int salary1=50000;
String designation1="trainer";

String employee_name2="harika";
int salary2=60000;
String designation2="developer";
void dis()
{
	System.out.println("name of the employee: "+employee_name1);
	System.out.println("salary of the employee: "+salary1);
	System.out.println("salary of the employee: "+designation1);

}
}
class employee extends employee1
{
	
	void dis()
	{
	super.dis();
	
		System.out.println("name of the employee: "+ employee_name2);
		System.out.println("salary of the employee: "+salary2);
		System.out.println("salary of the employee: "+designation2);
	}
	public static void main(String[] args)	
	{
		employee e=new employee();
		e.dis();
	
	}
		
}