package inheritance1;

public class encapsulation
{
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String newname)
	{
		this.name=newname;
	}
public static void main(String[] args)
{
	encapsulation encap=new encapsulation();
	encap.setname("madhu");
	System.out.println(encap.getname());
}}




