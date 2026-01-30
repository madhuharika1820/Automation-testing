package practice;

public class encap {
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
	 encap e=new encap();
	 e.setname("madhu");
	 System.out.println(e.getname());
 }
}