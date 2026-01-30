package inheritance1;

import java.util.Scanner;
class person 
{
String name;
void getName()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name: ");
	name=sc.nextLine();
	}
}
class scanner1 extends person
{
	int age;
void getAge()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age: ");
	age=sc.nextInt();
	}
void display()
{
	System.out.println("\nDetails:");
	System.out.println("Name:"+name);
	System.out.println("Age: " +age);
}

public static void main(String[] args)
{
	scanner1 s=new scanner1();
			s.getName();
	        s.getAge();
	        s.display();
}
}